package com.company;

import java.util.Scanner;
public class CountByAnything {
    public static void main(String[] args) {
        int number, count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        number = sc.nextInt();
        for (int i = number; i <= 500; i+=number) {
            System.out.print(i + " ");
            count++;
            if(count%10==0){
                System.out.println();
            }
        }

    }
}
