package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if (isVeg) {
            this.extraCheesePrice = 80;
            this.extraToppingsPrice = 70;
        } else {
            this.extraCheesePrice = 80;
            this.extraToppingsPrice = 120;
        }
    }
}
