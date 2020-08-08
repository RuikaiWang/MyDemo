package com.wrk.designPatterns.factory.abstrateFactory;

import com.wrk.designPatterns.factory.bean.*;

public class AbstractFactory2 implements AbstractFactoryInterface {
    @Override
    public AbstractFactoryClassInterface1 createClass1() {
        return new AbstractFactoryClass1_2();
    }

    @Override
    public AbstractFactoryClassInterface2 createClass2() {
        return new AbstractFactoryClass2_2();
    }
}
