package com.company;

import java.util.Scanner;
public class AcmePay {
    public static void main(String[] args) {
        final double pay_first_shift = 17;
        final double pay_second_shift = 18.5;
        final double pay_third_shift = 22;
        int hours_work, shift;
        int retirement;
        int overtime;
        double total_pay, net_pay,deduction_pay;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter shift 1 or 2 or 3: ");
        shift = sc.nextInt();

        System.out.println("Enter enter of hours worked: ");
        hours_work = sc.nextInt();

        if(shift == 1){
            if (hours_work <= 40){

                total_pay = hours_work * pay_first_shift;
                System.out.println("Regualr total_pay: $"+total_pay);
                System.out.println("Overtime total_pay: $0.0 ");
            }

            else {
                overtime = hours_work - 40;
                double r_pay = 40*pay_first_shift;
                double o_pay = overtime * (pay_first_shift*1.5);
                total_pay = o_pay + r_pay;
                System.out.println("Regular total_pay: $"+r_pay);
                System.out.println("Overtime total_pay: $"+o_pay);
            }

            System.out.println("Hours worked: "+hours_work);
            System.out.println("Shift: "+shift);
            System.out.println("Hourly Pay: $"+pay_first_shift);
            System.out.println("Total of regular and overtime total_pay: $"+total_pay);
            System.out.println("Retirement deduction: 0.0");
            System.out.println("Net total_pay: $"+total_pay);
        }

        if(shift == 2){
            System.out.println("Want to participate in retirement plan 1(yes), 2(no): ");
            retirement = sc.nextInt();
            if (retirement == 1){

                if (hours_work <= 40){

                    total_pay = hours_work * pay_second_shift;
                    System.out.println("Regualr total_pay: $"+total_pay);
                    System.out.println("Overtime total_pay: $0.0 ");
                    deduction_pay = total_pay*0.03;
                    net_pay = total_pay - deduction_pay;
                }

                else {
                    overtime = hours_work - 40;
                    double r_pay = 40*pay_second_shift;
                    double o_pay = overtime * (pay_second_shift*1.5);
                    total_pay = o_pay + r_pay;
                    System.out.println("Regular total_pay: $"+r_pay);
                    System.out.println("Overtime total_pay: $"+o_pay);
                    deduction_pay = 0.0;
                    net_pay = total_pay;
                }
            }

            else {
                if (hours_work <= 40){

                    total_pay = hours_work * pay_second_shift;
                    System.out.println("Regualr total_pay: $"+total_pay);
                    System.out.println("Overtime total_pay: $0.0 ");
                    deduction_pay = 0.0;
                    net_pay = total_pay;
                }

                else {
                    overtime = hours_work - 40;
                    double r_pay = 40*pay_second_shift;
                    double o_pay = overtime * (pay_second_shift*1.5);
                    total_pay = o_pay + r_pay;
                    System.out.println("Regular total_pay: $"+r_pay);
                    System.out.println("Overtime total_pay: $"+o_pay);
                    deduction_pay = 0.0;
                    net_pay = total_pay;
                }
            }
            System.out.println("Hours worked: "+hours_work);
            System.out.println("Shift: "+shift);
            System.out.println("Hourly Pay: $"+pay_second_shift);
            System.out.println("Total of regular and overtime total_pay: $"+total_pay);
            System.out.println("Retirement deduction: "+deduction_pay);
            System.out.println("Net total_pay: $"+net_pay);
        }

        if(shift == 3){
            System.out.println("Want to participate in retirement plan 1(yes), 2(no): ");
            retirement = sc.nextInt();
            if (retirement == 1){

                if (hours_work <= 40){

                    total_pay = hours_work * pay_third_shift;
                    System.out.println("Regualr total_pay: $"+total_pay);
                    System.out.println("Overtime total_pay: $0.0 ");
                    deduction_pay = total_pay*0.03;
                    net_pay = total_pay - deduction_pay;
                }

                else {
                    overtime = hours_work - 40;
                    double r_pay = 40*pay_third_shift;
                    double o_pay = overtime * (pay_third_shift*1.5);
                    total_pay = o_pay + r_pay;
                    System.out.println("Regular total_pay: $"+r_pay);
                    System.out.println("Overtime total_pay: $"+o_pay);
                    deduction_pay = total_pay*0.03;
                    net_pay = total_pay - deduction_pay;
                }
            }

            else {

                if (hours_work <= 40){

                    total_pay = hours_work * pay_third_shift;
                    System.out.println("Regualr total_pay: $"+total_pay);
                    System.out.println("Overtime total_pay: $0.0 ");
                    deduction_pay = 0.0;
                    net_pay = total_pay;
                }

                else {
                    overtime = hours_work - 40;
                    double r_pay = 40*pay_third_shift;
                    double o_pay = overtime * (pay_third_shift*1.5);
                    total_pay = o_pay + r_pay;
                    System.out.println("Regular total_pay: $"+r_pay);
                    System.out.println("Overtime total_pay: $"+o_pay);
                    deduction_pay = 0.0;
                    net_pay = total_pay;
                }
            }
            System.out.println("Hours worked: "+hours_work);
            System.out.println("Shift: "+shift);
            System.out.println("Hourly Pay: $"+pay_third_shift);
            System.out.println("Total of regular and overtime total_pay: $"+total_pay);
            System.out.println("Retirement deduction: "+deduction_pay);
            System.out.println("Net total_pay: $"+net_pay);
        }

    }
}
