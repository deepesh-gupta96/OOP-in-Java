/**Meadowdale Dairy Farm sells organic brown eggs to local customers.
 * It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.
 * Write a program that prompts a user for the number of eggs in the order and
 * then display the amount owed with a full explanation using the following wording:
 * You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.*/

package com.company;
import jdk.nashorn.internal.scripts.JO;
import javax.swing.JOptionPane;

public class Eggs {
    public static void main(String[] args) {
        final int dozen = 12;
        double price_dozen = 3.25;
        double loose_egg_price = 0.45;
        String number_of_eggs;

        number_of_eggs = JOptionPane.showInputDialog(null,"Enter number of eggs");
        int eggs = Integer.parseInt(number_of_eggs);
        int number_of_dozen = eggs/dozen;
        int number_of_loose_egg = eggs%dozen;
        double total_price =  (number_of_dozen * price_dozen) + (number_of_loose_egg * loose_egg_price);
        System.out.println("You ordered "+eggs+" eggs. That's "+number_of_dozen+" dozen at $3.25 per dozen and "+number_of_loose_egg+" loose eggs at " +
                "45 cents each for a total of $"+total_price+".");
    }
}
