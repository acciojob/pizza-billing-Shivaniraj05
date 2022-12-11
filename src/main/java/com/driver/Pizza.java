package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    //private String bill;
    private int extraCheesePrice=80;
    private int extraVegToppingsPrice=70;
    private int extraNonVegToppingsPrice=120;
    private int bagPrice=20;
    private int vegBasePrice=300;
    private int nonVegBasePrice=400;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeAway=false;
    private int toppingsPrice;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=vegBasePrice;
        }
        else{
            this.price=nonVegBasePrice;
        }
        basePizzaPrice=this.price;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        // your code goes here
        this.price+=extraCheesePrice;
    }

    public void addExtraToppings(){
        // your code goes here
        isExtraToppingsAdded=true;
        if(isVeg){
            this.price+=extraVegToppingsPrice;
            toppingsPrice=extraVegToppingsPrice;
        }
        else{
            this.price+=extraNonVegToppingsPrice;
            toppingsPrice=extraVegToppingsPrice;
        }
    }

    public void addTakeaway(){
        isTakeAway=true;
        // your code goes here
        this.price+=bagPrice;
    }

    public void getBill() {
        // your code goes here
        String bill = "";
        System.out.println("Base Price Of The Pizza: " + basePizzaPrice);

        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + toppingsPrice + "\n";
        }

        if (isTakeAway) {
            bill += "Paperbag Added: " + bagPrice + "\n";
        }
        bill += "Total Price: " + this.price + "\n";
        System.out.println(bill);
    }
}





















