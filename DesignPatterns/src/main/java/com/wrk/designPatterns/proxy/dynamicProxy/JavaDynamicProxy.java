package com.wrk.designPatterns.proxy.dynamicProxy;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//用接口去接收
public class JavaDynamicProxy implements DynamicProxyInterface{
    public void method(){
        System.out.println("method");
    }
    public static void main(String[] args) {

        DynamicProxyInterface javaDynamicProxy = new JavaDynamicProxy();

        DynamicProxyInterface proxy = (DynamicProxyInterface)Proxy.newProxyInstance(JavaDynamicProxy.class.getClassLoader(),new Class[]{DynamicProxyInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JavaDynamicProxy+"+method.getName());
                Object invoke = method.invoke(javaDynamicProxy, args);
                return invoke;
            }
        });
        proxy.method();
    }
}
