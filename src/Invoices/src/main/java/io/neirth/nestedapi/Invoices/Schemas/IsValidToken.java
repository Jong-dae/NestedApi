/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.neirth.nestedapi.Invoices.Schemas;

@org.apache.avro.specific.AvroGenerated
public interface IsValidToken {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"IsValidToken\",\"namespace\":\"io.neirth.nestedapi.Invoices.Schemas\",\"types\":[{\"type\":\"record\",\"name\":\"ProductObj\",\"fields\":[{\"name\":\"productName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"productPrice\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"productAmount\",\"type\":[\"null\",\"int\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"InvoiceObj\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"creationDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryAddress\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryPostcode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryCountry\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryCurrency\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deliveryAddressInformation\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"products\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"ProductObj\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"Request\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"invoice\",\"type\":[\"null\",\"InvoiceObj\"],\"default\":null},{\"name\":\"token\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"Response\",\"fields\":[{\"name\":\"status\",\"type\":[\"int\"]},{\"name\":\"object\",\"type\":[\"null\",\"boolean\",\"InvoiceObj\"],\"default\":null},{\"name\":\"object_id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"message\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"messages\":{\"IsValidToken\":{\"request\":[{\"name\":\"request\",\"type\":\"Request\"}],\"response\":\"Response\"}}}");
  /**
   */
  io.neirth.nestedapi.Invoices.Schemas.Response IsValidToken(io.neirth.nestedapi.Invoices.Schemas.Request request);

  @SuppressWarnings("all")
  public interface Callback extends IsValidToken {
    public static final org.apache.avro.Protocol PROTOCOL = io.neirth.nestedapi.Invoices.Schemas.IsValidToken.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void IsValidToken(io.neirth.nestedapi.Invoices.Schemas.Request request, org.apache.avro.ipc.Callback<io.neirth.nestedapi.Invoices.Schemas.Response> callback) throws java.io.IOException;
  }
}