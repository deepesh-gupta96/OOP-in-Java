/**Herbert’s Home Repair estimates each job cost as the cost of materials plus $35 per hour while on the job,
 * plus $12 per hour for travel time to the job site. The main() method prompts the user for the name of a job (
 * for example, Smith bathroom remodel, the cost of materials, the number of hours of work required, and the number of hours travel time.
 * Pass the numeric data to a method that computes an estimate for the job and returns the computed value to the main()
 * method which displays the job name and estimated price*/
package com.company;

import java.util.Scanner;
public class JobPricing {
    public static void main(String[] args) {
        String description;
        double materials;
        double hoursOnJob;
        double hoursTraveling;
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter job description: ");
        description = sc.nextLine();
        System.out.print("Enter cost of materials: ");
        materials = sc.nextDouble();
        System.out.print("Enter hours on the job work: ");
        hoursOnJob = sc.nextDouble();
        System.out.print("Enter hours traveling: ");
        hoursTraveling = sc.nextDouble();
        price = computePrice(materials, hoursOnJob, hoursTraveling);
        System.out.println("The price for " + description + " is $" + price);
    }

    public static double computePrice(double materials, double hoursOnJob, double hoursTraveling){

        //double total_price_job = hoursOnJob *35;
        //double total_price_travel = hoursTraveling * 12;
        double price = materials + (hoursOnJob *35) + (hoursTraveling * 12);
        return price;
    }
}
