package com.yootk.demo;

import java.util.Date;

/**
 * @author qingle
 * @description
 * @date 12-03-2023
 */

public class YootkDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = IBook.class;// 属于Java的原生语法支持
        Class<?> bClass = java.util.Date.class;//  属于Java的原生语法支持
        Class<?> cClass = Date.class;// 属于Java的原生语法支持
        Class<?> dClass = Class.forName("java.util.Date");// 属于Java的原生语法支持
        printClass(aClass);
        printClass(bClass);
        printClass(cClass);
        printClass(dClass);
//        printClass(new Date().getClass());
    }

    private static void printClass(Class<?> aClass) {
        System.out.println("【当前操作的类型】" + aClass.getName());
    }
}
