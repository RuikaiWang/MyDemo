package com.wrk.designPatterns.Decorator;

public class Decorator1 extends DecoratorBase{
    public Decorator1(DecoratorClassInterface decoratorClass) {
        super(decoratorClass);
    }

    @Override
    public void run() {
        System.out.println("Decorator1+");
        super.run();
    }
}
