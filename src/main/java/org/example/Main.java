package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShopCart shopCart = new ShopCart();
        List<Product> products = new ArrayList<>();

        for(int i = 0; i<5; i++) {
            Product product = new Product();
            product.setName("Pen");
            product.setPrice(1.50F);
        }

        for(int i = 0; i<5; i++) {
            Product product = new Product();
            product.setName("Book");
            product.setPrice(8F);
        }

        System.out.println("Hello world!");
    }
}