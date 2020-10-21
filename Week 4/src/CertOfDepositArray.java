import java.time.LocalDate;
import java.util.Scanner;

public class CertOfDepositArray {
    public static void main(String[] args) {
        CertOfDeposit[] certArray = new CertOfDeposit[5];
        Scanner scan = new Scanner(System.in);
        int  date, month, year;
        for(int i = 0;i < certArray.length;i++){
            certArray[i] = new CertOfDeposit();

            System.out.println("Please enter the certificate number:");
            String num = scan.nextLine();
            certArray[i].setCertNum(num);

            System.out.println("Now, please enter the last name:");
            String l_name = scan.nextLine();
            certArray[i].setLastName(l_name);

            System.out.println("Now, please enter the balance");
            double bal = scan.nextDouble();
            certArray[i].setBalance(bal);

            System.out.println("Enter the issue month: ");
            month = scan.nextInt();

            System.out.println("Enter the issue date: ");
            date = scan.nextInt();

            System.out.println("Enter the issue year: ");
            year = scan.nextInt();

            LocalDate issue_date = LocalDate.of(year,month,date);
            certArray[i].setIssueDate(issue_date);
            scan.nextLine();
        }
        displayData(certArray);
    }
    public static void displayData(CertOfDeposit[] displayArray){
        for(int i = 0;i < displayArray.length;++i){
            System.out.println("The certificate number is: #"+displayArray[i].getCertNum()+"\n"+
                    "The Last name registered with it is: "+displayArray[i].getLastName()+"\n"+
                    "The balance of it is: $"+displayArray[i].getBalance()+"\n"+
                    "The issue date was: "+displayArray[i].getIssueDate()+"\n"+
                    "And the maturity date is: "+displayArray[i].getMaturityDate());
        }
    }

}
