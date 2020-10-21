import java.util.Scanner;

public class InputCharacterInfo {
    public static void main(String[] args) {
        char name;
        String a = "abc";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        name = sc.nextLine().charAt(0);

        System.out.println("The character is " +name);

        if (Character.isUpperCase(name))
            System.out.println(name+ " is uppercase");
        else
            System.out.println(name + " is not uppercase");
        if (Character.isLowerCase(name))
            System.out.println(name + " is lowercase");
        else
            System.out.println(name + " is not lowercase");
        name = Character.toLowerCase(name);
        System.out.println("After tolowerCase(), name is " + name);
        name = Character.toUpperCase(name);
        System.out.println("After toUpperCase(), name is " + name);

        if(Character.isLetterOrDigit(name))
            System.out.println(name + " is a letter or digit");
        else
            System.out.println(name + " is neither a letter nor a digit");
        if(Character.isWhitespace(name))
            System.out.println(name + " is whitespace");
        else
            System.out.println(name + " is not whitespace");

    }
}
