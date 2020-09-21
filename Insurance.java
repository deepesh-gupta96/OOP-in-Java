/**The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year.
 * The premium is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20.
 * For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15, and then multiplying by 20.
 * Write an application that prompts a user for the current year then a birth year.
 * Pass both to a method that calculates and returns the premium amount, and then display the returned amount.  */

package com.company;
import java.util.Scanner;
public class Insurance {
    public static void main(String[] args) {
        int birth, current_year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current year: ");
        current_year = sc.nextInt();
        System.out.println("Enter birth:");
        birth = sc.nextInt();

        int premium = calculatePremium(current_year, birth);
        System.out.println("Premium amount = "+premium);

    }

    private static int calculatePremium(int current_year, int birth) {

        int age = (current_year - birth)/10;
        int premium = (age +15)*20;
        return premium;

    }
}
