package com.example.bologs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;
@RestController
@RequestMapping("order")
public class orderController {

    @Autowired
    RedisTemplate redisTemplate;

    ListOperations<String,String> stringStringListOperations;
    /**
     *  模拟用户下单
     * @param orderinfo
     */
    @RequestMapping("add")
    public void order(String orderinfo){
        stringStringListOperations = redisTemplate.opsForList();
        stringStringListOperations.leftPush("orderlist",orderinfo);
        System.out.println("下单成功...");
    }

    @RequestMapping("pro")
    public void processOrder() {
        stringStringListOperations = redisTemplate.opsForList();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String orderinfo;
                while(true){
                    orderinfo =   stringStringListOperations.rightPop("orderlist");
                    if(orderinfo!=null){
                        System.out.println("正在处理 " + orderinfo + " 订单中");
                        try {
                            Thread.sleep(3000);
                            System.out.println(orderinfo + "订单处理完成!");
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }else {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });
        t.start();
    }
}

