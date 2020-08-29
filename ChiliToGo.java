/**The Huntington Boys and Girls Club is conducting a fundraiser by selling chili dinners to go.
 * The price is $7.00 for an adult meal and $4.00 for a child’s meal.
 * Write a program that accepts the number of adult meals ordered and then children's meals ordered.
 * Display the total money collected for adult meals, children’s meals, and all meals.*/

package com.company;

import java.util.Scanner;
public class ChiliToGo {
    public static void main(String[] args) {
        float price_adult = 7.00f;
        float price_child = 4.00f;
        int number_adult, number_child;
        float total_price_adult,total_price_child,total_all_meals;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of adults and child: ");
        number_adult = sc.nextInt();
        number_child = sc.nextInt();
        total_price_adult = number_adult * price_adult;
        total_price_child = price_child * number_child;
        total_all_meals = total_price_adult + total_price_child;
        System.out.println("the total money collected for adult meals, children’s meals, and all meals"+total_price_adult+
                ","+total_price_child+"and "+total_all_meals);
    }
}
