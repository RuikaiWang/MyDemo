package com.wrk.designPatterns.proxy.dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CjlibDemo {
    public void cglibMethod(){
        System.out.println("cglibMethod");
    }
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CjlibDemo.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib+"+method.getName());
                return methodProxy.invokeSuper(o,args);
            }
        });

        CjlibDemo cjlibDemo = (CjlibDemo) enhancer.create();
        cjlibDemo.cglibMethod();

    }
}
