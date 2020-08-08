package com.wrk.designPatterns.factory.factoryMethon;

import com.wrk.designPatterns.factory.bean.MethodFactoryClass1;
import com.wrk.designPatterns.factory.bean.MethodFactoryClassInterface;

public class MethodFactory1 implements MethodFactoryInterface {
    @Override
    public MethodFactoryClassInterface create() {
        return new MethodFactoryClass1();
    }
}
