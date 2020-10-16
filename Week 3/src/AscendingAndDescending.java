package com.company;

import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        n1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        n2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        n3 = sc.nextInt();

         if ((n1 > n2 && n1 > n3))
        {
            if(n2 > n3) {
                System.out.println("Ascending: "+n3 + " " + n2 + " " + n1);
                System.out.println("Descending: "+n1 + " " + n2 + " " + n3);
            }
            else {
                System.out.println("Ascending: "+n2 + " " + n3 + " " + n1);
                System.out.println("Descending: "+n1 + " " + n3 + " " + n2);
            }
        }

        if ((n2 > n1 && n2 > n3)) {
            if(n1 > n3) {
                System.out.println("Ascending: "+n3 + " " + n1 + " " + n2);
                System.out.println("Descending: "+n2 + " " + n1 + " " + n3);
            }
            else {
                    System.out.println("Ascending: "+n1 + " " + n3 + " " + n2);
                    System.out.println("Descending: "+n2 + " " + n3 + " " + n1);
                }
        }

        if ((n3 > n1 && n3 > n2)) {

            if(n1 > n2) {
                System.out.println("Ascending: "+n2 + " " + n1 + " " + n3);
                System.out.print("Descending: "+n3 + " " + n1 + " " + n2);
            }
            else{
                System.out.println("Ascending: "+n1 + " " + n2 + " " + n3);
                System.out.println("Descending: "+n3 + " " + n2 + " " + n1);
            }
        }
    }
}