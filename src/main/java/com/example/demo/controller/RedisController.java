package com.example.demo.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @RequestMapping("redis")
    public String redis(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.opsForValue().set("num","123");
        return redisTemplate.opsForValue().get("num").toString();
    }
}
