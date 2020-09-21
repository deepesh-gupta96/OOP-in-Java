/**There are 12 inches in a foot and 3 feet in a yard.
 Create a class named InchConversion.
 Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the entered value to two methods.
 One converts the value from inches to feet, and the other converts the same value from inches to yards.
 Each method displays the results with appropriate explanation.
 * */

package com.company;

import java.util.Scanner;
public class InchConversion {
    public static void main(String[] args) {

        double inches;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in inches: ");
        inches = sc.nextDouble();

        convertToFeet(inches);
        convertToYards(inches);

    }

    public static void convertToFeet(double inches) {
        int foot = 12;
        double result = inches / foot;
        System.out.println(+inches+" inches = "+result+ " feet");
    }
    public static void convertToYards(double inches) {
        double yard = 0.0278;
        double result = inches*yard;
        System.out.println(inches+ " inches = "+result+ " yards");
    }
}
