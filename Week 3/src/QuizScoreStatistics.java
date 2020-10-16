package com.company;

import java.util.Scanner;
import java.util.Vector;

public class QuizScoreStatistics {
    public static void main(String[] args) {
        int score;
        int highest = 0;
        int lowest = 0;
        double avg = 0.0;
        int high_score = 0, low_score = 10;
        int sum = 0;
        final int a = 99;
        Scanner sc = new Scanner(System.in);
        Vector <Integer> marks = new Vector();

        System.out.println(" Enter score: Type 99 to exit");

        do {
            System.out.println("Enter score: ");
            score = sc.nextInt();

            if ((score >= 0 && score <= 10) | score == a) {
                if (score != a) {
                    marks.add(score);

                    if (score > high_score) {
                        highest = score;
                    }
                        if (score < low_score) {
                        lowest = score;
                    }
                    low_score = score;
                    high_score = score;
                }
                else{
                    System.out.println("End of program");
                }
            } else {
                System.out.println("Score must be between 10 and 0: ");
            }
        }
        while (score != a);
            double n = 0;

            for(int i=0; i<=marks.size()-1; i++) {
                n = marks.get(i);
                sum += marks.get(i);
        }
            n = marks.size();
            avg = sum/n;


        System.out.println("Total count: "+marks.size());
        System.out.println("Highest Number: "+highest);
        System.out.println("Lowest Number: "+lowest);
        System.out.println("Average Number: "+avg);
}}

/*import java.util.*;*/
/*
public class QuizScoreStatistics {
    public static void main (String args[]) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int score = 0, hiScore = 0, loScore = 0, prevHiScore = 0, prevLoScore = 10, average = 0;
        final int QUIT = 99;
        Vector <Integer> scoreList = new Vector();

        System.out.println("Score input: Type 99 to quit.");

        do {
            System.out.print("Enter a score >> ");
            score = input.nextInt();


            if ((score >= 0 & score <= 10) | score == QUIT) {
                if (score != QUIT) {
                    scoreList.add(score);

                    if (score > prevHiScore) {
                        hiScore = score;
                    }

                        if (score < prevLoScore) {
                            loScore = score;
                        }
                    prevLoScore = score;
                    prevHiScore = score;


                } else {
                    System.out.print('\f');
                    System.out.println("Quitting...");
                    System.out.print('\f');
                }
            } else {
                System.out.println("Score must be between 10 and 0");
            }
        } while (score != QUIT);

        int sum = 0;
        double element = 0;

        for(int i=0; i<=scoreList.size()-1; i++) {
            element = scoreList.get(i);
            sum += scoreList.get(i);
        }

        //average=sum/scoreList.size();
        element = scoreList.size();
        Double avg = Double.valueOf(sum / element);

        System.out.println("Number of scores: " + scoreList.size());
        System.out.println("hi score: " + hiScore);
        System.out.println("lo score: " + loScore);
        System.out.println(" Average: " + avg);
    }
}
*/