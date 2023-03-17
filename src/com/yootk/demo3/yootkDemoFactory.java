package com.yootk.demo3;

/**
 * @author qingle
 * @description 反射获取构造方法
 * @date 12-03-2023
 */



public class yootkDemoFactory {    // 李兴华编程训练营：yootk.ke.qq.com
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.yootk.demo3.Book"); // 虎丘Class对象实例
        // 通过反射实例化得到的对象返回类型统一为Object
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Book book = (Book) obj ; // 反射对象实例化
        book.read(); // 调用Book类方法
    }
}
