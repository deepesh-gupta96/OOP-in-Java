import java.util.*;
public class MeanMedian2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[20];
        int x = 0;
        int count = 0;
        int input;
        final int Quit = 9999;
        boolean exit = false;
        double mean;
        double median;
        int counter = num.length;
        double sum = 0;

        for (x = 0; x < num.length; ++x)
            num[x] = Quit;
        x = 0;
        System.out.println("Enter numbers or " + Quit + " to quit");
        while (x < num.length) {
            input = in.nextInt();
            if (input==Quit) {
                count = x;
                x = num.length;
                exit = true;
            } else {
                num[x] = input;
                ++x;
            }
        }
        if (!exit)
            count = num.length;
        String output = "Numbers: ";
        for (x = 0; x < count; ++x){
            output = output + "  " + num[x];
            sum = sum+num[x];
        }
        System.out.println(output);
        System.out.println("sum: " +sum);

        double total = sum;
        mean = sum/count;
        System.out.println("Mean: "+mean);

        Arrays.sort(num);

        if (count%2!=0){
            median = num[count/2];
            System.out.println("Median1: "+median);
        }
        else{
            int median1 = num[((count) / 2)];
            System.out.println("Me1: "+median1);
            int median2 = num[((count -1) / 2)];
            System.out.println("Me2: "+median2);
            median = (median1+median2) / 2.0;
            System.out.println("Median2: "+median);
        }
    }
}
