import java.util.*;
public class TryToParseDouble {
    public static void main(String[] args) {
        String input;
        double conversion;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter a floating number: ");
            input = sc.nextLine();
            conversion = Double.parseDouble(input);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Value entered cannot be converted to a floating-point number.");
            conversion = 0;
        }
        System.out.println("Your floating point number: " + conversion);
    }
}

