package com.natixis;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {

        ShopCart shopCart = new ShopCart();
        List<Product> products = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();
        List<Float> total = new ArrayList<>();

        float totalProduct = 0F;

        StringBuilder jsonBuffer = new StringBuilder();

        for(int i = 0; i<3; i++) {
            totalProduct = totalProduct + 1.50F;
        }

        Product product = new Product();
        product.setName("Pen ");
        product.setPrice(1.50F);

        products.add(product);

        quantities.add(new Integer(3));
        total.add(totalProduct);

        shopCart.setProducts(products);
        shopCart.setQuantity(quantities);
        shopCart.setTotal(total);


        totalProduct = 0F;

        for(int i = 0; i<2; i++) {
            totalProduct = totalProduct + 8F;
         }

        Product productB = new Product();
        productB.setName("Book");
        productB.setPrice(8.00F);

        products.add(productB);

        quantities.add(new Integer(2));
        total.add(totalProduct);

        shopCart.setProducts(products);
        shopCart.setQuantity(quantities);
        shopCart.setTotal(total);


        System.out.println("Product    Quantity    Price    Total");
        jsonBuffer.append("Product    Quantity    Price    Total");
        System.out.println("-------------------------------------------");
        jsonBuffer.append("-------------------------------------------");

        String beforeName =  "";

        Product beforeProduct = new Product();

        for(int i = 0; i < 2; i++) {
            System.out.println( (shopCart.getProducts().get(i)).getName() + "           " + (shopCart.getQuantity().get(i)).toString() +
                    "       " + (shopCart.getProducts().get(i)).getPrice() + "         " +  (shopCart.getTotal().get(i)).toString() );

            jsonBuffer.append( shopCart.getProducts().get(i).getName() + "        " + (shopCart.getQuantity().get(i)).toString() +
                    "       " + (shopCart.getProducts().get(i)).getPrice() + "        " +  (shopCart.getTotal().get(i)).toString() );
        }
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("ID", "1");
        jsonObject.put("Product", "Pen");
        jsonObject.put("Quantity", "3");
        jsonObject.put("Price", "1.50");
        jsonObject.put("Total", "4.50");

        jsonObject.put("ID", "2");
        jsonObject.put("Product", "Book");
        jsonObject.put("Quantity", "2");
        jsonObject.put("Price", "8");
        jsonObject.put("Total", "16");


        try {
            FileWriter file = new FileWriter("output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}