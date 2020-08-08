package com.wrk.designPatterns.singleton;

/**
 * 饿汉式 调用方法时创建
 * 线程不安全 多线程可能出问题 加锁synchronized解决
 * 每次使用由于锁的存在效率减低
 */
public class Singleton02 {
    //私有化instance变量
    private static Singleton02 instance;
    //私有化构造
    private Singleton02() { }
    //getInstance方法
    public static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Singleton02.getInstance().hashCode())
            ).start();
        }
    }
}
