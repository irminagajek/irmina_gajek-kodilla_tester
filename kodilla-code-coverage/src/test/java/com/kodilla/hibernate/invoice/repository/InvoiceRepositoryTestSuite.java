package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave() {
        //Given
        Product product = new Product(3, "watch");

        Item item1 = new Item(1, product, new BigDecimal(120.00), 2, new BigDecimal(240.00));
        Item item2 = new Item(2, product, new BigDecimal(120.00), 2, new BigDecimal(240.00));
        Item item3 = new Item(3, product, new BigDecimal(120.00), 2, new BigDecimal(240.00));

        List<Item> listItems = new ArrayList<>();
        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);
        Invoice invoice = new Invoice(12, "Invoice no 12", listItems);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);
    }

        //Clean up
}
