package com.company;

import java.util.Scanner;
public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int quarts = quartsNeeded % QUARTS_IN_GALLON;
        int gallons = (quartsNeeded - quarts)/QUARTS_IN_GALLON;
        System.out.print("Number of gallons: "+gallons);
        System.out.print("\nNumber of quarts: "+quarts);
        System.out.println("\nA job that needs 18 quarts requires " + gallons + " gallons plus " + quarts + " quarts");
    }
}

