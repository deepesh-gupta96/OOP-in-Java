/**Write a program that declares a variable named inches, which holds a length in inches, and assign a value.
 * Display the value in feet and inches; for example: 86 inches is 7 feet and 2 inches.
 * Be sure to use a named constant where appropriate.*/
package com.company;

public class InchesToFeet {
    public static void main(String[] args) {
        int inches = 86;
        final int lenght_in_inch = 12;

        int length_inch =  inches % lenght_in_inch;
        int lenght_foot = (inches-length_inch)/lenght_in_inch;

        System.out.println(inches+" inches is "+lenght_foot+ " feet and "+length_inch+ " inches");
    }
}

