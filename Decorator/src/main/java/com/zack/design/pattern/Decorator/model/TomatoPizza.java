package com.zack.design.pattern.Decorator.model;

public class TomatoPizza implements IPizza {
    @Override
    public String doPizza() {
        return "I am a Tomato Pizza";
    }
}
