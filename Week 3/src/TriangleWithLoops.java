package com.company;

public class TriangleWithLoops {
    public static void main(String[] args) {
        int i, k =0, j;
        for(i = 1; i <= 7; ++i, k = 0) {
            for(j = 1; j <= 7 - i; ++j) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("T");
                ++k;
            }
            System.out.println();
        }
    }
}
