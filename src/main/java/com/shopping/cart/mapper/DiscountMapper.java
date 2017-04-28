package com.shopping.cart.mapper;

import com.shopping.cart.model.Discount;

import java.util.List;

/**
 * Created by yangsiji on 2017/4/27.
 */
public interface DiscountMapper {

    public List<Discount> selectAllDiscount();

    public Discount selectDiscountById(long id);

    public List<Discount> selectDiscountByBarCode(String barCode);

    public int insertDiscount(Discount discount);

    public int updateDiscount(Discount discount);

    public int deleteDiscount(long id);
}
