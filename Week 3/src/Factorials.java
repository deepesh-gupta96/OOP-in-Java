package com.company;

public class Factorials {
    public static void main(String[] args) {

        long fact = 1;
        for(int i = 1; i <= 10; i++)
        {
            fact = fact * i;
            System.out.println("The factorial of "+i+" is: "+fact);
        }
    }
}
