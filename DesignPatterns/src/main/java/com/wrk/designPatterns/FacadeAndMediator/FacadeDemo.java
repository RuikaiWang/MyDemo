package com.wrk.designPatterns.FacadeAndMediator;

/**
 * 5.门面模式
 * 门面模式是对一些类/子系统方法调用的封装
 * 对外只提供一个统一的高层接口，内部实现各种调用
 * 典型用法Mq中间件
 */
public class FacadeDemo {
    public static void main(String[] args) {
    new Facade().facadeMethod();
    }
}
