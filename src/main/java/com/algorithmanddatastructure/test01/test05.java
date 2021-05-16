package com.algorithmanddatastructure.test01;

/**
 * 立方阶（O(n^3)）
 */
public class test05 {
    public static void main(String[] args) {
        int sum=0;
        int n=100;
        for (int i=1;i<=n;i++){
            for (int j=1;j<n;j++){
                for (int k=1;k<n;k++){
                    sum+=n;
                }

            }
        }
        System.out.println(sum);
    }
}
