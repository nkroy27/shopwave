package com.shopwave.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;
    private int stockQuantity;

    public Product(int id, String name, double price, String category, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
    }

    public void displayProductDetails() {
        System.out.println("--- Product Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Stock: " + stockQuantity);
    }


    public static void main(String[] args) {
        Product pr1 = new Product(1, "Laptop", 99999.45, "Electronics", 3);
        pr1.displayProductDetails();

        Product pr2 = new Product(2, "Mobile", 8999.00, "Electronics", 6);
        pr2.displayProductDetails();
    }
}

