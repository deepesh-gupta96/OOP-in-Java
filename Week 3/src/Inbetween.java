package com.company;

import java.util.Scanner;
public class Inbetween {
    public static void main(String[] args) {
        int x,y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        x = sc.nextInt();
        System.out.println("Enter number 2: ");
        y = sc.nextInt();

        if (x < y){
            for(int i = x+1; i < y; i++)
            {
                System.out.println(i);
            }
            System.out.println("There are no integers between " +x+ " and " +y);
        }

        else if (x>y){
            for (int i = x-1; i>y;i--){
                System.out.println(i);
            }
            System.out.println("XYZ");
        }

        else {
            System.out.println("ABCD");
            System.out.println("There are no integers between " +x+ " and " +y);
        }
    }
}

