/*
 * MIT License
 *
 * Copyright (c) 2020 NestedApi Project
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.neirth.nestedapi.Invoices.Connectors;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.List;
import java.util.NoSuchElementException;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import io.neirth.nestedapi.Invoices.Templates.Country;
import io.neirth.nestedapi.Invoices.Templates.Invoice;

public class InvoicesConn implements Closeable {
    private final MongoClient conn;
    private final MongoCollection<Document> collection;

    /**
     * Constructor with security level in default package so that it can only be
     * instantiated by the connections class.
     */
    InvoicesConn(MongoClient conn) {
        this.conn = conn;
        this.collection = conn.getDatabase("invoices").getCollection("invoices");
    }

    /**
     * Method to insert in the database a row with user information.
     * 
     * @param invoice The user to insert.
     * @return The new id of the user row.
     * @throws MongoWriteException The exception in case of problems with the
     *                             database.
     */
    public String create(Invoice invoice) throws MongoWriteException {
        // Generate a products list.
        List<Document> products = new ArrayList<>();

        // Put all data from Map into a list.
        invoice.getProducts().forEach((key, value) -> {
            products.add(new Document().append("productName", key).append("productPrize", value.getKey()).append("productCount", value.getValue()));
        });

        // Generate a new bson document with invoice properties.
        Document invoiceDoc = new Document("_id", new ObjectId());

        // Put the invoice properties.
        invoiceDoc.append("userId", invoice.getUserId()).append("creationDate", invoice.getCreationDate())
                .append("deliveryAddress", invoice.getDeliveryAddress())
                .append("deliveryPostcode", invoice.getDeliveryPostcode())
                .append("deliveryCountry", invoice.getDeliveryCountry().name())
                .append("deliveryCurrency", invoice.getDeliveryCurrency().getCurrencyCode())
                .append("deliveryAddressInformation", invoice.getDeliveryAddressInformation())
                .append("products", products);

        // Insert the invoice document into database.
        collection.insertOne(invoiceDoc);

        // Return the id of document.
        return ((ObjectId) invoiceDoc.get("_id")).toHexString();
    }

    public Invoice read(String hexString) {
        Invoice invoice = null;
        
        // Recover the document from database.
        Document document = collection.find(new Document("_id", hexString)).first();

        if (document != null) {
            // We build a new user object with the database information.
            Map<String, Map.Entry<Float, Integer>> products = new HashMap<>();
            // TODO: We retrieve the emblematic documents within the invoice document.

            // Build the Invoice object.
            invoice = new Invoice.Builder(hexString)
                                 .setUserId(document.getLong("userId"))
                                 .setCreationDate(document.getDate("creationDate"))
                                 .setDeliveryAddress(document.getString("deliveryAddress"))
                                 .setDeliveryPostcode(document.getString("deliveryPostcode"))
                                 .setDeliveryCountry(Enum.valueOf(Country.class, document.getString("deliveryCountry")))
                                 .setDeliveryCurrency(Currency.getInstance(document.getString("deliveryCurrency")))
                                 .setProducts(products)
                                 .build();
        } else {
            // If the case where the item doesn't exist, throws a exception warning for this
            // situation.
            throw new NoSuchElementException("The element " + hexString + " is not available in the database.");
        }

        // Return the object.
        return invoice;
    }

    public void update(Invoice invoice) {
        throw new UnsupportedOperationException("This operation is not supported in the module.");
    }

    public void delete(Invoice invoice) {
        throw new UnsupportedOperationException("This operation is not supported in the module.");
    }

    @Override
    public void close() throws IOException {
        conn.close();
    }
}