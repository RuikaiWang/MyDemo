package com.wrk.designPatterns.singleton;

/**
 * 静态内部类单例
 * 私有构造
 * 私有内部类，内部类私有静态final属性
 * get方法返回内部类属性
 * JVM保证线程安全 内部类只有使用才会加载（懒汉）
 */
public class Singleton03 {
    private Singleton03() {
    }
    private static class Singleton03_in {
        private final static Singleton03 instance = new Singleton03();
    }
    private static Singleton03 getInstance(){
        return Singleton03_in.instance;
    }
}
