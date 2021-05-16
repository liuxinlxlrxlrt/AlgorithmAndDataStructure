package com.algorithmanddatastructure.sort;

import java.util.Arrays;

/**
 * 选择排序：
 * 2.1、需求：
 *  * 排序前：{4,6,8,7,9,2,1}
 *  * 排序前：{1,2,4,6,7,8,9}
 *
 * 2.2、排序原理：
 * （1）、每一次遍历过程中，都假定第一个索引成的元素为最小值，和其他索引处的值一次进行比较，如果当前索引处的值大于其他某个索引处的值，则假定其他某个索引处的值为最小值，最后找到最小的所在的索引
 * （2）、交换第一个索引处和最小值所在的索引处的值
 */
public class Selection {
    public static void main(String[] args) {
        int[] arr={4,6,8,7,9,2,1};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 实现选择排序
     * @param arr
     * @return
     */
    private static int[] sort(int[] arr){
        //当我们的arr.length=7
        for (int i =0;i<arr.length-1;i++){
            //假定本次遍历，第i个位置是最小值
            int minIndex=i;
            //（7-1）、（7-2）、（7-3）...（1）
            for (int j=i+1;j<arr.length;j++){
                //判断当前元素是否比下一个大
                if (greater(arr[minIndex],arr[j])){
                    //更换最小值
                    minIndex=j;
                }
            }
            //比较完了，当前的min就是本次循环的最小值
            exch(arr,i,minIndex);
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
    private static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
