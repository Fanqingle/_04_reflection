package com.yootk.demo;

import java.awt.print.Book;
import java.util.Date;

/**
 * @author qingle
 * @description
 * @date 12-03-2023
 */

public class YootkDemo1 {
    public static void main(String[] args) {
        Book book = new Book();// 1，首先获取Book类的实例化对象
        printClass(book.getClass());
        printClass(new java.util.Date().getClass());
    }

    private static void printClass(Class<?> aClass) {
        System.out.println("【当前操作的类型】" + aClass.getName());
    }
}
