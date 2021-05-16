package com.algorithmanddatastructure.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 实现插入排序
     *
     * @param arr
     * @return
     */
    private static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(arr[j - 1], arr[j])) {
                    exch(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    /**
     * 判断v是否大于w
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(int v, int w) {
        return v > w ? true : false;
    }

    /**
     * 交换数组arr的i和j下标位置的值
     *
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
