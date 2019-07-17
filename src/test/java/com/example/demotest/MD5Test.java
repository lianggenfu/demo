package com.example.demotest;

import com.example.demo.utils.MD5;

public class MD5Test {

    public static void main(String[] args) {
        String name = "lianggenfu";
        //System.out.println("name在MD5加密后变成了："+ MD5.getMD5String(name));

        String password = "lianggenuf";
        //System.out.println("pswd在MD5加密后变成了："+ MD5.getMD5String(password));
        //System.out.println(MD5.getMD5String(name).equals(MD5.getMD5String(password)));

        System.out.println(MD5.MD5EncodeUtf8(name));

        System.out.println(MD5.MD5EncodeUtf8(password));
    }
}
