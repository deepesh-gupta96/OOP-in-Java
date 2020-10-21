import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number/word: ");
        original = sc.nextLine();
        original = original.toLowerCase();
        original = original.replaceAll("\\s", "");
        int length = original.length();
        for (int i = length-1; i>=0;i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)){
            System.out.println("You entered a palindrome");
        }
        else{
            System.out.println("You did not enter a palindrome.");
        }
    }
}
