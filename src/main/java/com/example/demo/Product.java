package com.example.demo;

public class Product {
        private String name;
        private String email;
        private int id;

        public Product(String name, String email, int id) {
            this.name = name;
            this.email = email;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Product: " + name + "\nID: " + id + "\nEmail: " + email;
        }
    }


