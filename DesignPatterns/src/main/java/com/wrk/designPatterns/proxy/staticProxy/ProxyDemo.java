package com.wrk.designPatterns.proxy.staticProxy;

public class ProxyDemo implements BaseInterface {
    @Override
    public void Mymethod() {
        System.out.println("myMethod");
    }

    public static void main(String[] args) {
        new StaticProxy1(new StaticProxy2(new ProxyDemo())).Mymethod();
    }
}
