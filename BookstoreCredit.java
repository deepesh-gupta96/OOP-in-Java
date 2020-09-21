package com.company;

/**To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 10
 * times the student’s grade point average. In other words, a student with a 3.2 grade point average receives a $32.0 credit.
 * Create an application that prompts a student for a name and grade point average,
 * and then passes the values to a method (computeDiscount) that displays a descriptive message.
 * The message uses the student’s name, echoes the grade point average, and computes and displays the credit, as follows:
 * John, your GPA is 3.4, so your credit is $34.0.*/


import java.util.Scanner;
public class BookstoreCredit {
    public static void main(String[] args) {
        String name;
        double gpa;
        final double credit = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.println("Enter GPA: ");
        gpa = sc.nextDouble();
        computeDiscount(name, gpa, credit);
    }

    private static void computeDiscount(String name, double gpa, double credits) {

        double total_credits = gpa * credits;
        System.out.println(name+ ", your GPA is "+gpa+", so your credit is $"+total_credits+".");
    }
}
