/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements;

import java.util.*;
import org.joda.time.Interval;
import java.util.Map.Entry;

public class FDSet extends edu.berkeley.path.model_elements_base.FDSet {
  /**
   * Slice off an interval of time and return the matching items as a FDMap.
   * If, for a given link, the time interval contains more than one FD,
   * ignore all but the last. (This method does not change the FDSet.)
   * If the interval is disjoint from the profile interval, then use the
   * first item (if the interval is earlier) or the last item (if later).
   **/
  public FDMap slice(Interval interval) {
    FDMap fdMap = new FDMap();
    
    for (Entry<String, FDProfile> entryForLink : getProfileMap().entrySet()) {
      String linkId = entryForLink.getKey();
      FDProfile profile = entryForLink.getValue();
      Double dt = profile.getSampleRate(); // defaults?
      Double t0 = profile.getStartTime(); // defaults?
      List<FD> timeSeries = profile.getFdList();
      Integer nSamples = timeSeries == null ? 0 : timeSeries.size();
      
      if (nSamples == 0) {
        fdMap.getFdMap().put(linkId, null);
        continue;
      }
      
      org.joda.time.DateTime midnight = interval.getStart().withTimeAtStartOfDay(); // DST?
      org.joda.time.DateTime dataStart = midnight.plusSeconds((int)Math.round(t0));
      org.joda.time.DateTime dataEnd = dataStart.plusSeconds((int)Math.round(dt * (nSamples-1)));
      Interval dataInterval = new Interval(dataStart, dataEnd);
      Interval overlap = dataInterval.overlap(interval);
      
      Integer index;
      if (overlap == null) {
        if (interval.isBefore(dataInterval)) {
          index = 0;
        }
        else {
          index = nSamples-1;
        }
      }
      else {
        org.joda.time.DateTime dataFound = overlap.getEnd();
        org.joda.time.Duration timeFromStart = 
         (new Interval(dataStart, dataFound)).toDuration();
        Double steps = timeFromStart.getMillis() / (1000 * dt);
        index = (int)Math.round(steps);
        
        if (index < 0) {
          index = 0;
        }
        else if (index > nSamples-1) {
          index = nSamples-1;
        }
      }
      
      FD fdAtTime = timeSeries.get(index);
      fdMap.getFdMap().put(linkId, fdAtTime);
    }
  
    return fdMap;
  }
  
  // TODO find a better way to expose Map<> access.
  
  /**
   * Set the profile map. Same as setProfile(), but works with a map of String to FDProfile.
   */
  @SuppressWarnings("unchecked")
  public void setProfileMap(Map<String,FDProfile> value) {
    setProfile((Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile>)(Map<?,?>)value);
  }

  /**
   * Get the profile map. Same as getProfile(), but works with a map of String to FDProfile.
   * Never returns null (creates the map if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
  public Map<String,FDProfile> getProfileMap() {
    if (null == getProfile()) {
      setProfile(new HashMap<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile>());
    }
    return (Map<String,FDProfile>)(Map<?,?>)getProfile();
  }
  
  public Long getLongId() {
    return Long.parseLong(getId().toString());
  }
  
  public void setId(Long id) {
    setId(id.toString());
  }
}
