package com.wrk.designPatterns.factory.simpleFactory;

import com.wrk.designPatterns.factory.bean.FactoryClass1;

/**
 * 只要能产生Bean的都叫工厂
 */
public class SimpleFactory {
    public FactoryClass1 create(){
        return new FactoryClass1();
    }
}
