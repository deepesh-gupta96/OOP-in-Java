package com.company;

public class Lease {
    private String name;
    private int aptNumber;
    private double rent;
    private int term;
    private static final int FEE = 10;

    public Lease() {
        name = "XXX";
        aptNumber = 0;
        rent = 1000;
        term = 12;
    }

    public void setName(String tenant) {

        this.name = tenant;
    }

    public void setAptNumber(int apt) {
        this.aptNumber = apt;
    }

    public void setRent(double monthRent) {
        this.rent = monthRent;
    }

    public void setTerm(int t) {

        this.term = t;
    }

    public String getName() {
        return name;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public double getRent() {
        return rent;
    }

    public int getTerm() {
        return term;
    }

    public void addPetFee() {
        explainPetPolicy();
        double new_rent = +FEE;
        //System.out.println("New Rent: "+new_rent);

    }

    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 is added to the monthly rent");
    }

}
