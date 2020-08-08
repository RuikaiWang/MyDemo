package com.wrk.designPatterns.proxy.staticProxy;

public class StaticProxy2 implements BaseInterface {
    public BaseInterface base;

    public StaticProxy2(BaseInterface base) {
        this.base = base;
    }

    @Override
    public void Mymethod() {
        System.out.println("proxy2Start");
        base.Mymethod();
        System.out.println("proxy2End");
    }
}
