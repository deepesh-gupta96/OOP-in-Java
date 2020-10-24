import java.util.*;
public class SqrtException {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        try {
            if (number < 0){
                throw (new ArithmeticException());
            }
            double result = Math.sqrt(number);
            System.out.println("Square root: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Can't take square root of negative number.");

        }
    }
}

