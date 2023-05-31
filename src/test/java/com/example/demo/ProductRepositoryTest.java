package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

    public class ProductRepositoryTest {
        private ProductRepository productRepository;

        @BeforeEach
        public void setUp() {
            productRepository = new ProductRepository();
        }

        @Test
        public void testAddProduct() {
            Product product = new Product("Example Product", "example@example.com", 12345);
            productRepository.addProduct(product);

            List<Product> products = productRepository.getAllProducts();
            Assertions.assertEquals(1, products.size());
            Assertions.assertEquals(product, products.get(0));
        }

        @Test
        public void testRemoveProduct() {
            Product product = new Product("Example Product", "example@example.com", 12345);
            productRepository.addProduct(product);
            productRepository.removeProduct(product);

            List<Product> products = productRepository.getAllProducts();
            Assertions.assertTrue(products.isEmpty());
        }

        @Test
        public void testGetProductById() {
            Product product1 = new Product("Example Product 1", "example1@example.com", 12345);
            Product product2 = new Product("Example Product 2", "example2@example.com", 67890);
            productRepository.addProduct(product1);
            productRepository.addProduct(product2);

            Product retrievedProduct = productRepository.getProductById(12345);
            Assertions.assertEquals(product1, retrievedProduct);

            Product nonExistentProduct = productRepository.getProductById(99999);
            Assertions.assertNull(nonExistentProduct);
        }
    }

