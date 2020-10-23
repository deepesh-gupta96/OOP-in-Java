import java.util.*;
class MorgansBonuses
{
    public static void main(String[] args)
    {
        double[][] bonuses = { {5.00,    9.00,  16.00,  22.00,  30.00},
                {10.00,  12.00,  18.00,  24.00,  36.00},
                {20.00,  25.00,  32.00,  42.00,  53.00},
                {32.00,  38.00,  45.00,  55.00,  68.00},
                {46.00,  54.00,  65.00,  77.00,  90.00},
                {60.00,  72.00,  84.00,  96.00, 120.00},
                {85.00, 100.00, 120.00, 140.00, 175.00} };
        Scanner sc = new Scanner(System.in);
        final int QUIT = 99;
        int weeks;
        int reviews;
        int x, y;

        System.out.print("Enter number of weeks worked or " + QUIT + " to quit: ");
        weeks = sc.nextInt();
        while(weeks != QUIT)
        {
            System.out.print("Enter number of positive reviews received: ");
            reviews = sc.nextInt();
            if(weeks >= bonuses.length)
                weeks = bonuses.length - 1;
            if(reviews >= bonuses[0].length)
                reviews = bonuses[0].length - 1;
            System.out.println("Bonus: " +bonuses[weeks][reviews]);
            System.out.print("Enter number of full weeks worked or " + QUIT + " to quit: ");
            weeks = sc.nextInt();
        }
    }
}