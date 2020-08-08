package com.wrk.designPatterns.factory.abstrateFactory;

import com.wrk.designPatterns.factory.bean.AbstractFactoryClassInterface1;
import com.wrk.designPatterns.factory.bean.AbstractFactoryClassInterface2;

public interface AbstractFactoryInterface {
    public AbstractFactoryClassInterface1 createClass1();
    public AbstractFactoryClassInterface2 createClass2();
}
