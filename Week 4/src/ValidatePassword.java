import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    do {
        System.out.print("\nEnter Password:");
        String password = "";
        password = sc.nextLine();
        int upper = 0, lower = 0, digit = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;

            } else if (Character.isDigit(c)) {
                digit++;
            }
        }

        String errorMessage = "";
        if (upper < 2) {
            errorMessage += "\n uppercase letters";
        }

        if (lower < 2) {
            errorMessage += "\n lowercase letters";
        }

        if (digit < 2) {
            errorMessage += "\n digits";
        }

        if (errorMessage.length() > 1) {
            System.out.println("The password did not have enough of the following: "+ errorMessage);
        } else {
            System.out.println("Valid password");
            break;
        }
    } while (true);
    }
}