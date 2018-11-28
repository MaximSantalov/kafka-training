/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.stubs.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ShakespeareValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4584341456954317474L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShakespeareValue\",\"namespace\":\"avro.stubs.model\",\"fields\":[{\"name\":\"line_number\",\"type\":\"int\",\"doc\":\"The line number for line\"},{\"name\":\"line\",\"type\":\"string\",\"doc\":\"The line from Shakespeare\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ShakespeareValue> ENCODER =
      new BinaryMessageEncoder<ShakespeareValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ShakespeareValue> DECODER =
      new BinaryMessageDecoder<ShakespeareValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ShakespeareValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ShakespeareValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ShakespeareValue>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ShakespeareValue to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ShakespeareValue from a ByteBuffer. */
  public static ShakespeareValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The line number for line */
  @Deprecated public int line_number;
  /** The line from Shakespeare */
  @Deprecated public java.lang.CharSequence line;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShakespeareValue() {}

  /**
   * All-args constructor.
   * @param line_number The line number for line
   * @param line The line from Shakespeare
   */
  public ShakespeareValue(java.lang.Integer line_number, java.lang.CharSequence line) {
    this.line_number = line_number;
    this.line = line;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return line_number;
    case 1: return line;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: line_number = (java.lang.Integer)value$; break;
    case 1: line = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'line_number' field.
   * @return The line number for line
   */
  public java.lang.Integer getLineNumber() {
    return line_number;
  }

  /**
   * Sets the value of the 'line_number' field.
   * The line number for line
   * @param value the value to set.
   */
  public void setLineNumber(java.lang.Integer value) {
    this.line_number = value;
  }

  /**
   * Gets the value of the 'line' field.
   * @return The line from Shakespeare
   */
  public java.lang.CharSequence getLine() {
    return line;
  }

  /**
   * Sets the value of the 'line' field.
   * The line from Shakespeare
   * @param value the value to set.
   */
  public void setLine(java.lang.CharSequence value) {
    this.line = value;
  }

  /**
   * Creates a new ShakespeareValue RecordBuilder.
   * @return A new ShakespeareValue RecordBuilder
   */
  public static avro.stubs.model.ShakespeareValue.Builder newBuilder() {
    return new avro.stubs.model.ShakespeareValue.Builder();
  }

  /**
   * Creates a new ShakespeareValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShakespeareValue RecordBuilder
   */
  public static avro.stubs.model.ShakespeareValue.Builder newBuilder(avro.stubs.model.ShakespeareValue.Builder other) {
    return new avro.stubs.model.ShakespeareValue.Builder(other);
  }

  /**
   * Creates a new ShakespeareValue RecordBuilder by copying an existing ShakespeareValue instance.
   * @param other The existing instance to copy.
   * @return A new ShakespeareValue RecordBuilder
   */
  public static avro.stubs.model.ShakespeareValue.Builder newBuilder(avro.stubs.model.ShakespeareValue other) {
    return new avro.stubs.model.ShakespeareValue.Builder(other);
  }

  /**
   * RecordBuilder for ShakespeareValue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShakespeareValue>
    implements org.apache.avro.data.RecordBuilder<ShakespeareValue> {

    /** The line number for line */
    private int line_number;
    /** The line from Shakespeare */
    private java.lang.CharSequence line;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.stubs.model.ShakespeareValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.line_number)) {
        this.line_number = data().deepCopy(fields()[0].schema(), other.line_number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.line)) {
        this.line = data().deepCopy(fields()[1].schema(), other.line);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ShakespeareValue instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.stubs.model.ShakespeareValue other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.line_number)) {
        this.line_number = data().deepCopy(fields()[0].schema(), other.line_number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.line)) {
        this.line = data().deepCopy(fields()[1].schema(), other.line);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'line_number' field.
      * The line number for line
      * @return The value.
      */
    public java.lang.Integer getLineNumber() {
      return line_number;
    }

    /**
      * Sets the value of the 'line_number' field.
      * The line number for line
      * @param value The value of 'line_number'.
      * @return This builder.
      */
    public avro.stubs.model.ShakespeareValue.Builder setLineNumber(int value) {
      validate(fields()[0], value);
      this.line_number = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'line_number' field has been set.
      * The line number for line
      * @return True if the 'line_number' field has been set, false otherwise.
      */
    public boolean hasLineNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'line_number' field.
      * The line number for line
      * @return This builder.
      */
    public avro.stubs.model.ShakespeareValue.Builder clearLineNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'line' field.
      * The line from Shakespeare
      * @return The value.
      */
    public java.lang.CharSequence getLine() {
      return line;
    }

    /**
      * Sets the value of the 'line' field.
      * The line from Shakespeare
      * @param value The value of 'line'.
      * @return This builder.
      */
    public avro.stubs.model.ShakespeareValue.Builder setLine(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.line = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'line' field has been set.
      * The line from Shakespeare
      * @return True if the 'line' field has been set, false otherwise.
      */
    public boolean hasLine() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'line' field.
      * The line from Shakespeare
      * @return This builder.
      */
    public avro.stubs.model.ShakespeareValue.Builder clearLine() {
      line = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ShakespeareValue build() {
      try {
        ShakespeareValue record = new ShakespeareValue();
        record.line_number = fieldSetFlags()[0] ? this.line_number : (java.lang.Integer) defaultValue(fields()[0]);
        record.line = fieldSetFlags()[1] ? this.line : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ShakespeareValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<ShakespeareValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ShakespeareValue>
    READER$ = (org.apache.avro.io.DatumReader<ShakespeareValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
