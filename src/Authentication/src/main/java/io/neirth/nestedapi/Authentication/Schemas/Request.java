/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.neirth.nestedapi.Authentication.Schemas;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4936004235322134920L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Request\",\"namespace\":\"io.neirth.nestedapi.Authentication.Schemas\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"token\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Request> ENCODER =
      new BinaryMessageEncoder<Request>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Request> DECODER =
      new BinaryMessageDecoder<Request>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Request> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Request> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Request> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Request>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Request to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Request from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Request instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Request fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Long id;
   private java.lang.CharSequence token;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Request() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param token The new value for token
   */
  public Request(java.lang.Long id, java.lang.CharSequence token) {
    this.id = id;
    this.token = token;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return token;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: token = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'token' field.
   * @return The value of the 'token' field.
   */
  public java.lang.CharSequence getToken() {
    return token;
  }


  /**
   * Sets the value of the 'token' field.
   * @param value the value to set.
   */
  public void setToken(java.lang.CharSequence value) {
    this.token = value;
  }

  /**
   * Creates a new Request RecordBuilder.
   * @return A new Request RecordBuilder
   */
  public static io.neirth.nestedapi.Authentication.Schemas.Request.Builder newBuilder() {
    return new io.neirth.nestedapi.Authentication.Schemas.Request.Builder();
  }

  /**
   * Creates a new Request RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Request RecordBuilder
   */
  public static io.neirth.nestedapi.Authentication.Schemas.Request.Builder newBuilder(io.neirth.nestedapi.Authentication.Schemas.Request.Builder other) {
    if (other == null) {
      return new io.neirth.nestedapi.Authentication.Schemas.Request.Builder();
    } else {
      return new io.neirth.nestedapi.Authentication.Schemas.Request.Builder(other);
    }
  }

  /**
   * Creates a new Request RecordBuilder by copying an existing Request instance.
   * @param other The existing instance to copy.
   * @return A new Request RecordBuilder
   */
  public static io.neirth.nestedapi.Authentication.Schemas.Request.Builder newBuilder(io.neirth.nestedapi.Authentication.Schemas.Request other) {
    if (other == null) {
      return new io.neirth.nestedapi.Authentication.Schemas.Request.Builder();
    } else {
      return new io.neirth.nestedapi.Authentication.Schemas.Request.Builder(other);
    }
  }

  /**
   * RecordBuilder for Request instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Request>
    implements org.apache.avro.data.RecordBuilder<Request> {

    private java.lang.Long id;
    private java.lang.CharSequence token;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.neirth.nestedapi.Authentication.Schemas.Request.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.token)) {
        this.token = data().deepCopy(fields()[1].schema(), other.token);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Request instance
     * @param other The existing instance to copy.
     */
    private Builder(io.neirth.nestedapi.Authentication.Schemas.Request other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.token)) {
        this.token = data().deepCopy(fields()[1].schema(), other.token);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Authentication.Schemas.Request.Builder setId(java.lang.Long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Authentication.Schemas.Request.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'token' field.
      * @return The value.
      */
    public java.lang.CharSequence getToken() {
      return token;
    }


    /**
      * Sets the value of the 'token' field.
      * @param value The value of 'token'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Authentication.Schemas.Request.Builder setToken(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.token = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'token' field has been set.
      * @return True if the 'token' field has been set, false otherwise.
      */
    public boolean hasToken() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'token' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Authentication.Schemas.Request.Builder clearToken() {
      token = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Request build() {
      try {
        Request record = new Request();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.token = fieldSetFlags()[1] ? this.token : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Request>
    WRITER$ = (org.apache.avro.io.DatumWriter<Request>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Request>
    READER$ = (org.apache.avro.io.DatumReader<Request>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.id);
    }

    if (this.token == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.token);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.token = null;
      } else {
        this.token = in.readString(this.token instanceof Utf8 ? (Utf8)this.token : null);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.token = null;
          } else {
            this.token = in.readString(this.token instanceof Utf8 ? (Utf8)this.token : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










