package com.company;

import java.util.Scanner;
public class MileConversionsInteractive {
    public static void main(String[] args) {
        final double FEET_IN_MILE = 5280;
        final double INCHES_IN_MILE = 63360;
        final double YARDS_IN_MILE = 1760;
        double Mile=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        Mile = sc.nextFloat();

        double miles_to_inch = Mile*INCHES_IN_MILE;
        double miles_to_feet = Mile*FEET_IN_MILE;
        double miles_to_yards = Mile*YARDS_IN_MILE;


        System.out.println("Miles to Inch: "+miles_to_inch);
        System.out.println("Miles to feet: "+miles_to_feet);
        System.out.println("Miles to yards: "+miles_to_yards);
        System.out.println("Number of miles: "+Mile);
        System.out.println(Mile+" miles is " + miles_to_inch+" inches,or "+miles_to_feet+" feet, or "+miles_to_yards+" yards");



    }
}

