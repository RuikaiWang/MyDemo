package com.wrk.designPatterns.factory.factoryMethon;

import com.wrk.designPatterns.factory.bean.MethodFactoryClassInterface;

/**
 * 3.工厂方法
 * 对工厂抽出接口/父类
 * 工厂接口/类返回工厂生产对象的接口/父类
 * 扩展类时对该类的工厂也进行扩展（每个类都有自己的工厂类）
 */
public class Demo {
    public static void main(String[] args) {
        MethodFactoryInterface methodFactory1 = new MethodFactory1();
        MethodFactoryClassInterface methodFactoryClass1 = methodFactory1.create();
        MethodFactoryInterface methodFactory2 = new MethodFactory2();
        MethodFactoryClassInterface methodFactoryClass2 = methodFactory2.create();
    }
}
