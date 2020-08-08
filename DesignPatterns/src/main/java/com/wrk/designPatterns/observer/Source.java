package com.wrk.designPatterns.observer;

import java.util.ArrayList;

public class Source {
    private String param;
    private ArrayList<ObserverInterface> observers = new ArrayList<>();

    {
        observers.add(new Observer1());
        observers.add(new Observer2());
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void beginEvent(){
        this.param = "被观察者";
        for (ObserverInterface observer : observers) {
            observer.observerMethod(new MyEvent(null,this));
        }
    }
}