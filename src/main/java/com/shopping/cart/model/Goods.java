package com.shopping.cart.model;

import java.io.Serializable;

/**
 * Created by yangsiji on 2017/4/27.
 */
public class Goods implements Serializable {
    private long id;
    private String barCode;
    private String name;
    private int price;
    private String updateTime;

    public Goods() {
    }

    public Goods(long id, String barCode, String name, int price, String updateTime) {
        this.id = id;
        this.barCode = barCode;
        this.name = name;
        this.price = price;
        this.updateTime = updateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (id != goods.id) return false;
        if (price != goods.price) return false;
        if (barCode != null ? !barCode.equals(goods.barCode) : goods.barCode != null) return false;
        if (name != null ? !name.equals(goods.name) : goods.name != null) return false;
        return updateTime != null ? updateTime.equals(goods.updateTime) : goods.updateTime == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
