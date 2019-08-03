package com.example.demo.utils;

public class ReverseStringUtils {

    public static void main(String[] args) {
        String s = "abcdefg";
        String rs = reverseByRecursion(s);
        System.out.println("result: "+rs);
    }

    /**
     * StringBuffer 和StringBuilder都封装了reverse()方法反转字符串
     *
     * @param s
     * @return
     */
    private static String reverse(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.reverse().toString();
    }

    /**
     * 递归算法实现字符串反转
     *
     * @param s
     * @return
     */
    public static String reverseByRecursion(String s){
        if(s.length()>0)
            return reverseByRecursion(s.substring(1))+s.charAt(0);
        else return s;
    }
}
