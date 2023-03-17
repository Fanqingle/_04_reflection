package com.yootk.demo;

import java.util.Date;

/**
 * @author qingle
 * @description
 * @date 12-03-2023
 */

public class YootkDemo3 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = IBook.class;// 属于Java的原生语法支持
        Class<?> bClass = Date.class;//  属于Java的原生语法支持
        Class<?> cClass = Date.class;// 属于Java的原生语法支持
        Class<?> dClass = Class.forName("java.util.Date");// 属于Java的原生语法支持
        Class<?> eClass = Class.forName("com.yootk.demo.Book");// 实例化Book类的对象
        printClass(aClass);
        printClass(bClass);
        printClass(cClass);
        printClass(dClass);
        eClass.newInstance();// 在JDK 1.8的时候依然可以正常使用
        eClass.getDeclaredConstructor().newInstance();// 在JDK 1.8的时候依然可以正常使用
//        printClass(new Date().getClass());
    }

    private static void printClass(Class<?> aClass) {
        System.out.println("【当前操作的类型】" + aClass.getName());
    }
}
