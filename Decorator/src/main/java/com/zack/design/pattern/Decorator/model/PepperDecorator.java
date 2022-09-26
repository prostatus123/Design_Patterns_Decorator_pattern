package com.zack.design.pattern.Decorator.model;

public class PepperDecorator extends  PizzaDecorator {

    public PepperDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = mPizza.doPizza();
        return type + addPepper();
    }

    // This is our additional functionality
    // It adds pepper to existing pizza at runtime
    private String addPepper() {
        return "+ Pepper";
    }
}
