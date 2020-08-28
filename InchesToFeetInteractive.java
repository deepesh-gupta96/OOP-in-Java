/**Write an interactive version of the InchesToFeet class that accepts the inches value from a user.*/
package com.company;

import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        int inches = 0;
        final int lenght_in_inch = 12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in inches: ");
        inches = sc.nextInt();

        int length_inch =  inches % lenght_in_inch;
        int lenght_foot = (inches-length_inch)/lenght_in_inch;

        System.out.println(inches+" inches is "+lenght_foot+ " feet and "+length_inch+ " inches");
    }
}
