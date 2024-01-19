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

        float totalProduct =0F;

        StringBuilder jsonBuffer = new StringBuilder();

        for(int i = 0; i<3; i++) {
            Product product = new Product();
            product.setName("Pen");
            product.setPrice(1.50F);
            products.add(product);


            totalProduct = totalProduct + 1.50F;


        }

        quantities.add(new Integer(3));
        total.add(totalProduct);

        shopCart.setProducts(products);
        shopCart.setQuantity(quantities);
        shopCart.setTotal(total);


        totalProduct =0F;

        for(int i = 0; i<2; i++) {
            Product product = new Product();
            product.setName("Book");
            product.setPrice(8F);
            products.add(product);

            totalProduct = totalProduct + 8F;

        }

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
                    "    " + (shopCart.getProducts().get(i)).getPrice() + "         " +  (shopCart.getTotal().get(i)).toString() );

            jsonBuffer.append( shopCart.getProducts().get(i).getName() + "        " + (shopCart.getQuantity().get(i)).toString() +
                    "    " + (shopCart.getProducts().get(i)).getPrice() + "        " +  (shopCart.getTotal().get(i)).toString() );
        }
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("ID", "1");
        jsonObject.put("First_Name", "Shikhar");
        jsonObject.put("Last_Name", "Dhawan");
        jsonObject.put("Date_Of_Birth", "1981-12-05");
        jsonObject.put("Place_Of_Birth", "Delhi");
        jsonObject.put("Country", "India");

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