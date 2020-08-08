package com.wrk.designPatterns.observer;

public class MyEvent extends Event {
    String param;
    Object source;

    public MyEvent(String param, Object source) {
        this.param = param;
        this.source = source;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public Object getSource() {
        return source;
    }

    @Override
    public void setSource(Object source) {
        this.source = source;
    }
}
