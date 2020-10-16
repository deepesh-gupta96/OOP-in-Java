import java.util.Scanner;
public class BarChart {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;
        System.out.print("Enter points earned by Art >> ");
        artPoints = input.nextInt();
        System.out.print("Enter points earned by Bob >> ");
        bobPoints = input.nextInt();
        System.out.print("Enter points earned by Cal >> ");
        calPoints = input.nextInt();
        System.out.print("Enter points earned by Dan >> ");
        danPoints = input.nextInt();
        System.out.print("Enter points earned by Eli >> ");
        eliPoints = input.nextInt();
        System.out.println("\nPoints for Game\n");

        if (artPoints>=0) {
            System.out.print("Art ");
            for (int i = 1; i <= artPoints/10; i++) {
                System.out.print("*");
            }
        }

        if (bobPoints>=0) {
            System.out.println();
            System.out.print("Bob ");
            for (int i = 1; i <= bobPoints/10; i++) {

                System.out.print("*");
            }
        }

        if (calPoints>=0) {
            System.out.println();
            System.out.print("Cal ");
            for (int i = 1; i <= calPoints/10; i++) {
                System.out.print("*");
            }
        }
        if (danPoints>=0) {
            System.out.println();
            System.out.print("Dan ");
            for (int i = 1; i <= danPoints/10; i++) {
                System.out.print("*");
            }
        }
        if (eliPoints>=0) {
            System.out.println();
            System.out.print("Eli ");
            for (int i = 1; i <= eliPoints/10; i++) {
                System.out.print("*");
            }
        }
    }
}

