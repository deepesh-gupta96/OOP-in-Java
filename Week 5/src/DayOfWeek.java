import java.util.Scanner;
public class DayOfWeek {
    enum Day {SUN, MON, TUE, WED, THU, FRI, SAT};

    public static void main(String[] args) {
        Day day_week;

        Scanner sc = new Scanner(System.in);
        for (Day n:Day.values())
            System.out.print(n+",");
        System.out.println();
        System.out.println("Enter Day: ");
        String d = sc.nextLine().toUpperCase();
        day_week = Day.valueOf(d);
        switch (day_week){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("9 - 9");
                break;
            case SAT:
                System.out.println("10 - 6");
                break;
            case SUN:
                System.out.println("11 - 5");
                break;
            default:
                System.out.println("Invallid");
        }
    }
}

