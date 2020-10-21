import java.util.Scanner;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        while (count < 2)
        {
            System.out.println("Please Enter a 10 digit number or type 999 to end.");
            String num = sc.next();
            StringBuilder number = new StringBuilder();
            number.append(num);
            if (number.length() == 10)
            {
                number.insert(0, "(");
                number.insert(4, ")");
                number.insert(5, " ");
                number.insert(9, "-");
                System.out.println(number);
            }
            else if (num.equals("999"))
            {
                count += 1;
                System.out.println("The End");
            }
            //if the input is bad
            else
                System.out.println("invalid input");

        }
        }

}
