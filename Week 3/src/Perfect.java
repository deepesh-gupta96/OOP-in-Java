public class Perfect {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i+" is a perfect number");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum=0;
        for(int i=1; i<=number/2; i++) {
            if(number%i == 0) {
                sum += i;
            }
        }

        if(sum==number) {
            return true;
        }else {
            return false;
        }
    }
}

