package com.company;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        /*System.out.println("      T      ");
        System.out.println("     TTT     ");
        System.out.println("    TTTTT    ");
        System.out.println("   TTTTTTT   ");
        System.out.println("  TTTTTTTTT  ");
        System.out.println(" TTTTTTTTTTT ");
        System.out.println("TTTTTTTTTTTTT");
        float a = 20.545626f;
        System.out.printf("%.2f",a);*/

        Scanner input = new Scanner(System.in);
        String costString;
        double cost;
        final double TAX = 0.06;
        System.out.println("Enter price of item you are buying");
        costString = input.next();
        cost = Double.parseDouble(costString);
        System.out.println("With " + TAX * 100 +"% tax, purchase  is $" + (cost + cost * TAX));
    }
}
