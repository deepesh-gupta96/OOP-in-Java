/**Modify the Percentages class to accept the values of the two doubles from a user at the keyboard.*/
package com.company;

import java.util.Scanner;
public class Percentages2 {
    public static void main(String[] args) {

        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = sc.nextFloat();
        System.out.println("Enter number 2: ");
        num2 = sc.nextFloat();
        computePercent(num1,num2);

    }

    public static void computePercent(double num1, double num2) {

        double result1 = (num1/num2)*100;
        double result2 = (num2/num1)*100;
        System.out.println(num1+" is "+result1+ " percent of "+num2);
        System.out.println(num2+" is "+result2+ " percent of "+num1);

    }
}
