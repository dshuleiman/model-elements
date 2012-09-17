/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements;  
@SuppressWarnings("all")
public class Link extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Link\",\"namespace\":\"edu.berkeley.path.model_elements\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":\"double\"},{\"name\":\"length\",\"type\":\"double\"},{\"name\":\"laneOffset\",\"type\":\"int\",\"default\":0},{\"name\":\"begin\",\"type\":{\"type\":\"record\",\"name\":\"NodeRef\",\"fields\":[{\"name\":\"nodeId\",\"type\":\"string\"}]}},{\"name\":\"end\",\"type\":\"NodeRef\"}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence type;
  @Deprecated public double laneCount;
  @Deprecated public double length;
  @Deprecated public int laneOffset;
  @Deprecated public edu.berkeley.path.model_elements.NodeRef begin;
  @Deprecated public edu.berkeley.path.model_elements.NodeRef end;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return type;
    case 3: return laneCount;
    case 4: return length;
    case 5: return laneOffset;
    case 6: return begin;
    case 7: return end;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: type = (java.lang.CharSequence)value$; break;
    case 3: laneCount = (java.lang.Double)value$; break;
    case 4: length = (java.lang.Double)value$; break;
    case 5: laneOffset = (java.lang.Integer)value$; break;
    case 6: begin = (edu.berkeley.path.model_elements.NodeRef)value$; break;
    case 7: end = (edu.berkeley.path.model_elements.NodeRef)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'laneCount' field.
   */
  public java.lang.Double getLaneCount() {
    return laneCount;
  }

  /**
   * Sets the value of the 'laneCount' field.
   * @param value the value to set.
   */
  public void setLaneCount(java.lang.Double value) {
    this.laneCount = value;
  }

  /**
   * Gets the value of the 'length' field.
   */
  public java.lang.Double getLength() {
    return length;
  }

  /**
   * Sets the value of the 'length' field.
   * @param value the value to set.
   */
  public void setLength(java.lang.Double value) {
    this.length = value;
  }

  /**
   * Gets the value of the 'laneOffset' field.
   */
  public java.lang.Integer getLaneOffset() {
    return laneOffset;
  }

  /**
   * Sets the value of the 'laneOffset' field.
   * @param value the value to set.
   */
  public void setLaneOffset(java.lang.Integer value) {
    this.laneOffset = value;
  }

  /**
   * Gets the value of the 'begin' field.
   */
  public edu.berkeley.path.model_elements.NodeRef getBegin() {
    return begin;
  }

  /**
   * Sets the value of the 'begin' field.
   * @param value the value to set.
   */
  public void setBegin(edu.berkeley.path.model_elements.NodeRef value) {
    this.begin = value;
  }

  /**
   * Gets the value of the 'end' field.
   */
  public edu.berkeley.path.model_elements.NodeRef getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(edu.berkeley.path.model_elements.NodeRef value) {
    this.end = value;
  }

  /** Creates a new Link RecordBuilder */
  public static edu.berkeley.path.model_elements.Link.Builder newBuilder() {
    return new edu.berkeley.path.model_elements.Link.Builder();
  }
  
  /** Creates a new Link RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements.Link.Builder newBuilder(edu.berkeley.path.model_elements.Link.Builder other) {
    return new edu.berkeley.path.model_elements.Link.Builder(other);
  }
  
  /** Creates a new Link RecordBuilder by copying an existing Link instance */
  public static edu.berkeley.path.model_elements.Link.Builder newBuilder(edu.berkeley.path.model_elements.Link other) {
    return new edu.berkeley.path.model_elements.Link.Builder(other);
  }
  
  /**
   * RecordBuilder for Link instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Link>
    implements org.apache.avro.data.RecordBuilder<Link> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence type;
    private double laneCount;
    private double length;
    private int laneOffset;
    private edu.berkeley.path.model_elements.NodeRef begin;
    private edu.berkeley.path.model_elements.NodeRef end;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements.Link.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements.Link.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Link instance */
    private Builder(edu.berkeley.path.model_elements.Link other) {
            super(edu.berkeley.path.model_elements.Link.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.laneCount)) {
        this.laneCount = (java.lang.Double) data().deepCopy(fields()[3].schema(), other.laneCount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.length)) {
        this.length = (java.lang.Double) data().deepCopy(fields()[4].schema(), other.length);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.laneOffset)) {
        this.laneOffset = (java.lang.Integer) data().deepCopy(fields()[5].schema(), other.laneOffset);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.begin)) {
        this.begin = (edu.berkeley.path.model_elements.NodeRef) data().deepCopy(fields()[6].schema(), other.begin);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.end)) {
        this.end = (edu.berkeley.path.model_elements.NodeRef) data().deepCopy(fields()[7].schema(), other.end);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements.Link.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements.Link.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements.Link.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements.Link.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.CharSequence getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public edu.berkeley.path.model_elements.Link.Builder setType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public edu.berkeley.path.model_elements.Link.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'laneCount' field */
    public java.lang.Double getLaneCount() {
      return laneCount;
    }
    
    /** Sets the value of the 'laneCount' field */
    public edu.berkeley.path.model_elements.Link.Builder setLaneCount(double value) {
      validate(fields()[3], value);
      this.laneCount = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'laneCount' field has been set */
    public boolean hasLaneCount() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'laneCount' field */
    public edu.berkeley.path.model_elements.Link.Builder clearLaneCount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'length' field */
    public java.lang.Double getLength() {
      return length;
    }
    
    /** Sets the value of the 'length' field */
    public edu.berkeley.path.model_elements.Link.Builder setLength(double value) {
      validate(fields()[4], value);
      this.length = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'length' field has been set */
    public boolean hasLength() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'length' field */
    public edu.berkeley.path.model_elements.Link.Builder clearLength() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'laneOffset' field */
    public java.lang.Integer getLaneOffset() {
      return laneOffset;
    }
    
    /** Sets the value of the 'laneOffset' field */
    public edu.berkeley.path.model_elements.Link.Builder setLaneOffset(int value) {
      validate(fields()[5], value);
      this.laneOffset = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'laneOffset' field has been set */
    public boolean hasLaneOffset() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'laneOffset' field */
    public edu.berkeley.path.model_elements.Link.Builder clearLaneOffset() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'begin' field */
    public edu.berkeley.path.model_elements.NodeRef getBegin() {
      return begin;
    }
    
    /** Sets the value of the 'begin' field */
    public edu.berkeley.path.model_elements.Link.Builder setBegin(edu.berkeley.path.model_elements.NodeRef value) {
      validate(fields()[6], value);
      this.begin = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'begin' field has been set */
    public boolean hasBegin() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'begin' field */
    public edu.berkeley.path.model_elements.Link.Builder clearBegin() {
      begin = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'end' field */
    public edu.berkeley.path.model_elements.NodeRef getEnd() {
      return end;
    }
    
    /** Sets the value of the 'end' field */
    public edu.berkeley.path.model_elements.Link.Builder setEnd(edu.berkeley.path.model_elements.NodeRef value) {
      validate(fields()[7], value);
      this.end = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'end' field has been set */
    public boolean hasEnd() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'end' field */
    public edu.berkeley.path.model_elements.Link.Builder clearEnd() {
      end = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public Link build() {
      try {
        Link record = new Link();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.laneCount = fieldSetFlags()[3] ? this.laneCount : (java.lang.Double) defaultValue(fields()[3]);
        record.length = fieldSetFlags()[4] ? this.length : (java.lang.Double) defaultValue(fields()[4]);
        record.laneOffset = fieldSetFlags()[5] ? this.laneOffset : (java.lang.Integer) defaultValue(fields()[5]);
        record.begin = fieldSetFlags()[6] ? this.begin : (edu.berkeley.path.model_elements.NodeRef) defaultValue(fields()[6]);
        record.end = fieldSetFlags()[7] ? this.end : (edu.berkeley.path.model_elements.NodeRef) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}