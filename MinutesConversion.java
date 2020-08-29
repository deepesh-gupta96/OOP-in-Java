package com.company;
/**Write a program that accepts a number of minutes and converts it both to hours and days.
 * For example, 6000 minutes is 100.0 hours or 4.166666666666667 days.*/

import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) {
        int minutes;
        double hours,days;
        final double one_hr = 60;
        final double one_day = 1440;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minitues: ");
        minutes = sc.nextInt();

        hours = minutes/one_hr;
        days = minutes/one_day;

        System.out.println(minutes + " minutes is "+ hours +" hours or "+days+" days." );

    }

}

