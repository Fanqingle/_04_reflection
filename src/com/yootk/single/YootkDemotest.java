package com.yootk.single;

/**
 * @author qingle
 * @description
 * @date 14-03-2023
 */

class Singleton {
    // 使用volatile 避免了副本数据的复制与写入处理，可以更快地实现与原始内存数据的同步
    private static volatile Singleton instance;

    private Singleton(){
        System.out.println("【" + Thread.currentThread().getName() + "】实例化Singleton 类的对象。");
    }

    public String toString(){
        return "www.yootk.com";
    }


    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class YootkDemotest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println(singleton);
            },"单例操作线程 -" + i).start();
        }
    }
}
