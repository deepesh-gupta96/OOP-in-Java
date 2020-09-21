package com.company;

public class Student {
    int idNumber;
    int hours;
    int points;

    public Student(){
        idNumber = 9999;
        hours = 2;
        points = 12;

    }

    public int getIdNumber(){
    return  idNumber;
    }

    public void setIdNumber(int num_ID){
        idNumber = num_ID;

    }

    public int getHours(){
        return hours;

    }

    public void setHours(int num_hours){
        hours  = num_hours;

    }

    public int getPoints(){

        return points;
    }

    public void setPoints(int num_point){
        points = num_point;

    }

    public void showIdNumber() {
        System.out.println("Student ID: "+getIdNumber());

    }

    public void showHours() {
        System.out.println("Hours: "+getHours());
    }

    public void showPoints() {
        System.out.println("Points: "+getPoints());
    }

    public double getGradePoint() {
        double result = getPoints()/getHours();
        return result;
    }

}
