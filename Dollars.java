/**Write a program that calculates and displays the conversion of an entered number of dollars into currency denominations—20s, 10s, 5s, and 1s.
 * Example output: $452 converted is 22 $20s, 1 $10s, 0 $5s, and 2 $1s.*/
package com.company;

import java.util.Scanner;
public class Dollars {
    public static void main(String[] args) {

        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        amount = sc.nextInt();

        int twenty = amount/20;
        int ten = (amount - 20*twenty)/10;
        int five = (amount-(20*twenty+10*ten))/5;
        //int two = (amount-(20*twenty+10*ten+5*five))/2;
        int one = (amount-(20*twenty+10*ten+5*five))/1;

        System.out.println("$"+amount+" converted is "+twenty+" $20s, "+ten+" $10s, "+five+" $5s and, " +one+ " $1s.");

    }
}