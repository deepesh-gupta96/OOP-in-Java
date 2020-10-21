import java.util.Arrays;

public class ArrayMethodDemo {
    public static void main (String args[]) {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) {
        System.out.println("Display Numbers");

        for (int element: numbers)
            System.out.print(element+ " ");

    }
    public static void displayReverse(int[] numbers) {
        System.out.println();
        System.out.println("Reverse:");
        for (int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void displaySum(int[] numbers) {
        int sum = 0;
        System.out.println();
        for (int i = 0; i< numbers.length; i++){
            sum = sum+numbers[i];
        }
        System.out.println("Sum of Number: "+sum);

    }
    public static void displayLessThan(int[] numbers, int limit) {
        System.out.println("Less Than: ");
        for (int x = 0; x<numbers.length; x++){
            if (numbers[x]<limit){
                System.out.print(numbers[x]+" ");
            }
        }


    }
    public static void displayHigherThanAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i< numbers.length; i++){
            sum = sum+numbers[i];
        }
        int avg = sum/ numbers.length;
        System.out.println("Higher than Average: ");

        for (int x = 0; x<numbers.length; x++){
            if (numbers[x]>avg){
                System.out.print(numbers[x]+" ");
            }
        }

    }
}
