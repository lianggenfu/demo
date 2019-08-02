package com.example.demo.utils;

public class ArraySortUtils {

    public static void main(String[] args) {
        int[] arr = {4,3,12,6,7};
        System.out.println("排序前：");
        display(arr);
        System.out.println("冒泡排序后：");
        int[] rs = bubbleSort2(arr);
        display(rs);
    }

    private static void display(int[] rs) {
        for(Integer in : rs){
            System.out.print(in+" ");
        }
        System.out.println();
    }

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    private static int[] bubbleSort(int[] arr) {
        if(arr.length==0)
            return arr;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    //display(arr);
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序，网上方法
     *
     * @param arr
     * @return
     */
    private static int[] bubbleSort2(int[] arr) {
        if(arr.length==0)
            return arr;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    //display(arr);
                }
            }
        }
        return arr;
    }
}
