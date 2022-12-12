package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected int extraCheesePrice=0;
    protected int extraToppingsPrice=0;
    protected int bagPrice=0;
    protected int total=0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
    }

    public int getPrice(){

        return (price+extraCheesePrice+extraToppingsPrice+bagPrice);
    }

    public void addExtraCheese(){
        extraCheesePrice+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            extraToppingsPrice+=70;
        }
        else{
            extraToppingsPrice+=120;
        }
    }

    public void addTakeaway(){
        bagPrice+=20;
    }

    public String getBill() {
        // your code goes here
        if (isVeg == true) {
            bill = "Base Price Of The Pizza: 300" + "\n";
            total += 300;
        }
        else if (isVeg == false) {
            bill = "Base Price Of The Pizza: 400" + "\n";
            total += 400;
        }
        if (extraCheesePrice >= 80) {
            bill += "Extra Cheese Added: 80" + "\n";
            total += 80;
        }

        if (isVeg == true && extraToppingsPrice >= 70) {
            bill += "Extra Toppings Added: 70" + "\n";
            total += 70;

        } else if (isVeg == false && extraToppingsPrice >= 120) {
            bill += "Extra Toppings Added: 120" + "\n";
            total += 120;
        }

        if (bagPrice >= 20) {
            bill += "Paperbag Added: 20" + "\n";
            total += 20;
        }

        bill += "Total Price: " + total + "\n";
        total = 0;
        return bill;
    }
}





















