package com.wrk.designPatterns.Decorator;

public class Decorator2 extends DecoratorBase{
    public Decorator2(DecoratorClassInterface decoratorClass) {
        super(decoratorClass);
    }

    @Override
    public void run() {
        System.out.println("Decorator2+");
        super.run();
    }
}
