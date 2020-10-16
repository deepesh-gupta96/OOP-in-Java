package com.company;

public class CountByFives {
    public static void main(String[] args) {
        for (int i = 5; i <= 500; i += 5) {
            System.out.print(i + " ");
            if (i % 50 == 0) {
                System.out.println();
            }
        }
    }
}
