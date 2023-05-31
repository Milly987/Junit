package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductServiceTest {
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productService = new ProductService();
    }

    @Test
    public void testAddProduct() {
        productService.addProduct("Example Product", "example@example.com", 12345);

        List<Product> products = productService.getAllProducts();
        Assertions.assertEquals(1, products.size());

        Product product = products.get(0);
        Assertions.assertEquals("Example Product", product.getName());
        Assertions.assertEquals("example@example.com", product.getEmail());
        Assertions.assertEquals(12345, product.getId());
    }

    @Test
    public void testRemoveProduct() {
        productService.addProduct("Example Product", "example@example.com", 12345);
        productService.removeProduct(12345);

        List<Product> products = productService.getAllProducts();
        Assertions.assertTrue(products.isEmpty());
    }

    @Test
    public void testGetProductById() {
        productService.addProduct("Example Product 1", "example1@example.com", 12345);
        productService.addProduct("Example Product 2", "example2@example.com", 67890);

        Product retrievedProduct = productService.getProductById(12345);
        Assertions.assertNotNull(retrievedProduct);
        Assertions.assertEquals("Example Product 1", retrievedProduct.getName());
        Assertions.assertEquals("example1@example.com", retrievedProduct.getEmail());
        Assertions.assertEquals(12345, retrievedProduct.getId());

        Product nonExistentProduct = productService.getProductById(99999);
        Assertions.assertNull(nonExistentProduct);
    }
}
