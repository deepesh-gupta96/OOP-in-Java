package com.company;

public class ShowStduent2 {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.showIdNumber();
        stud.showHours();
        stud.showPoints();

        System.out.println("The grade point average is " + stud.getGradePoint());
    }
}
