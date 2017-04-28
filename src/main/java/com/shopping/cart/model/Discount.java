package com.shopping.cart.model;

import java.io.Serializable;

/**
 * Created by yangsiji on 2017/4/27.
 */
public class Discount implements Serializable {
    private long id;
    private String barCode;
    private String code;
    private String description;
    private String updateTime;

    public Discount() {
    }

    public Discount(long id, String barCode, String code, String description, String updateTime) {
        this.id = id;
        this.barCode = barCode;
        this.code = code;
        this.description = description;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        Discount discount = (Discount) o;

        if (id != discount.id) return false;
        if (barCode != null ? !barCode.equals(discount.barCode) : discount.barCode != null) return false;
        if (code != null ? !code.equals(discount.code) : discount.code != null) return false;
        if (description != null ? !description.equals(discount.description) : discount.description != null)
            return false;
        return updateTime != null ? updateTime.equals(discount.updateTime) : discount.updateTime == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "id=" + id +
                ", barCode='" + barCode + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
