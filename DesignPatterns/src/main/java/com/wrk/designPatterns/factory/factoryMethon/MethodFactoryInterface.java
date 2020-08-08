package com.wrk.designPatterns.factory.factoryMethon;

import com.wrk.designPatterns.factory.bean.MethodFactoryClassInterface;

public interface MethodFactoryInterface {
    public abstract MethodFactoryClassInterface create();
}
