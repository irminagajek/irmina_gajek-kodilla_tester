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
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInvoiceRepositorySave() {
        //Given
        Product product = new Product("watch");
        productRepository.save(product);

        Item item = new Item(product, new BigDecimal(120.00), 2, new BigDecimal(240.00));

        List<Item> items = new ArrayList<>();
        items.add(item);
        Invoice invoice = new Invoice("Invoice no 12", items);
        item.setInvoice(invoice);

        //When
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //Clean up
        invoiceRepository.deleteById(id);
        productRepository.deleteAll();
    }
}