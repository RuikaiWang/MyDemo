package com.wrk.designPatterns.strategy;

public class StrategyMethodClass<T> {
    public void myMeethod(T obj, StrategyInterface<T> strategyInterface) {
        strategyInterface.doStrategy(obj);
    }
}
