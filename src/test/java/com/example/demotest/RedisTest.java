package com.example.demotest;

import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest {

    public static void main(String[] args) {
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.opsForValue().set("num","123");
        redisTemplate.opsForValue().get("num");
    }
}
