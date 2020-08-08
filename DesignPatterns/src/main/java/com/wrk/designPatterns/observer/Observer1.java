package com.wrk.designPatterns.observer;


public class Observer1 implements ObserverInterface {
    @Override
    public void observerMethod(Event event) {
        Source source = (Source) event.getSource();
        System.out.println("观察者1"+source.getParam());
    }
}
