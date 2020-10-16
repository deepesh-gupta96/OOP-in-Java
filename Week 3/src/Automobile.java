package com.company;

public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;
    public Automobile(int id, String make, String model, String color, int year, double mpg) {

        this.make = make;
        this.model = model;
        this.color = color;
        this.id = id;
        this.year = year;
        this.mpg = mpg;






    }
    public void setId(int id) {
        if (id>0 && id<9999)
            this.id = id;

        else
            this.id =0;

    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int yr) {
        if (yr > 2005 &&  yr<2019){
            this.year = yr;
        }
        else
            this.year = 0;;
    }
    public void setMpg(double mpg) {
        if (mpg>10 && mpg<60){
            this.mpg= mpg;
        }
        else
            this.mpg = 0;
    }

    public int getId() {
        return id;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public double getMpg() {
        return mpg;
    }
}
