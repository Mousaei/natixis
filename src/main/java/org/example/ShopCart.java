package org.example;

import java.util.List;
import java.util.Objects;

public class ShopCart {

    private List<Integer> quantity;
    private List<Product> Products;
    private List<Float> total;

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }

    public List<Float> getTotal() {
        return total;
    }

    public void setTotal(List<Float> total) {
        this.total = total;
    }
}
