package com.wrk.designPatterns.proxy.staticProxy;

public class StaticProxy1 implements BaseInterface {
    public BaseInterface base;
    @Override
    public void Mymethod() {
        System.out.println("proxy1Start");
        base.Mymethod();
        System.out.println("proxy1End");
    }

    public StaticProxy1(BaseInterface base) {
        this.base = base;
    }
}
