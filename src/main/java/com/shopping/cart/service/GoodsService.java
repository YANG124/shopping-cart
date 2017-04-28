package com.shopping.cart.service;

import com.shopping.cart.mapper.GoodsMapper;
import com.shopping.cart.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangsiji on 2017/4/27.
 * 商品管理的处理类
 */
@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public Goods findById(long id){
        return goodsMapper.selectGoodsById(id);
    }

    public Goods findByBarCode(String barCode){
        return goodsMapper.selectGoodsByBarCode(barCode);
    }
}
