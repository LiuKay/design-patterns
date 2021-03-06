package com.kay.designpatterns.decorator.ex1;

/**
 * 浓咖啡
 * Created by Kai.L on 8/14/2019
 */
class Espresso extends AbstractBeverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
