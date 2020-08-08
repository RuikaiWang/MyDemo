package com.wrk.designPatterns.Decorator;

public abstract class DecoratorBase implements DecoratorClassInterface{
    protected DecoratorClassInterface decoratorClass;

    public DecoratorBase(DecoratorClassInterface decoratorClass) {
        this.decoratorClass = decoratorClass;
    }
    @Override
    public void run() {
        decoratorClass.run();
    }
}
