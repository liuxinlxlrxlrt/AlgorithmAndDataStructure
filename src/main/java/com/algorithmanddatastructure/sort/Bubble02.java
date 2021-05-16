package com.algorithmanddatastructure.sort;

import java.util.Arrays;
/**
 * 冒泡排序(第二种方法)：
 * 排序前：{4,5,6,3,2,1}
 * 排序前：{1,2,3,4,5,6}
 * 排序原理：
 * 1、比较相邻元素，如果前一个比后一个元素大，就交换两个元素的位置
 * 2、对每一个相邻元素做相同的工作，从开始第一份对元素到结尾的一对元素，最终最后位置的元素就是最大值
 */
public class Bubble02 {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,2,1};
        Bubble02.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    /**
     * 实现冒泡排序
     * @param arr
     * @return
     */
    private static int[] sort(int[] arr){
        //外层循环目的是让元素从末尾开始冒泡
        for (int i =arr.length-1;i>0;i--){
            //循环实际的数组
            for (int j=0;j<i;j++){
                //判断当前元素是否比下一个大
                if (greater(arr[j],arr[j+1])){
                    //如果大就交换位置
                    exch(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    /**
     * 判断v是否大于w
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(int v,int w){
        return v>w?true:false;
    }

    /**
     * 交换数组arr的i和j下标位置的值
     * @param arr
     * @param i
     * @param j
     */
    private static void exch(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
