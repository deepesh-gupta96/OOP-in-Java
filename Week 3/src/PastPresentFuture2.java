package com.company;

import java.util.Scanner;
import java.time.*;
public class PastPresentFuture2 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        int date, month, year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month: ");
        month = sc.nextInt();

        System.out.println("Enter date: ");
        date = sc.nextInt();

        System.out.println("Enter year: ");
        year = sc.nextInt();

        LocalDate d = LocalDate.of(year,month,date);

        if (d.equals(today)){
            System.out.println(d+"is today");
        }
        if (d.isAfter(today)){
                System.out.println(d+"is in the future");
        }
        if (d.isBefore(today)){
            System.out.println(d+"is in the past");
        }

    }
}
