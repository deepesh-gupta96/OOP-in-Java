import java.util.Scanner;

public class CountSpaces2 {
    static int i, count_space = 0, result;
    public static void main(String[] args) {
        String quote;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quote: ");
        quote = sc.nextLine();

        result = CountSpaces2.calculateSpaces(quote);

        System.out.println("The number of white space: "+result);
    }
    public static int calculateSpaces(String inString) {
        for(i=0,count_space=0;i<inString.length();i++)
        {
            char ch=inString.charAt(i);
            if(ch==' ')
                count_space++;
        }
        return count_space;
    }
}
