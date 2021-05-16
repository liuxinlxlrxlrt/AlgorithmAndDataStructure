package com.algorithmanddatastructure.test02;

import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ints = reverseArr(arr);
//        for (int i=0;i<ints.length;i++) {
//            System.out.print(ints[i]+",");
//        }
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 反转数组
     * @param arr
     */
    private static int[] reverseArr(int[] arr) {
        int n = arr.length;//申请4字节
        int temp ;//申请4字节
        for (int start = 0,end=n-1; start<=end;start++,end--){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }
}
