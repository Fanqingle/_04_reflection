package com.yootk.single;//package com.yootk.demo;

import com.yootk.demo4.Factory;
import com.yootk.demo4.IBook;

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
