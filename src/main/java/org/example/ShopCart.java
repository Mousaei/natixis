package org.example;

import java.util.List;
import java.util.Objects;

public class ShopCart {

    private int quantity;
    private List Product;
    private float total;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List getProduct() {
        return Product;
    }

    public void setProduct(List product) {
        Product = product;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShopCart)) return false;
        ShopCart shopCart = (ShopCart) o;
        return getQuantity() == shopCart.getQuantity() && Float.compare(getTotal(), shopCart.getTotal()) == 0 && Objects.equals(getProduct(), shopCart.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantity(), getProduct(), getTotal());
    }
}
