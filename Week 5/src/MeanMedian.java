    import java.util.Arrays;
    import java.util.Scanner;

    public class MeanMedian {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] num = new int[9];
            double mean;
            double median;
            int count = num.length;

            System.out.println("Enter numbers: ");

            for (int i = 0; i<num.length;i++){
                num[i] = sc.nextInt();
            }


            System.out.println("Values: "+ Arrays.toString(num));
            double total = Arrays.stream(num).sum();
            mean = total/count;
            System.out.println("Mean: "+mean);
            Arrays.sort(num);

            if (count%2!=0){
                median = num[count/2];
                System.out.println("Median: "+median);
            }
            else{
                median = num[(count - 1) / 2] + num[count / 2] / 2.0;
                System.out.println("Median: "+median);
            }

        }
    }
