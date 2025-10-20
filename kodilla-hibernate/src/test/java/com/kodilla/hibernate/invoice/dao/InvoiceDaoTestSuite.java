package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product p1 = new Product("Table");
        Product p2 = new Product("Chair");
        Product p3 = new Product("Lamp");

        Item i1 = new Item(p1, new BigDecimal(300), 5, new BigDecimal(15000));
        Item i2 = new Item(p1, new BigDecimal(800), 1, new BigDecimal(800));
        Item i3 = new Item(p2, new BigDecimal(150), 20, new BigDecimal(3000));
        Item i4 = new Item(p3, new BigDecimal(220), 2, new BigDecimal(440));

        Invoice invoice =  new Invoice("X/100/2025");

        /*---------------------------------------------------------------------------------------*/

        invoice.addItem(i1);
        invoice.addItem(i2);
        invoice.addItem(i3);
        invoice.addItem(i4);

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
