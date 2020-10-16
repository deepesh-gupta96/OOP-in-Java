/*Write an application that asks a user to enter an integer. Display a statement that indicates whether the integer is even or odd.*/
package com.company;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number%2==0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");

    }
}
