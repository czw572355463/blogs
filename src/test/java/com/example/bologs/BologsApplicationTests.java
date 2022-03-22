package com.example.bologs;

import com.example.bologs.service.UsersService;
import com.example.bologs.service.impl.UsersServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@SpringBootTest
class BologsApplicationTests {


    @Test
    void contextLoads() {
        UsersService usersService = new UsersServiceImpl();
        System.out.println(usersService.queryById(1));
    }

    @Test
    void test(){
        Jedis jedis = new Jedis("120.79.165.25",6379);
        String temp =   jedis.get("foo");
        System.out.println(temp);
    }

    @Test
    void test1(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMinIdle(3);
        jedisPoolConfig.setMaxIdle(10);
        jedisPoolConfig.setTestOnBorrow(true);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,"120.79.165.25",6379);
        Jedis jedis = jedisPool.getResource();
        System.out.println( jedis.get("foo"));
    }
}
