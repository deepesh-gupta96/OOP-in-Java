import java.util.*;
public class BadSubscriptCaught
{
    public static void main(String[] args)
    {
        String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
                "Fred", "Gina", "Henry"};
        Scanner keyboard = new Scanner(System.in);
        int number;

        try{
            System.out.println("Enter a number: ");
            number = keyboard.nextInt();
            System.out.println("The name is: "+names[number]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The integer you entered was out of range.");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Please enter a valid integer.");
            keyboard.nextLine();
        }


    }
}
