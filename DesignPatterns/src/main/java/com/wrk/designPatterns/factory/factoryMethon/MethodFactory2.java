package com.wrk.designPatterns.factory.factoryMethon;

import com.wrk.designPatterns.factory.bean.MethodFactoryClass1;
import com.wrk.designPatterns.factory.bean.MethodFactoryClass2;
import com.wrk.designPatterns.factory.bean.MethodFactoryClassInterface;

public class MethodFactory2 implements MethodFactoryInterface {
    @Override
    public MethodFactoryClassInterface create() {
        return new MethodFactoryClass2();
    }
}
