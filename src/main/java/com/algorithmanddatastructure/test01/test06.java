package com.algorithmanddatastructure.test01;

/**
 * 对数阶（log(n)）
 */
public class test06 {
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        while (i < n) {
            //酶促循环都扩大2倍
            i = i * 2;
        }
        System.out.println(i);
    }
}
