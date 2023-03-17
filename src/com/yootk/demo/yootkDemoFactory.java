package com.yootk.demo;

import java.lang.reflect.Constructor;

public class yootkDemoFactory {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("com.yootk.demo.Book");


        {
            System.out.println("--------------------- getConstructors()获取构造 ---------------------");
            for (Constructor<?> constructor : aClass.getConstructors()) {
                System.out.println("【1 - 构造信息】" + constructor);
            }
        }
        {
            System.out.println("--------------------- getDeclaredConstructors()获取构造 ---------------------");
            for (Constructor<?> constructor : aClass.getDeclaredConstructors()) {
                System.out.println("【2 - 构造信息】" + constructor);
            }
        }

    }
}
