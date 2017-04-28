package com.shopping.cart.service;

import com.shopping.cart.model.Discount;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by yangsiji on 2017/4/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscountServiceTest {
    @Autowired
    private DiscountService discountService;

    @org.junit.Test
    public void testFindByBarCode() {
        List<Discount> discounts = discountService.findByBarCode("ITEM000001");
        System.out.println(discounts.toString());
    }
}
