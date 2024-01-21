package com.natixis;

import java.util.List;
import java.util.Set;

public class ShopCart {

    private List<Integer> quantity;
    private Set<Product> Products;
    private List<Float> total;

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public Set<Product> getProducts() {
        return Products;
    }

    public void setProducts(Set<Product> products) {
        Products = products;
    }

    public List<Float> getTotal() {
        return total;
    }

    public void setTotal(List<Float> total) {
        this.total = total;
    }
}
