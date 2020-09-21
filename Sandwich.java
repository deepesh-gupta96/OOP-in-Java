package com.company;

public class Sandwich {
    public String MainIngredient;
    public String bread;
    public double price;

    public String getMainIngredient(){
        return MainIngredient;
    }

    public void setMainIngredient(String name){
        MainIngredient = name;
    }

    public String getBread(){

        return bread;
    }

    public void setBread(String breadn){
        bread = breadn;
    }

    public double getPrice(){

        return price;
    }

    public void setPrice(double pricen){

        price = pricen;
    }
}
