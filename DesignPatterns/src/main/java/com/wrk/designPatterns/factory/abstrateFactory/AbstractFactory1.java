package com.wrk.designPatterns.factory.abstrateFactory;

import com.wrk.designPatterns.factory.bean.AbstractFactoryClass1_1;
import com.wrk.designPatterns.factory.bean.AbstractFactoryClass2_1;
import com.wrk.designPatterns.factory.bean.AbstractFactoryClassInterface1;
import com.wrk.designPatterns.factory.bean.AbstractFactoryClassInterface2;

public class AbstractFactory1 implements AbstractFactoryInterface {
    @Override
    public AbstractFactoryClassInterface1 createClass1() {
        return new AbstractFactoryClass1_1();
    }

    @Override
    public AbstractFactoryClassInterface2 createClass2() {
        return new AbstractFactoryClass2_1();
    }
}
