import java.util.*;

public class DistanceFromAverage {
    public static void main(String[] args) {

        double[] number = new double[15];
        double num;
        int MAX = 15;
        final int QUIT = 99999;
        int count = 0;
        double total = 0;

        Scanner sc =  new Scanner(System.in);

        System.out.println(" Enter number or 99999: ");
        num = sc.nextDouble();

        if (num == QUIT){
            System.out.println("Didnt input anything ");
        }
        else

        while(num !=QUIT)
        {
            number[count] = num;
            total += number[count];
            ++count;
            if(count == MAX)
                num = QUIT;
            else
            {
                System.out.println("Enter next number or " +QUIT + " to quit >> ");
                num = sc.nextDouble();
            }
        }

        for(int x = 0; x < count; ++x)
            System.out.print(number[x] + " ");
        double sub_total = total / count;
        if(count != 0)
            System.out.println("The average is " + sub_total);
        else
            System.out.println("No scores were entered.");

        for (int i = 0; i<count;i++){
            number[i] = (number[i]-sub_total);
            System.out.println("DistanceFromAverage: "+number[i]);
        }

    }
}
