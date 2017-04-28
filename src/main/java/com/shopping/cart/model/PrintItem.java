package com.shopping.cart.model;

import java.util.List;
import java.util.Map;

/**
 * Created by yangsiji on 2017/4/27.
 */
public class PrintItem {
    private List<Map> items;
    private List<Map> discountItems;
    private double total;
    private double economization;

    public PrintItem() {
    }

    public List<Map> getItems() {
        return items;
    }

    public void setItems(List<Map> items) {
        this.items = items;
    }

    public List<Map> getDiscountItems() {
        return discountItems;
    }

    public void setDiscountItems(List<Map> discountItems) {
        this.discountItems = discountItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getEconomization() {
        return economization;
    }

    public void setEconomization(double economization) {
        this.economization = economization;
    }
}
