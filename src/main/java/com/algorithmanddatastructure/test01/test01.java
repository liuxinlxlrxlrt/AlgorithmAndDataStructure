package com.algorithmanddatastructure.test01;

/**
 * 求1至100相加的和(线性阶)
 */
public class test01 {
        public static void main(String[] args) {
        int sum=0;
        int n=100;
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
