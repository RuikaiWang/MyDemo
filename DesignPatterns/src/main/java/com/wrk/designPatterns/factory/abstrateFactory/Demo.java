package com.wrk.designPatterns.factory.abstrateFactory;

/**
 * 4.抽象工厂
 * 抽象工厂是对接口/抽象类 进行抽象 返回的是某些接口的集合
 * 抽象工厂类对工厂接口实现时可以定义接口返回的某一组对象
 * 抽象工厂是为了解决某些类的集合的解耦，只需要替换工厂的实现类即可替换一组对象
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactoryInterface abstractFactory1 = new AbstractFactory1();
        abstractFactory1.createClass1();
        abstractFactory1.createClass2();
        AbstractFactoryInterface abstractFactory2 = new AbstractFactory2();
        abstractFactory2.createClass1();
        abstractFactory2.createClass2();
    }
}
