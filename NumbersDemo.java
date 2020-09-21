/**Create an application named NumbersDemo whose main() method holds two integer variables. Assign values to the variables.
 In turn, pass each value to methods named displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared().
 Create each method to perform the task its name implies.*/

package com.company;

public class NumbersDemo {
    public static void main(String[] args) {
        int var1 = 24;
        int var2 = 25;
        displayTwiceTheNumber(var1);
        displayNumberPlusFive(var1);
        displayNumberSquared    (var1);
        displayTwiceTheNumber(var2);
        displayNumberPlusFive(var2);
        displayNumberSquared(var2);

    }

    public static void displayTwiceTheNumber(int var1) {

        int result1 = var1 + var1;
        System.out.println("Twice the Number "+var1+" = "+result1);
    }

    public static void displayNumberPlusFive(int var1){

        int result1 = var1 + 5;
        System.out.println("Adding five to "+var1+" = "+result1);

    }

    public static void displayNumberSquared(int var1) {
        int result1 = var1 * var1;
        System.out.println("Square of "+var1+" = "+result1);
    }

}
