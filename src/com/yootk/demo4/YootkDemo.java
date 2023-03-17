package com.yootk.demo4;//package com.yootk.demo;

import java.awt.print.Book;

/**
 * @author qingle
 * @description
 * @date 12-03-2023
 */

public class YootkDemo {
    public static void main(String[] args) {
        IBook instanceA = Factory.getInstance("com.yootk.demo4.MathBook");
        instanceA.read();
        IBook instanceB = Factory.getInstance("com.yootk.demo4.ProgramBook");
        instanceB.read();

//        System.out.println(book.getClass().getSimpleName());
//        System.out.println(book.getClass().getTypeName());
    }
}
