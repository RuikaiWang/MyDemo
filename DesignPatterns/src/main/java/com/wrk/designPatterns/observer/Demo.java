package com.wrk.designPatterns.observer;

/**
 * 观察者模式
 * 被观察对象（源）维护观察者列表并触发事件
 * 观察者实现接口，只接收事件变量（只关心事件），并根据事件触发相应的方法（对具体事件判断）
 * 抽象出事件更灵活的更换被观察者，可以为不同的被观察者掉同一个观察者
 * 事件维护Source变量，传递给具体的观察者。
 */
public class Demo {
    public static void main(String[] args) {
        Source source = new Source();
        source.beginEvent();
    }
}
