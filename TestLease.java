package com.company;

import java.util.Scanner;
public class TestLease {
    public static void main (String args[])
    {
        Lease one = new Lease();
        Lease two = new Lease();
        Lease three = new Lease();
        Lease four = new Lease();
        one = getData();
        two = getData();
        three = getData();
        showValues(one);
        one.addPetFee();
        showValues(one);
        showValues(two);
        showValues(three);
        showValues(four);

        /*Lease one = new Lease();
        one = getData();
        showValues(one);*/

    }
    public static void showValues(Lease ls)
    {
        System.out.println("\n\nYour lease results:" +
                "\nName      : " + ls.getName() +
                "\nApartment : " + ls.getAptNumber() +
                "\nRent      : " + ls.getRent() +
                "\nTerm      : " + ls.getTerm());
    }
    public static Lease getData() {

        Lease lse = new Lease();

        String name;
        int aptNumber;
        double rent;
        int term;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tenant Name: ");
        name = sc.nextLine();
        lse.setName(name);

        System.out.println("Enter Apartment Number: ");
        aptNumber = sc.nextInt();
        lse.setAptNumber(aptNumber);

        System.out.println("Enter Rent: ");
        rent = sc.nextDouble();
        lse.setRent(rent);

        System.out.println("Enter Lease Term: ");
        term = sc.nextInt();
        lse.setTerm(term);

        return lse;

    }
}
