/**In the ChiliToGo program in Exercise 12, the costs to produce an adult meal and a child’s meal are $4.35 and $3.10, respectively.
 * Adult meals are sold for $7 and children's meals are sold for $4.
 * Modify the ChiliToGo program to display the total profit for each type of meal as well as the grand total profit.*/
package com.company;

import java.util.Scanner;
public class ChiliToGoProfit {
    public static void main(String[] args) {
        float old_price_adult = 7.00f;
        float old_price_child = 4.00f;

        float new_price_adult = 4.35f;
        float new_price_child = 3.10f;

        int number_adult, number_child;

        float old_total_price_adult,old_total_price_child,old_total_all_meals,new_total_price_adult,
                new_total_price_child,new_total_all_meals,grand_total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of adults: ");
        number_adult = sc.nextInt();
        System.out.print("Enter number of childs: ");
        number_child = sc.nextInt();
        old_total_price_adult = number_adult * old_price_adult;
        old_total_price_child = old_price_child * number_child;
        old_total_all_meals = old_total_price_adult + old_total_price_child;

        new_total_price_adult = number_adult * new_price_adult;
        new_total_price_child = number_child * new_price_child;
        new_total_all_meals = new_total_price_adult + new_total_price_child;

        System.out.println("Total Profit of adult meal: "+(old_total_price_adult - new_total_price_adult));
        System.out.println("Total Profit of child meal: "+(old_total_price_child-new_total_price_child));
        System.out.println("Grad Total: "+(old_total_all_meals - new_total_all_meals));
    }
}
