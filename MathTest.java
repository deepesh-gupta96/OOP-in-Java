package com.company;
import java.util.Random;
public class MathTest {
    public static void main(String[] args) {
        double sq = Math.sqrt(37);
        System.out.println("The square root of 37: "+sq);

        double sine = Math.sin(300);
        double cosine = Math.cos(300);
        System.out.println("The sine of 300: "+sine+" and cosine of 300: "+cosine);
        System.out.println("Floor value of 22.8: "+Math.floor(22.8));

        System.out.println("Celing value of 22.8: "+Math.ceil(22.8));
        System.out.println("Round value of 22.8: "+Math.round(22.8));

        System.out.println("The larger of D and 71 is " + Math.max('D', 71));
        System.out.println("The smaller of D and 71 is " + Math.min('D', 71));
        System.out.println("A random number between 0 and 20 is " + Math.random() * 20 + 1);
    }
}
