package com.shopping.cart.util;

import com.shopping.cart.model.PrintItem;

import java.util.Map;

/**
 * Created by yangsiji on 2017/4/27.
 */
public class PrintShoppingList {

    public static void print(PrintItem printItem){
        if(printItem.getItems().size()==0 ||printItem.getItems()==null){
            System.out.println("购物清单为空");
        }else{
            System.out.println("***<没钱赚商店>购物清单***");
            for(int i=0;i<printItem.getItems().size();i++){
                Map item = printItem.getItems().get(i);
                if((double)item.get("discount")==0){
                    System.out.println("名称："+item.get("name")+" ，数量："+
                            item.get("quantity")+" , 单价："+item.get("price")+"(元), 小计："+item.get("subtotal")+"(元)");
                }else{
                    System.out.println("名称："+item.get("name")+" ，数量："+
                            item.get("quantity")+" , 单价："+item.get("price")+"(元) , 小计："+
                            item.get("subtotal")+"(元) ,节省："+item.get("discount")+"(元)");
                }
            }
            if(printItem.getDiscountItems()!=null && printItem.getDiscountItems().size()>0){
                System.out.println("----------------------");
                System.out.println("买二赠一商品:");
                for(int i = 0;i<printItem.getDiscountItems().size();i++){
                    Map discountItem = printItem.getDiscountItems().get(i);
                    System.out.println("名称："+discountItem.get("name")+" ，数量："+
                            discountItem.get("quantity"));
                }
            }
            System.out.println("----------------------");
            System.out.println("总计："+printItem.getTotal()+"(元)");
            System.out.println("节省："+printItem.getEconomization()+"(元)");
            System.out.println("**********************");
        }
    }
}
