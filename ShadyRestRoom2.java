package com.company;

import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        int option;
        int num;

        System.out.println("1 for a queen bed \n 2 for a king \n  3 for a king and a pullout couch.");
        System.out.println("(1) lake view or a (2) park view");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option: ");
        option = sc.nextInt();
        System.out.println("Enter 1 or 2");
        num = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Option: "+option+ " Selected ");
                int r1 = 125+15;
                System.out.println(r1+" for queen");
                System.out.println(num+ " selected an invalid option");
                break;
            case 2:
                System.out.println("Option: "+option+ " Selected ");
                int r2 = 139+15;
                System.out.println(r2+" for king");
                System.out.println(num+ " selected an invalid option");
                break;
            case 3:
                System.out.println("Option: "+option+ " Selected ");
                int r3 = 165+15;
                System.out.println(r3+" for suite with king bed and a pullout couch.");
                System.out.println(num+ " selected an invalid option");
                break;
            default:
                System.out.println("You selected an invalid option");
                System.out.println("price 0");
        }

    }
}
