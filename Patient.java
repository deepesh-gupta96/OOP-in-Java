package com.company;

public class Patient {
    private String id;
    private int age;
    private BloodData bloodData;

    public Patient() {

        id = "0";
        age = 0;
        setBloodData(new BloodData("O","+"));


    }

    public Patient(String id, int age, String bType, String rhFactor) {
        this.id = id;
        this.age = age;
        this.setBloodData(new BloodData(bType,rhFactor));

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public BloodData getBloodData() {
        return bloodData;
    }
    public void setBloodData(BloodData b) {
        this.bloodData = b;
    }
}

/*private String id;
    private int age;
    private BloodData bloodData;
    public Patient() {
    }
    public Patient(String id, int age, String bType, String rhFactor) {
    }
    public String getId() {
    }
    public void setId(String id) {
    }
    public int getAge() {
    }
    public void setAge(int age) {
    }
    public BloodData getBloodData() {
    }
    public void setBloodData(BloodData b) {
    }*/
