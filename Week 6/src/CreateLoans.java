import java.util.*;
public class CreateLoans implements LoanConstants
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int MAX = 5;
        Loan[] loan = new Loan[MAX];
        int x;
        int num;
        String name;
        double amt, rate;
        int loanType;
        int term;
        String inStr,  outString = COMPANY;
        System.out.println("Welcome to "+COMPANY +"\nEnter the current prime interest rate as a decimal number, for example, .05");
        inStr = sc.nextLine();
        rate = Double.parseDouble(inStr);
        for(x = 0; x < MAX; ++x)
        {
            System.out.println("Is this a (1) Business loan or (2) Personal loan");
            inStr = sc.nextLine();
            loanType = Integer.parseInt(inStr);
            System.out.println( "Enter account number");
            inStr = sc.nextLine();
            num = Integer.parseInt(inStr);
            System.out.println("Enter Name: ");
            name = sc.nextLine();
            System.out.println("Enter Loan Amount: ");
            inStr = sc.nextLine();
            amt = Double.parseDouble(inStr);
            System.out.println("Enter term: ");
            inStr = sc.nextLine();
            term = Integer.parseInt(inStr);
            if(loanType == 1)
            {
                BusinessLoan temp = new
                        BusinessLoan(num, name, amt, term, rate);
                loan[x] = temp;
            }
            else
            {
                PersonalLoan temp = new PersonalLoan(num, name, amt, term, rate);
                loan[x] = temp;
            }
        }
        for(x = 0; x < MAX; ++x)
            outString += loan[x].toString() + "\n";
        System.out.println(outString);
    }
}
