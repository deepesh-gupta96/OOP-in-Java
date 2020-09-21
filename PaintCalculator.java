/**Assume that a gallon of paint covers about 350 square feet of wall space.
 * Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room.
 * Pass these three values to a method that does the following:
 Calculates the wall area for a room
 Passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed
 Displays the number of gallons needed. Computes the price based on a paint price of $32 per gallon,
 assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon
 Returns the price to the main() method*/

package com.company;
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        int paint_square = 350;
        double length, width, height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        length = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();

        double area = computeArea(length, width, height);
        double price =  computeGallons(area);
        //System.out.println(area);
        //System.out.println(price);

        System.out.println("The price to paint the room is "+price);
    }
    public static double computeArea(double length, double width, double height){

        double area = width * height;
        System.out.println("Wall of the are: "+area);
        return area;

    }

    private static double computeGallons(double area) {

        double gallons_need = area/100;
        System.out.println("You will need: "+gallons_need+" gallons");
        double  price =  gallons_need * 32;
        //System.out.println("Price: " +price);
        return price;
    }

}
