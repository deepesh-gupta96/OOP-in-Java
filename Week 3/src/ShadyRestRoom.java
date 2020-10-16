/*Write an application for the Shady Rest Hotel;
the program determines the price of a room. Ask the user to choose 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch.
The output echoes the input and displays the price of the room:
$125 for queen, $139 for king, and $165 for suite with king bed and a pullout couch.
If the user enters an invalid code, display You selected an invalid option and set the price to 0.*/
package com.company;

import java.util.Scanner;
public class ShadyRestRoom {
    public static void main(String[] args) {
        int option;

        System.out.println("1 for a queen bed \n 2 for a king \n  3 for a king and a pullout couch.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option: ");
        option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Option: "+option+ " Selected ");
                int r1 = 125;
                System.out.println(r1+" for queen");

                break;
            case 2:
                System.out.println("Option: "+option+ " Selected ");
                int r2 = 139;
                System.out.println(r2+" for king");

                break;
            case 3:
                System.out.println("Option: "+option+ " Selected ");
                int r3 = 165;
                System.out.println(r3+" for suite with king bed and a pullout couch.");

                break;
            default:
                System.out.println("You selected an invalid option");
                System.out.println("price 0");
        }

    }
}
