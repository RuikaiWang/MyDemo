package com.wrk.designPatterns.Decorator;

/**
 * 7.装饰着模式
 * 被装饰者和装饰者抽象类都继承自同一个父类
 * 装饰者抽象类添加被装饰的成员变量并调用被装饰者的方法
 * 装饰者继承抽象的装饰者父类（包括成员变量）并实现并加强父类的方法（）
 */
public class Demo {
    public static void main(String[] args) {
        DecoratorClassInterface decoratorClass = new DecoratorClass();
        Decorator1 decorator1 = new Decorator1(decoratorClass);
        Decorator2 decorator2 = new Decorator2(decorator1);
        decorator2.run();
    }

}
