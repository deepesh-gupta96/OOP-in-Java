package com.company;

import java.time.*;
public class TestMonthHandling {
    public static void main(String[] args) {

        LocalDate jan31 = LocalDate.of(2020,Month.JANUARY,31);
        LocalDate dec31 = LocalDate.of(2020,Month.DECEMBER,31);
        System.out.println(jan31);
        System.out.println("When one month is added: "+jan31.plusMonths(1)+"\t"+dec31.plusMonths(1));
        System.out.println("When two month is added: "+jan31.plusMonths(2)+"\t"+dec31.plusMonths(2));
        System.out.println("When three month is added: "+jan31.plusMonths(3)+"\t"+dec31.plusMonths(3));
        System.out.println(dec31);

}}
