package com.company;

import java.util.Scanner;
public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number!=999){
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if(number%2==0){
                System.out.println("Good job!");
            }else{
                System.out.println(number+" is not an even number");
            }
        }
    }
}
