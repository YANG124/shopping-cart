package com.shopping.cart.util;


import com.shopping.cart.model.ShoppingCart;
import org.json.*;

import java.util.Iterator;
import java.util.List;

/**
 * Created by yangsiji on 2017/4/27.
 */
public class JsonUtil {

   public static void jsonToList(String json, List<ShoppingCart> list) throws Exception{
       JSONObject jsonobject = new JSONObject(json);
       Iterator<String> iterator = jsonobject.keys();
       while(iterator.hasNext()){
           String key = iterator.next().toString();
           double value = jsonobject.getDouble(key);
           ShoppingCart shoppingCart = new ShoppingCart(key,value);
           list.add(shoppingCart);
       }
   }
}
