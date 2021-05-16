package com.algorithmanddatastructure.sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class Shell {
    public static void main(String[] args) {
        int[] arr ={9,1,2,5,7,4,8,6,3,5,11};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 实现插入排序
     *
     * @param arr
     * @return
     */
    private static int[] sort(int[] arr) {
        //计算h
        int n = arr.length;
        int h= 1;
        while (h<n/2){
            h=2*h+1;
        }
        //开始排序，只要h<1就停止排序
        while (h>=1){
            //找到待插入的元素
            for (int i = h; i <n ; i++) {
                //在这里，arr[i]就是待插入的元素
                //arr[i]与arr[i-h]、arr[i-2h],arr[i-3h]...比较
                //引用插入排序
                for (int j = i; j >=h ; j=j-h) {
                    //arr[j]就是待插入元素
                    //分别与arr[i-h]、arr[i-2h],arr[i-3h]...比较
                    if (greater(arr[j-h],arr[j])){
                        exch(arr,j,j-h);
                    }else {
                        break;
                    }
                }

            }
            h=h/2;
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
        System.out.println("v："+v);
        System.out.println("w："+w);
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
        System.out.println("temp："+temp);
        arr[i] = arr[j];
        System.out.println("arr[i]："+arr[i] );
        arr[j] = temp;
        System.out.println("arr[j]："+arr[j] );
    }
}
