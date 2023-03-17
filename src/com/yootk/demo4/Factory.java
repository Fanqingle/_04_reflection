package com.yootk.demo4;

import java.lang.reflect.InvocationTargetException;

/**
 * @author qingle
 * @description
 * @date 14-03-2023
 */

public class Factory {

    private Factory() {

    }

    public static IBook getInstance(String className) {
        try {
            Object o = Class.forName(className).getDeclaredConstructor().newInstance();
        if(o instanceof IBook) {
            return (IBook) o;
        }
        return null;
        } catch (Exception e) {
            return null;
        }

    }
    private void read() {

    }

}
