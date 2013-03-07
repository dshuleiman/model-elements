/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * PeMS sensor data map, organized by VDS. */
public class PeMSMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PeMSMap\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* PeMS sensor data map, organized by VDS.\",\"fields\":[{\"name\":\"pems\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"PeMS\",\"doc\":\"* PeMS sensor datum as output by PeMS filter, for a specific\\n   * station and time.\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"densityError\",\"type\":[\"double\",\"null\"]},{\"name\":\"speed\",\"type\":[\"double\",\"null\"]},{\"name\":\"speedError\",\"type\":[\"double\",\"null\"]},{\"name\":\"freeFlowSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"funcLoopFact\",\"type\":[\"double\",\"null\"]},{\"name\":\"gFactorLane\",\"type\":{\"type\":\"array\",\"items\":[\"double\",\"null\"]}}]},\"avro.java.string\":\"String\"},\"doc\":\"* Key is VDS id. Represents the state of the sensors at\\n     * one point in time.\"}]}");
  /** * Key is VDS id. Represents the state of the sensors at
     * one point in time. */
  @Deprecated public java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS> pems;

  /**
   * Default constructor.
   */
  public PeMSMap() {}

  /**
   * All-args constructor.
   */
  public PeMSMap(java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS> pems) {
    this.pems = pems;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return pems;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: pems = (java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'pems' field.
   * * Key is VDS id. Represents the state of the sensors at
     * one point in time.   */
  public java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS> getPems() {
    return pems;
  }

  /**
   * Sets the value of the 'pems' field.
   * * Key is VDS id. Represents the state of the sensors at
     * one point in time.   * @param value the value to set.
   */
  public void setPems(java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS> value) {
    this.pems = value;
  }

  /** Creates a new PeMSMap RecordBuilder */
  public static edu.berkeley.path.model_elements_base.PeMSMap.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.PeMSMap.Builder();
  }
  
  /** Creates a new PeMSMap RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.PeMSMap.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSMap.Builder other) {
    return new edu.berkeley.path.model_elements_base.PeMSMap.Builder(other);
  }
  
  /** Creates a new PeMSMap RecordBuilder by copying an existing PeMSMap instance */
  public static edu.berkeley.path.model_elements_base.PeMSMap.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSMap other) {
    return new edu.berkeley.path.model_elements_base.PeMSMap.Builder(other);
  }
  
  /**
   * RecordBuilder for PeMSMap instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PeMSMap>
    implements org.apache.avro.data.RecordBuilder<PeMSMap> {

    private java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS> pems;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.PeMSMap.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.PeMSMap.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing PeMSMap instance */
    private Builder(edu.berkeley.path.model_elements_base.PeMSMap other) {
            super(edu.berkeley.path.model_elements_base.PeMSMap.SCHEMA$);
      if (isValidValue(fields()[0], other.pems)) {
        this.pems = (java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS>) data().deepCopy(fields()[0].schema(), other.pems);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'pems' field */
    public java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS> getPems() {
      return pems;
    }
    
    /** Sets the value of the 'pems' field */
    public edu.berkeley.path.model_elements_base.PeMSMap.Builder setPems(java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS> value) {
      validate(fields()[0], value);
      this.pems = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'pems' field has been set */
    public boolean hasPems() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'pems' field */
    public edu.berkeley.path.model_elements_base.PeMSMap.Builder clearPems() {
      pems = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public PeMSMap build() {
      try {
        PeMSMap record = new PeMSMap();
        record.pems = fieldSetFlags()[0] ? this.pems : (java.util.Map<java.lang.String,edu.berkeley.path.model_elements_base.PeMS>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}