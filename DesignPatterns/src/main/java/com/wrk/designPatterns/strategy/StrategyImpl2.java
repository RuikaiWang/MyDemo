package com.wrk.designPatterns.strategy;

public class StrategyImpl2 implements StrategyInterface<String> {

    @Override
    public void doStrategy(String obj) {
        System.out.println(obj + "策略2");
    }
}
