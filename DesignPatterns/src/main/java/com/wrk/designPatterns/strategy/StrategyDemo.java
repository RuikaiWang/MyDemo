package com.wrk.designPatterns.strategy;

/**
 * 2.策略模式
 * 对某个方法的实现抽出接口，运行时用不同的实现类代替该方法从而灵活实现该方法
 * 本质上是对多态的应用，对方法进行解耦
 */
public class StrategyDemo {
    public static void main(String[] args) {
        StrategyMethodClass<String> stringStrategyMethodClass = new StrategyMethodClass<>();
        stringStrategyMethodClass.myMeethod("myMethod",new StrategyImpl1());
        stringStrategyMethodClass.myMeethod("myMethod",new StrategyImpl2());
        stringStrategyMethodClass.myMeethod("myMethod",(stringObj) -> System.out.println(stringObj+"函数式接口实现"));

    }
}
