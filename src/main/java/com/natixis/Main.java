package com.natixis;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        InsuranceBeneficiary beneficiary = new InsuranceBeneficiary(2, "toto", "toto", "060709", "toto@gmail.com" ,"75008");
        System.out.println("The Beneficiary " + beneficiary);
        beneficiary.setAddress("");

        beneficiary.setEmail("");
        beneficiary.setFirstName("");
        beneficiary.setName("");

        beneficiary.setNss(2);
        beneficiary.setNoTel("");
        System.out.println("The Beneficiary " + beneficiary.getAddress() + " " +  beneficiary.getFirstName()
                + " " + beneficiary.getName() + " " + beneficiary.getEmail() + " " + beneficiary.getNss() + " " + beneficiary.getNoTel() );


        ShopCart shopCart = new ShopCart();
        Set<Product> products = new LinkedHashSet<>();
        List<Integer> quantities = new ArrayList<>();
        List<Float> total = new ArrayList<>();
        float totalProduct = 0F;
        float totalShopCart;
        StringBuilder jsonBuffer = new StringBuilder();
        for(int i = 0; i<3; i++) {
            totalProduct = totalProduct + 1.50F;
        }

        Product product = new Product();
        product.setName("Pen  ");
        product.setPrice(1.50F);
        products.add(product);
        quantities.add(3);
        total.add(totalProduct);
        shopCart.setProducts(products);
        shopCart.setQuantity(quantities);
        shopCart.setTotal(total);
        totalShopCart = totalProduct;
        totalProduct = 0F;

        for(int i = 0; i<2; i++) {
            totalProduct = totalProduct + 8F;
         }
        Product bookProduct = new Product();
        bookProduct.setName("Book ");
        bookProduct.setPrice(8F);
        products.add(bookProduct);
        quantities.add(2);
        total.add(totalProduct);
        shopCart.setProducts(products);
        shopCart.setQuantity(quantities);
        shopCart.setTotal(total);

        totalShopCart += totalProduct;
        System.out.println("Product    Quantity    Price       Total");
        jsonBuffer.append("Product    Quantity    Price        Total");
        System.out.println("-------------------------------------------");
        jsonBuffer.append("-------------------------------------------");

        JSONObject jsonObject = new JSONObject();
        JSONArray shopJsonCart = new JSONArray();
        FileWriter file;
        List<Product> actualProducts = new ArrayList<>((shopCart.getProducts()));
        for(int i=0; i < 2; i++){
            Product currentProduct = actualProducts.get(i);
            System.out.println(currentProduct.getName() + "           " +
                    (shopCart.getQuantity().get(i)).toString() + "       " +
                    currentProduct.getPrice() + "         " +
                    (shopCart.getTotal().get(i)).toString());

            try {

                    //Inserting key-value pairs into the json object
                    jsonObject.put("Product", (currentProduct.getName()));
                    jsonObject.put("Quantity", (shopCart.getQuantity().get(i)).toString() );
                    jsonObject.put("Price", currentProduct.getPrice() );
                    jsonObject.put("Total",  (shopCart.getTotal().get(i)).toString());

                    shopJsonCart.add(jsonObject.toJSONString());

            } catch (Exception e) {
                System.out.println(jsonBuffer);
           }//System.out.println("JSON file created: ");

        }
        try {
            file = new FileWriter("output.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            file.write(shopJsonCart.toJSONString());
        } catch (IOException e) {
            System.out.println(jsonBuffer);
        }
        try {
            file.close();
        } catch (IOException e) {
            System.out.println(jsonBuffer);
            throw new RuntimeException(e);
        }
        System.out.println("                                    " + totalShopCart);
    }
}