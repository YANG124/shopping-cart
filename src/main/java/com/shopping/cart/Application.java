package com.shopping.cart;

import com.shopping.cart.service.CountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by yangsiji on 2017/4/27.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
        CountService service = (CountService)context.getBean("countService");
        service.count();
    }
}
