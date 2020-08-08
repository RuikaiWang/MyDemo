package com.wrk.designPatterns.factory.singletonFactory;

import com.wrk.designPatterns.factory.bean.FactoryClass1;

/**
 * 单例模式也可称为单例工厂
 */

public class SingletonFactory {
    private static FactoryClass1 factoryClass1 = new FactoryClass1();

    private SingletonFactory() {
    }

    public FactoryClass1 create() {
        return factoryClass1;
    }
}
