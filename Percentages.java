/**Create an application named Percentages whose main() method holds two double variables.
 * Assign values to the variables.
 * Pass both variables to a method named computePercent() that displays
 * the two values and the value of the first number as a percentage of the second one.
 * For example, if the numbers are 2.0 and 5.0, the method should display a statement similar to “2.0 is 40 percent of 5.0.”
 * Then call the method a second time, passing the values in reverse order.*/

package com.company;

public class Percentages {
    public static void main(String[] args) {

        double num1 = 2.0;
        double num2 = 5.0;
        computePercent(num1,num2);

    }

    public static void computePercent(double num1, double num2) {

        double result1 = (num1/num2)*100;
        double result2 = (num2/num1)*100;
        System.out.println(num1+" is "+result1+ " percent of "+num2);
        System.out.println(num2+" is "+result2+ " percent of "+num1);

    }
}
