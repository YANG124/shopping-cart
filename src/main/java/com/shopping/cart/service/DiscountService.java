package com.shopping.cart.service;

import com.shopping.cart.mapper.DiscountMapper;
import com.shopping.cart.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangsiji on 2017/4/27.
 * 打折信息管理类，按需只用到查询
 */
@Service
public class DiscountService {
    @Autowired
    private DiscountMapper discountMapper;

    public Discount findById(long id){
        return discountMapper.selectDiscountById(id);
    }

    public List<Discount> findByBarCode(String barCode){
        return discountMapper.selectDiscountByBarCode(barCode);
    }
}
