package com.company;

import java.util.Scanner;
import java.time.*;
public class TenThousandDaysOld {
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(1996,2,5);
        int DAYS = 10000;
        LocalDate futuredate = a.plusDays(DAYS);
        System.out.println("Present date: "+a);
        System.out.println("I will be 10000 days old on "+futuredate+".");

    }
}
