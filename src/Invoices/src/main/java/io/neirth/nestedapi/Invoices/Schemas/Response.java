/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.neirth.nestedapi.Invoices.Schemas;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7781667204086722787L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Response\",\"namespace\":\"io.neirth.nestedapi.Invoices.Schemas\",\"fields\":[{\"name\":\"status\",\"type\":[\"int\"]},{\"name\":\"object\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"InvoiceObj\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"creationDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryAddress\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryPostcode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryCountry\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryCurrency\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryAddressInformation\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"products\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProductObj\",\"fields\":[{\"name\":\"productName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"productPrice\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"productAmount\",\"type\":[\"null\",\"int\"],\"default\":null}]}}],\"default\":null}]}],\"default\":null},{\"name\":\"object_id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"message\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Response> ENCODER =
      new BinaryMessageEncoder<Response>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Response> DECODER =
      new BinaryMessageDecoder<Response>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Response> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Response> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Response> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Response>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Response to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Response from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Response instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Response fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Object status;
   private io.neirth.nestedapi.Invoices.Schemas.InvoiceObj object;
   private java.lang.CharSequence object_id;
   private java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Response() {}

  /**
   * All-args constructor.
   * @param status The new value for status
   * @param object The new value for object
   * @param object_id The new value for object_id
   * @param message The new value for message
   */
  public Response(java.lang.Object status, io.neirth.nestedapi.Invoices.Schemas.InvoiceObj object, java.lang.CharSequence object_id, java.lang.CharSequence message) {
    this.status = status;
    this.object = object;
    this.object_id = object_id;
    this.message = message;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return status;
    case 1: return object;
    case 2: return object_id;
    case 3: return message;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: status = value$; break;
    case 1: object = (io.neirth.nestedapi.Invoices.Schemas.InvoiceObj)value$; break;
    case 2: object_id = (java.lang.CharSequence)value$; break;
    case 3: message = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.Object getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.Object value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'object' field.
   * @return The value of the 'object' field.
   */
  public io.neirth.nestedapi.Invoices.Schemas.InvoiceObj getObject() {
    return object;
  }


  /**
   * Sets the value of the 'object' field.
   * @param value the value to set.
   */
  public void setObject(io.neirth.nestedapi.Invoices.Schemas.InvoiceObj value) {
    this.object = value;
  }

  /**
   * Gets the value of the 'object_id' field.
   * @return The value of the 'object_id' field.
   */
  public java.lang.CharSequence getObjectId() {
    return object_id;
  }


  /**
   * Sets the value of the 'object_id' field.
   * @param value the value to set.
   */
  public void setObjectId(java.lang.CharSequence value) {
    this.object_id = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }


  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Creates a new Response RecordBuilder.
   * @return A new Response RecordBuilder
   */
  public static io.neirth.nestedapi.Invoices.Schemas.Response.Builder newBuilder() {
    return new io.neirth.nestedapi.Invoices.Schemas.Response.Builder();
  }

  /**
   * Creates a new Response RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Response RecordBuilder
   */
  public static io.neirth.nestedapi.Invoices.Schemas.Response.Builder newBuilder(io.neirth.nestedapi.Invoices.Schemas.Response.Builder other) {
    if (other == null) {
      return new io.neirth.nestedapi.Invoices.Schemas.Response.Builder();
    } else {
      return new io.neirth.nestedapi.Invoices.Schemas.Response.Builder(other);
    }
  }

  /**
   * Creates a new Response RecordBuilder by copying an existing Response instance.
   * @param other The existing instance to copy.
   * @return A new Response RecordBuilder
   */
  public static io.neirth.nestedapi.Invoices.Schemas.Response.Builder newBuilder(io.neirth.nestedapi.Invoices.Schemas.Response other) {
    if (other == null) {
      return new io.neirth.nestedapi.Invoices.Schemas.Response.Builder();
    } else {
      return new io.neirth.nestedapi.Invoices.Schemas.Response.Builder(other);
    }
  }

  /**
   * RecordBuilder for Response instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Response>
    implements org.apache.avro.data.RecordBuilder<Response> {

    private java.lang.Object status;
    private io.neirth.nestedapi.Invoices.Schemas.InvoiceObj object;
    private io.neirth.nestedapi.Invoices.Schemas.InvoiceObj.Builder objectBuilder;
    private java.lang.CharSequence object_id;
    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.neirth.nestedapi.Invoices.Schemas.Response.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.object)) {
        this.object = data().deepCopy(fields()[1].schema(), other.object);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasObjectBuilder()) {
        this.objectBuilder = io.neirth.nestedapi.Invoices.Schemas.InvoiceObj.newBuilder(other.getObjectBuilder());
      }
      if (isValidValue(fields()[2], other.object_id)) {
        this.object_id = data().deepCopy(fields()[2].schema(), other.object_id);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.message)) {
        this.message = data().deepCopy(fields()[3].schema(), other.message);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Response instance
     * @param other The existing instance to copy.
     */
    private Builder(io.neirth.nestedapi.Invoices.Schemas.Response other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.object)) {
        this.object = data().deepCopy(fields()[1].schema(), other.object);
        fieldSetFlags()[1] = true;
      }
      this.objectBuilder = null;
      if (isValidValue(fields()[2], other.object_id)) {
        this.object_id = data().deepCopy(fields()[2].schema(), other.object_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.message)) {
        this.message = data().deepCopy(fields()[3].schema(), other.message);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.Object getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder setStatus(java.lang.Object value) {
      validate(fields()[0], value);
      this.status = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder clearStatus() {
      status = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'object' field.
      * @return The value.
      */
    public io.neirth.nestedapi.Invoices.Schemas.InvoiceObj getObject() {
      return object;
    }


    /**
      * Sets the value of the 'object' field.
      * @param value The value of 'object'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder setObject(io.neirth.nestedapi.Invoices.Schemas.InvoiceObj value) {
      validate(fields()[1], value);
      this.objectBuilder = null;
      this.object = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'object' field has been set.
      * @return True if the 'object' field has been set, false otherwise.
      */
    public boolean hasObject() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'object' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.neirth.nestedapi.Invoices.Schemas.InvoiceObj.Builder getObjectBuilder() {
      if (objectBuilder == null) {
        if (hasObject()) {
          setObjectBuilder(io.neirth.nestedapi.Invoices.Schemas.InvoiceObj.newBuilder(object));
        } else {
          setObjectBuilder(io.neirth.nestedapi.Invoices.Schemas.InvoiceObj.newBuilder());
        }
      }
      return objectBuilder;
    }

    /**
     * Sets the Builder instance for the 'object' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder setObjectBuilder(io.neirth.nestedapi.Invoices.Schemas.InvoiceObj.Builder value) {
      clearObject();
      objectBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'object' field has an active Builder instance
     * @return True if the 'object' field has an active Builder instance
     */
    public boolean hasObjectBuilder() {
      return objectBuilder != null;
    }

    /**
      * Clears the value of the 'object' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder clearObject() {
      object = null;
      objectBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'object_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getObjectId() {
      return object_id;
    }


    /**
      * Sets the value of the 'object_id' field.
      * @param value The value of 'object_id'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder setObjectId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.object_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'object_id' field has been set.
      * @return True if the 'object_id' field has been set, false otherwise.
      */
    public boolean hasObjectId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'object_id' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder clearObjectId() {
      object_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }


    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.message = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.Response.Builder clearMessage() {
      message = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Response build() {
      try {
        Response record = new Response();
        record.status = fieldSetFlags()[0] ? this.status :  defaultValue(fields()[0]);
        if (objectBuilder != null) {
          try {
            record.object = this.objectBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("object"));
            throw e;
          }
        } else {
          record.object = fieldSetFlags()[1] ? this.object : (io.neirth.nestedapi.Invoices.Schemas.InvoiceObj) defaultValue(fields()[1]);
        }
        record.object_id = fieldSetFlags()[2] ? this.object_id : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.message = fieldSetFlags()[3] ? this.message : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Response>
    WRITER$ = (org.apache.avro.io.DatumWriter<Response>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Response>
    READER$ = (org.apache.avro.io.DatumReader<Response>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










