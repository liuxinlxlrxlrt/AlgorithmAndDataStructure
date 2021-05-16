package com.algorithmanddatastructure.test01;

/**
 * 平方阶（O(n^2)）
 */
public class Test04 {
    public static void main(String[] args) {
        int sum=0;
        int n=100;
        for (int i=1;i<=n;i++){
            for (int j=1;j<n;j++){
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
