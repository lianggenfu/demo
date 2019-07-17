package com.example.demotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array = {1,3,4,2,5};
        List list = new ArrayList();
        list = Arrays.asList(array);
        Object newArray = list.get(0);
        System.out.println(list.size());  // 1
    }
}
