package com.company;

import java.util.Scanner;
import java.util.Vector;

public class RetirementGoal2 {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int years;
        int saveAmount;
        double total;
        final double RATE = 0.04;
        double  n=0, sum = 0;

        System.out.print("How many years until retirement?: ");
        years = input.nextInt();
        while(years <= 0)
        {
            System.out.println("Years cannot be 0 or negative ");
            System.out.print("Please renter years above 0:");
            years = input.nextInt();
        }
        System.out.print("How much can you save annually? ");
        saveAmount = input.nextInt();
        while(saveAmount <= 0)
        {
            System.out.println("Amount cannot be 0 or negative");
            System.out.print("Please renter amount above 0: ");
            saveAmount = input.nextInt();
        }
        total = saveAmount * years;
        System.out.println("If you save $" + saveAmount +" for " + years + " you will have $" + total);

        Vector <Double>marks = new Vector();

        double total2 = saveAmount;

           for(int y = 0; y < years; ++y)
            {
                total2 = (total2+ (total2*0.04));
                marks.add(total2);

            }
        for(int i=0; i<=marks.size()-1; i++) {
            n = marks.get(i);
            sum += marks.get(i);
        }
           System.out.println("If you save $" + saveAmount + " for " + years + " years, with " + (RATE * 100) +
                  "% interest, you will have $" + sum);
    }
}

