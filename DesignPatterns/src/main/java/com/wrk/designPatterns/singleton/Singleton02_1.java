package com.wrk.designPatterns.singleton;

/**
 * 完美懒汉单例
 * 减小锁的粒度（带来线程安全问题）
 * 使用双重判断解决线程安全问题
 */
public class Singleton02_1 {
    private static volatile Singleton02_1 instance;

    private Singleton02_1() {
    }

    public static Singleton02_1 getInstance(){
        if (instance ==null){ //判断是否有实例
            synchronized(Singleton02_1.class) {
                if (instance ==null){ //解决线程安全判断
                    instance = new Singleton02_1();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Singleton02_1.getInstance().hashCode())
            ).start();
        }
    }
}
