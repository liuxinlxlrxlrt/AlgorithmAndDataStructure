package com.algorithmanddatastructure.test02;

public class test02 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ints = reverseArr(arr);
        for (int i=0;i<ints.length;i++) {
            System.out.print(ints[i]+",");
        }
    }

    /**
     * 反转数组
     * @param arr
     */
    private static int[] reverseArr(int[] arr) {
        int n = arr.length;//申请4字节
        int[] temp= new int[n];//申请n*4字节+数组本身信息开销的24字节
        for (int i = n-1;i>=0 ;i--){
            temp[n-1-i]=arr[i];
        }
        return temp;
    }
}
