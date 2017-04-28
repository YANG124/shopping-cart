package com.shopping.cart.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yangsiji on 2017/4/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CountServiceTest {
        @Autowired
        private CountService countService;

        @org.junit.Test
        public void testCount() {
            countService.count();
        }
}
