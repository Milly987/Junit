package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void testGettersAndSetters(){
        Product product = new Product("cookies", "cookies@gmail", 123);
        Assertions.assertEquals("cookies", product.getName());
        Assertions.assertEquals("cookies@gmail",product.getEmail());
        Assertions.assertEquals(123, product.getId());

    }

}