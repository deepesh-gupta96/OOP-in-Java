import java.util.Scanner;
class QuartsToGallonsWithExceptionHandling
{
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 0;
        int gallonsNeeded;
        int extraQuartsNeeded;
        boolean errorCode = false;
        Scanner input = new Scanner(System.in);
        while(!errorCode) {
            System.out.print("Enter quarts needed >> ");
            try {
                quartsNeeded = input.nextInt();
                errorCode = true;

            }
            catch(Exception ex) {
                input.next();
                System.out.println("Invalid entry - Enter numeric data");
            }
        }
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded +
                " quarts requires " + gallonsNeeded + " gallons plus " +
                extraQuartsNeeded + " quarts.");


    }
}