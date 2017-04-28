package com.shopping.cart.model;

/**
 * Created by yangsiji on 2017/4/27.
 */
public class ShoppingCart {
    private String barCode;
    private double quantity;

    public ShoppingCart() {
    }

    public ShoppingCart(String barCode, double quantity) {
        this.barCode = barCode;
        this.quantity = quantity;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCart that = (ShoppingCart) o;

        if (Double.compare(that.quantity, quantity) != 0) return false;
        return barCode != null ? barCode.equals(that.barCode) : that.barCode == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = barCode != null ? barCode.hashCode() : 0;
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "barCode='" + barCode + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
