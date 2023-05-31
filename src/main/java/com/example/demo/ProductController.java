package com.example.demo;


    import java.util.ArrayList;
import java.util.List;

    public class ProductController {
        private List<Product> products;

        public ProductController() {
            products = new ArrayList<>();
        }

        public void addProduct(String name, String email, int id) {
            Product product = new Product(name, email, id);
            products.add(product);
        }

        public void removeProduct(int id) {
            Product product = getProductById(id);
            if (product != null) {
                products.remove(product);
            }
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


