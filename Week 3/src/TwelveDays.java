import java.util.Scanner;
public class TwelveDays {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day: ");
        day = sc.nextInt();

        if (day == 1){
            System.out.println("On the " +day+"st day of Christmas");
            System.out.println("My true love gave to me");
        }
        else if (day == 2){
            System.out.println("On the " +day+"nd day of Christmas");
            System.out.println("My true love gave to me");
        }
        else if (day == 3){
            System.out.println("On the " +day+"rd day of Christmas");
            System.out.println("My true love gave to me");
        }
        else
        {
            System.out.println("On the " +day+"th day of Christmas");
            System.out.println("My true love gave to me");
        }


        //System.out.println("On the " +day+"th day of Christmas");
        //System.out.println("My true love gave to me");

        switch (day){
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves and");
            case 1:
                System.out.println("A partridge in a pear tree");
        }
    }
}
