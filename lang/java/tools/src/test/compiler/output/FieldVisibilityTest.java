/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro.examples.baseball;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Test various field visibility types */
@org.apache.avro.specific.AvroGenerated
public class FieldVisibilityTest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4697324982091605518L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FieldVisibilityTest\",\"namespace\":\"avro.examples.baseball\",\"doc\":\"Test various field visibility types\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"favorite_number\",\"type\":[\"int\",\"null\"]},{\"name\":\"favorite_color\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FieldVisibilityTest> ENCODER =
      new BinaryMessageEncoder<FieldVisibilityTest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FieldVisibilityTest> DECODER =
      new BinaryMessageDecoder<FieldVisibilityTest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FieldVisibilityTest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FieldVisibilityTest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FieldVisibilityTest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FieldVisibilityTest>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FieldVisibilityTest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FieldVisibilityTest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FieldVisibilityTest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FieldVisibilityTest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.Integer favorite_number;
  @Deprecated public java.lang.CharSequence favorite_color;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FieldVisibilityTest() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param favorite_number The new value for favorite_number
   * @param favorite_color The new value for favorite_color
   */
  public FieldVisibilityTest(java.lang.CharSequence name, java.lang.Integer favorite_number, java.lang.CharSequence favorite_color) {
    this.name = name;
    this.favorite_number = favorite_number;
    this.favorite_color = favorite_color;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return favorite_number;
    case 2: return favorite_color;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: favorite_number = (java.lang.Integer)value$; break;
    case 2: favorite_color = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
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
   * Gets the value of the 'favorite_number' field.
   * @return The value of the 'favorite_number' field.
   */
  public java.lang.Integer getFavoriteNumber() {
    return favorite_number;
  }


  /**
   * Sets the value of the 'favorite_number' field.
   * @param value the value to set.
   */
  public void setFavoriteNumber(java.lang.Integer value) {
    this.favorite_number = value;
  }

  /**
   * Gets the value of the 'favorite_color' field.
   * @return The value of the 'favorite_color' field.
   */
  public java.lang.CharSequence getFavoriteColor() {
    return favorite_color;
  }


  /**
   * Sets the value of the 'favorite_color' field.
   * @param value the value to set.
   */
  public void setFavoriteColor(java.lang.CharSequence value) {
    this.favorite_color = value;
  }

  /**
   * Creates a new FieldVisibilityTest RecordBuilder.
   * @return A new FieldVisibilityTest RecordBuilder
   */
  public static avro.examples.baseball.FieldVisibilityTest.Builder newBuilder() {
    return new avro.examples.baseball.FieldVisibilityTest.Builder();
  }

  /**
   * Creates a new FieldVisibilityTest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FieldVisibilityTest RecordBuilder
   */
  public static avro.examples.baseball.FieldVisibilityTest.Builder newBuilder(avro.examples.baseball.FieldVisibilityTest.Builder other) {
    if (other == null) {
      return new avro.examples.baseball.FieldVisibilityTest.Builder();
    } else {
      return new avro.examples.baseball.FieldVisibilityTest.Builder(other);
    }
  }

  /**
   * Creates a new FieldVisibilityTest RecordBuilder by copying an existing FieldVisibilityTest instance.
   * @param other The existing instance to copy.
   * @return A new FieldVisibilityTest RecordBuilder
   */
  public static avro.examples.baseball.FieldVisibilityTest.Builder newBuilder(avro.examples.baseball.FieldVisibilityTest other) {
    if (other == null) {
      return new avro.examples.baseball.FieldVisibilityTest.Builder();
    } else {
      return new avro.examples.baseball.FieldVisibilityTest.Builder(other);
    }
  }

  /**
   * RecordBuilder for FieldVisibilityTest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FieldVisibilityTest>
    implements org.apache.avro.data.RecordBuilder<FieldVisibilityTest> {

    private java.lang.CharSequence name;
    private java.lang.Integer favorite_number;
    private java.lang.CharSequence favorite_color;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.examples.baseball.FieldVisibilityTest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.favorite_number)) {
        this.favorite_number = data().deepCopy(fields()[1].schema(), other.favorite_number);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.favorite_color)) {
        this.favorite_color = data().deepCopy(fields()[2].schema(), other.favorite_color);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing FieldVisibilityTest instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.examples.baseball.FieldVisibilityTest other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.favorite_number)) {
        this.favorite_number = data().deepCopy(fields()[1].schema(), other.favorite_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.favorite_color)) {
        this.favorite_color = data().deepCopy(fields()[2].schema(), other.favorite_color);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldVisibilityTest.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldVisibilityTest.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'favorite_number' field.
      * @return The value.
      */
    public java.lang.Integer getFavoriteNumber() {
      return favorite_number;
    }


    /**
      * Sets the value of the 'favorite_number' field.
      * @param value The value of 'favorite_number'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldVisibilityTest.Builder setFavoriteNumber(java.lang.Integer value) {
      validate(fields()[1], value);
      this.favorite_number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'favorite_number' field has been set.
      * @return True if the 'favorite_number' field has been set, false otherwise.
      */
    public boolean hasFavoriteNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'favorite_number' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldVisibilityTest.Builder clearFavoriteNumber() {
      favorite_number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'favorite_color' field.
      * @return The value.
      */
    public java.lang.CharSequence getFavoriteColor() {
      return favorite_color;
    }


    /**
      * Sets the value of the 'favorite_color' field.
      * @param value The value of 'favorite_color'.
      * @return This builder.
      */
    public avro.examples.baseball.FieldVisibilityTest.Builder setFavoriteColor(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.favorite_color = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'favorite_color' field has been set.
      * @return True if the 'favorite_color' field has been set, false otherwise.
      */
    public boolean hasFavoriteColor() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'favorite_color' field.
      * @return This builder.
      */
    public avro.examples.baseball.FieldVisibilityTest.Builder clearFavoriteColor() {
      favorite_color = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FieldVisibilityTest build() {
      try {
        FieldVisibilityTest record = new FieldVisibilityTest();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.favorite_number = fieldSetFlags()[1] ? this.favorite_number : (java.lang.Integer) defaultValue(fields()[1]);
        record.favorite_color = fieldSetFlags()[2] ? this.favorite_color : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FieldVisibilityTest>
    WRITER$ = (org.apache.avro.io.DatumWriter<FieldVisibilityTest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FieldVisibilityTest>
    READER$ = (org.apache.avro.io.DatumReader<FieldVisibilityTest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    if (this.favorite_number == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeInt(this.favorite_number);
    }

    if (this.favorite_color == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.favorite_color);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.favorite_number = null;
      } else {
        this.favorite_number = in.readInt();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.favorite_color = null;
      } else {
        this.favorite_color = in.readString(this.favorite_color instanceof Utf8 ? (Utf8)this.favorite_color : null);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.favorite_number = null;
          } else {
            this.favorite_number = in.readInt();
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.favorite_color = null;
          } else {
            this.favorite_color = in.readString(this.favorite_color instanceof Utf8 ? (Utf8)this.favorite_color : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










