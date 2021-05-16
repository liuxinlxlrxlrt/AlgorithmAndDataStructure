package com.algorithmanddatastructure.test01;

/**
 * 计算1至100相加的和（常数阶（O(1)））
 */
public class test02 {

    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        sum = (n + 1) * 100 / 2;
        System.out.println(sum);

    }
}
