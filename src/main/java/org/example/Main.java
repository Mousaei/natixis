package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShopCart shopCart = new ShopCart();
        List<Product> products = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();
        List<Float> total = new ArrayList<>();

        float totalProduct =0F;

        StringBuilder jsonBuffer = new StringBuilder();

        for(int i = 0; i<3; i++) {
            Product product = new Product();
            product.setName("Pen");
            product.setPrice(1.50F);
            products.add(product);


            totalProduct = totalProduct + 1.50F;


        }

        quantities.set(0 , new Integer(3));
        total.set(0, totalProduct);

        shopCart.setProducts(products);
        shopCart.setQuantity(quantities);
        shopCart.setTotal(total);


        for(int i = 0; i<2; i++) {
            Product product = new Product();
            product.setName("Book");
            product.setPrice(8F);
            products.add(product);

            quantities.add(new Integer(i));
            totalProduct = totalProduct + 8F;

            total.add(totalProduct);
        }

        quantities.set(1 , new Integer(2));
        total.set(1 , totalProduct);

        shopCart.setProducts(products);
        shopCart.setQuantity(quantities);
        shopCart.setTotal(total);


        System.out.println("Product    Quantity    Price    Total");
        jsonBuffer.append("Product    Quantity    Price    Total");
        System.out.println("-------------------------------------------");
        jsonBuffer.append("-------------------------------------------");

        String beforeName =  "";

        Product beforeProduct = new Product();

        for(int i = 0; i < 5; i++) {
            System.out.println( (shopCart.getProducts().get(0)).getName() + "    " + (shopCart.getQuantity().get(i)).toString() +
                    "    " + (shopCart.getProducts().get(i)).getPrice() + "    " +  (shopCart.getTotal().get(i)).toString() );

            jsonBuffer.append((shopCart.getProducts().get(0)).getName() + "    " + (shopCart.getQuantity().get(i)).toString() +
                    "    " + (shopCart.getProducts().get(i)).getPrice() + "    " +  (shopCart.getTotal().get(i)).toString() );
        }
    }
}