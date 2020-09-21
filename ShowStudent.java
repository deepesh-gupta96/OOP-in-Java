package com.company;

public class ShowStudent {

    public static void main(String[] args) {
        Student stud = new Student();
        stud.setIdNumber(1001);
        stud.setHours(3);
        stud.setPoints(12);

        stud.showIdNumber();
        stud.showHours();
        stud.showPoints();

        /*System.out.println("Student ID: "+stud.getIdNumber());
        System.out.println("Hours: "+stud.getHours());
        System.out.println("Points: "+stud.getPoints());*/
        System.out.println("The grade point average is " + stud.getGradePoint());
    }
}
