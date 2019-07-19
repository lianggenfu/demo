package com.example.demo.controller;

import com.example.demo.utils.MyHttpSessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class RedisController {
    private static Logger logger = LoggerFactory.getLogger(RedisController.class);

    @RequestMapping("redis")
    public String redis(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.opsForValue().set("num","123");
        return redisTemplate.opsForValue().get("num").toString();
    }

    @RequestMapping("/login2")
    public void getUserByUserNameAndPassword(String username, String password, HttpSession session) {
        logger.info("用户【"+username+"】登陆开始！");
        if("admin".equals(username) && "123456".equals(password)){
            session.setAttribute("loginName",username);
            logger.info("用户【"+username+"】登陆成功！");
        }else{
            logger.info("用户【"+username+"】登录失败！");
        }
    }
        @RequestMapping("/Logout")
    public void Logout( HttpServletRequest request) {
        logger.info("用户退出登录开始！");
        HttpSession session = request.getSession(false);//防止创建Session
        if(session != null){
            session.removeAttribute("loginName");
            session.invalidate();
        }
        logger.info("用户退出登录结束！");
        //return new CommonResult(ResultEnum.SUCCESS.getCode(), "退出成功！");
    }

    @RequestMapping("/online")
    public Object online() {
        return  "当前在线人数：" + MyHttpSessionListener.online + "人";
    }
}
