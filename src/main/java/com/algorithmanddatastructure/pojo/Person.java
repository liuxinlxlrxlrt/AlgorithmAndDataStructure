package com.algorithmanddatastructure.pojo;

/**
 * 1、new Person();//对象占16个字节
 * 2、age=1;占用4个字节，不够8字节，填充为8个字节
 * 3、所以new Person的过程占用24个字节
 */
public class Person {
    private int age=1; //占用4个字节，不够8字节，填充为8个字节

    public static void main(String[] args) {
        new Person();//对象占16个字节
    }
}
