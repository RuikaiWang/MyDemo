package com.wrk.designPatterns.FacadeAndMediator;

public class Facade {
    public void facadeMethod(){
        new FacadeClass1().method();
        new FacadeClass2().method();
        new FacadeClass3().method();
    }
}
