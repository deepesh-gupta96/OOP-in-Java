/**Write a program that accepts the names of three political parties and the number of votes each received in the last mayoral election.
 *  Display the percentage of the vote each party received.*/
package com.company;

import java.util.Scanner;
public class ElectionStatistics {
    public static void main(String[] args) {
        String party1, party2, party3;
        float vote_party1, vote_party2, vote_party3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of Political Party 1: ");
        party1 = sc.next();

        System.out.println("Enter number of votes for Political Party 1: ");
        vote_party1 = sc.nextFloat();

        System.out.println("Enter name of Political Party 2: ");
        party2 = sc.next();

        System.out.println("Enter number of votes for Political Party 2: ");
        vote_party2 = sc.nextFloat();

        System.out.println("Enter name of Political Party 3: ");
        party3 = sc.next();

        System.out.println("Enter number of votes for Political Party 3: ");
        vote_party3 = sc.nextFloat();

        float total_votes = vote_party1 + vote_party2 + vote_party3;
        float percent_party1 = (vote_party1/total_votes)*100;
        float percent_party2 = (vote_party2/total_votes)*100;
        float percent_party3 = (vote_party3/total_votes)*100;

        System.out.println(percent_party1+ " %percentage of the vote party "+party1+ " received");
        System.out.println(percent_party2+ " %percentage of the vote party "+party2+ " received");
        System.out.println(percent_party3+ " %percentage of the vote party "+party3+ " received");

    }
}
