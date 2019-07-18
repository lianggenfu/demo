package com.example.demo.utils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebIdCount implements HttpSessionListener {

    private static int count = 0 ;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        // System.out.println("创建了");
        HttpSession session = event.getSession();// 获得Session对象
        // 通过Session获得servletcontext对象
        ServletContext servletContext = session.getServletContext();
        /**
         * 1.获取num值
         * 2.加1
         * 3.存入servletcontext
         */
        Object object = servletContext.getAttribute("num");
        if (object == null) {
            servletContext.setAttribute("num", 1);
            count=1;
        } else {
            Object num = servletContext.getAttribute("num");
            int num1 = (int) num;
            servletContext.setAttribute("num", num1 + 1);
            count++;
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        // System.out.println("销毁了");
        HttpSession session = event.getSession();// 获得Session对象
        // 通过Session获得servletcontext对象
        ServletContext servletContext = session.getServletContext();
        /**
         *  1.获取num值
         *  2.减1
         *  3.存入servletcontext
         */
        servletContext.setAttribute("num", (long) servletContext.getAttribute("num") - 1);
        count--;
    }
}
