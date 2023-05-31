package com.example.demo;


    import java.util.ArrayList;
import java.util.List;

    public class ProductRepository {
        private List<Product> products;

        public ProductRepository() {
            products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) {
            products.remove(product);
        }

        public List<Product> getAllProducts() {
            return new ArrayList<>(products);
        }

        public Product getProductById(int id) {
            for (Product product : products) {
                if (product.getId() == id) {
                    return product;
                }
            }
            return null; // Return null if product not found
        }
    }


