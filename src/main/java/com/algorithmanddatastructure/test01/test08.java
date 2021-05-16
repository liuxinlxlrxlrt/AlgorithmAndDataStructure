package com.algorithmanddatastructure.test01;

/**
 *
 */
public class test08 {
    public static void main(String[] args) {
        int n=100;
        for (int i=0;i<n;i++){
            print(i);
        }
    }

    private static void print(int i){
        for (int j=0;j<i;j++){
            print(i);
        }
    }
}
