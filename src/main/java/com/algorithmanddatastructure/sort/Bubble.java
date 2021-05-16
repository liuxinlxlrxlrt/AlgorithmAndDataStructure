package com.algorithmanddatastructure.sort;

import java.util.Arrays;

/**
 * 冒泡排序(第一种方法)：
 * 排序前：{4,5,6,3,2,1}
 * 排序前：{1,2,3,4,5,6}
 * 排序原理：
 * 1、比较相邻元素，如果前一个比后一个元素大，就交换两个元素的位置
 * 2、对每一个相邻元素做相同的工作，从开始第一份对元素到结尾的一对元素，最终最后位置的元素就是最大值
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,2,1};
        int[] ints = sort(arr);
//        for (int i=0;i<ints.length;i++) {
//            System.out.print(ints[i]+",");
//        }
        System.out.println(Arrays.toString(ints));
    }

    private static int[] sort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int j=0;j<n;j++) {
            for (int i = 0; i < n - 1; i++) {
                //判断两个相邻的两个数：
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
