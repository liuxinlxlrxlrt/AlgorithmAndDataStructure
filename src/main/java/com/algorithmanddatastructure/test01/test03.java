package com.algorithmanddatastructure.test01;

/**
 * 计算10的阶乘（factorial [fækˈtɔːriəl] ）
 */
public class test03 {
    public static void main(String[] args) {
        int result = fun2(10);
        System.out.println(result);
    }

    /**
     * 计算10的阶乘（递归方式）
     *
     * @param i
     * @return
     */
    private static int fun1(int i) {
        if (i == 1) {
            return 1;
        }
        return i * fun1(i - 1);
    }

    /**
     * 计算10的阶乘（循环方式）
     *
     * @param i
     * @return
     */
    private static int fun2(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *=j;
        }
        return result;
    }
}
