package com.yootk.demo;

import java.util.Date;

/**
 * @author qingle
 * @description
 * @date 12-03-2023
 */

public class YootkDemo_factory {
    public static void main(String[] args) throws Exception {

        Class<?> eClass = Class.forName("com.yootk.demo.Book");// 实例化Book类的对象
        Class<?> superClazz = eClass.getSuperclass(); // 获取父类
        System.out.println("【继承父类】" + superClazz.getName());
        System.out.println("【继承父类】" + superClazz.getSuperclass().getName());
        Class<?> inters [] = eClass.getInterfaces(); // 获取实现的接口
        for (Class<?> inter : inters) {
            System.out.println("【实现接口】" + inter.getName());
        }
    }

}
