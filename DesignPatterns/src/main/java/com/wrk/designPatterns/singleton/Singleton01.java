package com.wrk.designPatterns.singleton;

/**
 * 1.懒汉式单例
 * 类加载时就初始化 不管用不用
 * 线程安全（ JVM 每个Class 只会加载一次）
 */
public class Singleton01 {
    //私有静态变量
    private static final Singleton01 instance = new Singleton01();
    //私有构造方法
    private Singleton01() {}
    //静态get方法
    public static Singleton01 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton01.getInstance() ==Singleton01.getInstance());
    }
}
