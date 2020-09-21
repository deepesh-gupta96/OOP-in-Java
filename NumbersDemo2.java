/**Modify the NumbersDemo class to accept the values of the two integers from a user at the keyboard.*/
package com.company;

import  java.util.Scanner;
public class NumbersDemo2 {

    public static void main(String[] args) {
        int var1;
        int var2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        var1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        var2 = sc.nextInt();
        displayTwiceTheNumber(var1);
        displayNumberPlusFive(var1);
        displayNumberSquared(var1);
        displayTwiceTheNumber(var2);
        displayNumberPlusFive(var2);
        displayNumberSquared(var2);

    }

    public static void displayTwiceTheNumber(int var1) {

        int result1 = var1 + var1;
        System.out.println(var1+" times 2 is "+result1);
    }

    public static void displayNumberPlusFive(int var1){

        int result1 = var1 + 5;
        System.out.println(var1+" plus 5 is "+result1);

    }

    public static void displayNumberSquared(int var1) {
        int result1 = var1 * var1;
        System.out.println(var1+" squared is "+result1);
    }
}
