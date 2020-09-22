package com.company;

public class BloodData {
    //public static String rhFactor;
    //public static String bloodType;
    private String bloodType;
    private String rhFactor;
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bType, String rh) {
        bloodType = bType;
        rhFactor = rh;
    }
    public void setBloodType(String bType) {
        this.bloodType = bType;

    }
    public String getBloodType() {
        return bloodType;
    }
    public void setRhFactor(String rh) {
        this.rhFactor = rh;
    }
    public String getRhFactor() {
        return rhFactor;
    }
}


/*
* private String bloodType;
    private String rhFactor;
    public BloodData() {
    }
    public BloodData(String bType, String rh) {
    }
    public void setBloodType(String bType) {
    }
    public String getBloodType() {
    }
    public void setRhFactor(String rh) {
    }
    public String getRhFactor() {
    }*/