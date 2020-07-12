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
public class ProductObj extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1421293026234769511L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductObj\",\"namespace\":\"io.neirth.nestedapi.Invoices.Schemas\",\"fields\":[{\"name\":\"productName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"productPrice\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"productAmount\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProductObj> ENCODER =
      new BinaryMessageEncoder<ProductObj>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductObj> DECODER =
      new BinaryMessageDecoder<ProductObj>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductObj> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductObj> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductObj> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductObj>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductObj to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductObj from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductObj instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductObj fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence productName;
   private java.lang.Double productPrice;
   private java.lang.Integer productAmount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductObj() {}

  /**
   * All-args constructor.
   * @param productName The new value for productName
   * @param productPrice The new value for productPrice
   * @param productAmount The new value for productAmount
   */
  public ProductObj(java.lang.CharSequence productName, java.lang.Double productPrice, java.lang.Integer productAmount) {
    this.productName = productName;
    this.productPrice = productPrice;
    this.productAmount = productAmount;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productName;
    case 1: return productPrice;
    case 2: return productAmount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productName = (java.lang.CharSequence)value$; break;
    case 1: productPrice = (java.lang.Double)value$; break;
    case 2: productAmount = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'productName' field.
   * @return The value of the 'productName' field.
   */
  public java.lang.CharSequence getProductName() {
    return productName;
  }


  /**
   * Sets the value of the 'productName' field.
   * @param value the value to set.
   */
  public void setProductName(java.lang.CharSequence value) {
    this.productName = value;
  }

  /**
   * Gets the value of the 'productPrice' field.
   * @return The value of the 'productPrice' field.
   */
  public java.lang.Double getProductPrice() {
    return productPrice;
  }


  /**
   * Sets the value of the 'productPrice' field.
   * @param value the value to set.
   */
  public void setProductPrice(java.lang.Double value) {
    this.productPrice = value;
  }

  /**
   * Gets the value of the 'productAmount' field.
   * @return The value of the 'productAmount' field.
   */
  public java.lang.Integer getProductAmount() {
    return productAmount;
  }


  /**
   * Sets the value of the 'productAmount' field.
   * @param value the value to set.
   */
  public void setProductAmount(java.lang.Integer value) {
    this.productAmount = value;
  }

  /**
   * Creates a new ProductObj RecordBuilder.
   * @return A new ProductObj RecordBuilder
   */
  public static io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder newBuilder() {
    return new io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder();
  }

  /**
   * Creates a new ProductObj RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductObj RecordBuilder
   */
  public static io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder newBuilder(io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder other) {
    if (other == null) {
      return new io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder();
    } else {
      return new io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder(other);
    }
  }

  /**
   * Creates a new ProductObj RecordBuilder by copying an existing ProductObj instance.
   * @param other The existing instance to copy.
   * @return A new ProductObj RecordBuilder
   */
  public static io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder newBuilder(io.neirth.nestedapi.Invoices.Schemas.ProductObj other) {
    if (other == null) {
      return new io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder();
    } else {
      return new io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductObj instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductObj>
    implements org.apache.avro.data.RecordBuilder<ProductObj> {

    private java.lang.CharSequence productName;
    private java.lang.Double productPrice;
    private java.lang.Integer productAmount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productName)) {
        this.productName = data().deepCopy(fields()[0].schema(), other.productName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.productPrice)) {
        this.productPrice = data().deepCopy(fields()[1].schema(), other.productPrice);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.productAmount)) {
        this.productAmount = data().deepCopy(fields()[2].schema(), other.productAmount);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductObj instance
     * @param other The existing instance to copy.
     */
    private Builder(io.neirth.nestedapi.Invoices.Schemas.ProductObj other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.productName)) {
        this.productName = data().deepCopy(fields()[0].schema(), other.productName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productPrice)) {
        this.productPrice = data().deepCopy(fields()[1].schema(), other.productPrice);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productAmount)) {
        this.productAmount = data().deepCopy(fields()[2].schema(), other.productAmount);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'productName' field.
      * @return The value.
      */
    public java.lang.CharSequence getProductName() {
      return productName;
    }


    /**
      * Sets the value of the 'productName' field.
      * @param value The value of 'productName'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder setProductName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.productName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'productName' field has been set.
      * @return True if the 'productName' field has been set, false otherwise.
      */
    public boolean hasProductName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'productName' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder clearProductName() {
      productName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productPrice' field.
      * @return The value.
      */
    public java.lang.Double getProductPrice() {
      return productPrice;
    }


    /**
      * Sets the value of the 'productPrice' field.
      * @param value The value of 'productPrice'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder setProductPrice(java.lang.Double value) {
      validate(fields()[1], value);
      this.productPrice = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productPrice' field has been set.
      * @return True if the 'productPrice' field has been set, false otherwise.
      */
    public boolean hasProductPrice() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'productPrice' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder clearProductPrice() {
      productPrice = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'productAmount' field.
      * @return The value.
      */
    public java.lang.Integer getProductAmount() {
      return productAmount;
    }


    /**
      * Sets the value of the 'productAmount' field.
      * @param value The value of 'productAmount'.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder setProductAmount(java.lang.Integer value) {
      validate(fields()[2], value);
      this.productAmount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'productAmount' field has been set.
      * @return True if the 'productAmount' field has been set, false otherwise.
      */
    public boolean hasProductAmount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'productAmount' field.
      * @return This builder.
      */
    public io.neirth.nestedapi.Invoices.Schemas.ProductObj.Builder clearProductAmount() {
      productAmount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductObj build() {
      try {
        ProductObj record = new ProductObj();
        record.productName = fieldSetFlags()[0] ? this.productName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.productPrice = fieldSetFlags()[1] ? this.productPrice : (java.lang.Double) defaultValue(fields()[1]);
        record.productAmount = fieldSetFlags()[2] ? this.productAmount : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductObj>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductObj>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductObj>
    READER$ = (org.apache.avro.io.DatumReader<ProductObj>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.productName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.productName);
    }

    if (this.productPrice == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.productPrice);
    }

    if (this.productAmount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.productAmount);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.productName = null;
      } else {
        this.productName = in.readString(this.productName instanceof Utf8 ? (Utf8)this.productName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.productPrice = null;
      } else {
        this.productPrice = in.readDouble();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.productAmount = null;
      } else {
        this.productAmount = in.readInt();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.productName = null;
          } else {
            this.productName = in.readString(this.productName instanceof Utf8 ? (Utf8)this.productName : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.productPrice = null;
          } else {
            this.productPrice = in.readDouble();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.productAmount = null;
          } else {
            this.productAmount = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









