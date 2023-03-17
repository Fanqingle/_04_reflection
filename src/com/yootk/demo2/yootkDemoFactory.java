//package com.yootk.demo2;
//
//
//import java.lang.reflect.Constructor;
//
///**
// * @author qingle
// * @description 反射获取构造方法
// * @date 12-03-2023
// */
//
//class Book {    // Book类中的构造方法使用了不同的访问权限
//    private String title;
//    private String author;
//    private double price;
//    public Book(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }// 本类中的无参构造、setter、getter方法，略...
//    public String toString() {
//        return "【Book】图书名称：" + this.title + "、图书作者：" + this.author + "、图书价格：" + this.price ;
//    }
//}
//
//public class yootkDemoFactory {    // 李兴华编程训练营：yootk.ke.qq.com
//    public static void main(String[] args) throws Exception {
//        Class<?> clazz = Class.forName("com.yootk.demo.Book");
//        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, String.class, double.class);// 获取指定构造
//        Object obj = constructor.newInstance("Java从入门到项目实战", "李兴华", 99.8) ; // 反射对象实例化
//        System.out.println(obj);
//    }
//}
