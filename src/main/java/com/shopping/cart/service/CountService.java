package com.shopping.cart.service;

import com.shopping.cart.model.Discount;
import com.shopping.cart.model.Goods;
import com.shopping.cart.model.PrintItem;
import com.shopping.cart.model.ShoppingCart;
import com.shopping.cart.util.JsonUtil;
import com.shopping.cart.util.PrintShoppingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by yangsiji on 2017/4/27.
 * 用于打折优惠业务逻辑处理的类
 */
@Service
public class CountService {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private DiscountService discountService;

    public void count(){
        String jsondata="{\n" +
                "    \"ITEM000001\": 3,\n" +
                "    \"ITEM000003\": 2,\n" +
                "    \"ITEM000005\": 1\n" +
                "}";

        PrintItem printItem = new PrintItem();
        List<Map> items = new ArrayList<>();
        List<Map> discountItems = new ArrayList<>();

        List<ShoppingCart> shoppingCarts = new ArrayList<>();
        try{
            JsonUtil.jsonToList(jsondata,shoppingCarts);
        }catch (Exception e){
            System.out.println("json数据转换失败");
        }

        Iterator<ShoppingCart> iterator = shoppingCarts.iterator();
        while(iterator.hasNext()){
            ShoppingCart shoppingCart = iterator.next();
            Goods goods = goodsService.findByBarCode(shoppingCart.getBarCode());
            double[] subtotal = new double[2];
            List<Discount> discounts = discountService.findByBarCode(shoppingCart.getBarCode());
            if(discounts!=null && discounts.size()>0){
                Discount discount=null;
                if(discounts.size()==1){
                    discount = discounts.get(0);
                }else{
                    for(int i=0;i<discounts.size();i++){
                        if(discounts.get(i).getCode().trim().equals("0")){
                            discount = discounts.get(i);
                            break;
                        }
                    }
                }
                if(discount.getCode().trim().equals("0") && (int)shoppingCart.getQuantity()/3>0){
                    Map discountItem = new HashMap();
                    discountItem.put("name",goods.getName());
                    discountItem.put("quantity",(int)shoppingCart.getQuantity()/3);
                    discountItems.add(discountItem);
                }
                double disc = 0.95;
                countSubtotal(shoppingCart,goods,discount,disc,subtotal);
            }else{
                countSubtotal(shoppingCart,goods,subtotal);
            }

            Map item = new HashMap();
            item.put("name",goods.getName());
            item.put("quantity",shoppingCart.getQuantity());
            item.put("price",goods.getPrice());
            item.put("subtotal",subtotal[0]);
            item.put("discount",subtotal[1]);
            items.add(item);
            printItem.setTotal(printItem.getTotal()+subtotal[0]);
            printItem.setEconomization(printItem.getEconomization()+subtotal[1]);
        }
        printItem.setItems(items);
        printItem.setDiscountItems(discountItems);
        PrintShoppingList.print(printItem);//打印清单
    }

    private void countSubtotal(ShoppingCart shoppingCart,Goods goods, Discount discount,double disc,double[] subtotal){
        //买二赠一
        if(discount.getCode().trim().equals("0")){
            int number = (int)shoppingCart.getQuantity()-(int)shoppingCart.getQuantity()/3;
            subtotal[0] = number*goods.getPrice();
            subtotal[1] = ((int)shoppingCart.getQuantity()/3)*goods.getPrice();
        }else {
            subtotal[0] = shoppingCart.getQuantity()*goods.getPrice()*disc;
            subtotal[1] = shoppingCart.getQuantity()*goods.getPrice()*(1-disc);
        }
    }
    private void countSubtotal(ShoppingCart shoppingCart,Goods goods,double[] subtotal){
        subtotal[0] = shoppingCart.getQuantity()*goods.getPrice();
        subtotal[1] = 0;
    }
}
