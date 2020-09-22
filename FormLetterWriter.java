/**
 * Create a class named FormLetterWriter that includes two overloaded methods named displaySalutation().
 * The first method takes one String parameter that represents a customer’s last name, and it displays the salutation
 * Dear Mr. or Ms. followed by the last name. The second method accepts two String parameters that represent a first and last name,
 * and it displays the greeting Dear followed by the first name, a space, and the last name.
 * After each salutation, display the rest of a short business letter: Thank you for your recent order.*/

package com.company;

public class FormLetterWriter {
    public static void main(String[] args) {

        FormLetterWriter player = new FormLetterWriter();

        displaySalutation("Kelly");
        displayLetter();
        displaySalutation("Christy", "Johnson");
        displayLetter();
    }

    public static void displaySalutation(String lastName) {

        System.out.println("Dear Mr. or Ms. "+lastName);
    }

    public static void displaySalutation(String firstName, String lastName) {

        System.out.println("Dear "+firstName+" " +lastName);
    }
    public static void displayLetter() {

        System.out.println("Thank you for your recent order");
    }
}
