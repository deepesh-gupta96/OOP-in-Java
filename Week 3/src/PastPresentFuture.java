/*Write an application that prompts a user for a month, day, and year. Then display the appropriate message:

Y is not this year
M was a month earlier this year
M is a month later this year
M is this month*/

package com.company;

import java.util.*;
import java.time.*;
public class PastPresentFuture {
    public static void main(String[] args) {

        LocalDate current = LocalDate.now();

        int date, month, year;
        int current_year, current_month, current_date;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date: ");
        date = sc.nextInt();

        System.out.println("Enter month: ");
        month = sc.nextInt();

        System.out.println("Enter year: ");
        year = sc.nextInt();



        current_month = current.getMonthValue();
        current_date = current.getDayOfMonth();
        current_year = current.getYear();


        if (year != current_year){
            System.out.println(year + " is not this year");
        }
        else
            if (month<current_month){
                System.out.println(month + " was a earlier month this year");
            }

            else
                if (month>current_month){
                System.out.println(month + " is a month later this year");
            }
                else
                System.out.println(month + "is this month");
    }
}
//((\d{4} is not this year)|(\d{2}( was an earlier month this year| is a month later this year| is this month))|(\d{1}
//( was an earlier month this year| is a month later this year| is this month))|(Write your code here))