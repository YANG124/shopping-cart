package com.shopping.cart.mapper;

import com.shopping.cart.model.Goods;

import java.util.List;

/**
 * Created by yangsiji on 2017/4/27.
 */
public interface GoodsMapper {

    public List<Goods> selectAllGoods();

    public Goods selectGoodsById(long id);

    public Goods selectGoodsByBarCode(String barCode);

    public int insertGoods(Goods goods);

    public int updateGoods(Goods goods);

    public int deleteGoodsById(long id);
}
