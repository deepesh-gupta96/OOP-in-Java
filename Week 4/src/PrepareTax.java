/*import java.util.Scanner;

public class PrepareTax{
    public static void main(String[]args){
        TaxReturn taxInfo;

        Scanner sc =new Scanner(System.in);

        String ssn="";
        String lastName;
        String firstName;
        String streetAddress;
        String city;
        String state;
        String zipCode="0";
        double annualIncome;
        char maritalStatus;

        boolean valid=true;
        int i;
        char c;
        int count=0;
        char status;
        String nameInput;
        String a = "10000", b = "99999";

        while(count!=11){
            count=0;

            System.out.print("Please enter your social security number in "+ "standard XXX-XX-XXXX format: ");
            ssn=sc.nextLine();

            if(ssn.length()!=11)
                System.out.println("Invalid SSN.");
            for(i=0; i<ssn.length(); i++){
                c=ssn.charAt(i);
                if(((i>=0 && i<=2) || i==4 || i==5 || i>=7) &&
                        (Character.isDigit(c)))

                    count++;
                else{
                    status=' ';
                    //if(status.equals("-"))
                        count++;
                }
            }

            if(count<11)
                System.out.println("Invalid SSN");
        }//Social security number input
        count=0;

        System.out.print("Enter your first and last name: ");
        nameInput=sc.nextLine();

        for(i=0; i<nameInput.length(); i++){
            c=nameInput.charAt(i);
            if(i==0)
                c=Character.toUpperCase(c);
            if(c==' ' && valid)
                valid=false;
            if(valid)
                firstName.append(c);
            else if(Character.isLetter(c))
                lastName.append(c);
        }//builds first and last names

        System.out.print("Please enter your address: ");
        streetAddress=sc.nextLine();//address

        System.out.print("Enter your city: ");
        city=sc.nextLine();//city

        System.out.println("Enter your state: ");
        state = sc.nextLine();

        while(zipCode.equals(a) || zipCode.equals(b)){
            System.out.print("Enter your five-digit ZIP code: ");
            zipCode= String.valueOf(sc.nextInt());
        }//ZIP code

        do{
            System.out.print("What is your annual income? ");
            annualIncome=(int)(Math.floor(sc.nextDouble()));
        }while(annualIncome<0);//Income

        sc.nextLine();

        do{
            System.out.print("Finally, your marital status... ");
            status=sc.nextLine();

            c=status.charAt(0);
            status=""+c;
            if(status.equalsIgnoreCase("M")){
                status=status;
                valid=true;
            }
            else if(status.equalsIgnoreCase("S")){
                status=status;
                valid=true;
            }
            else
                System.out.println("The options are single or married.");
        }while(!valid);//Marital status

        taxInfo=new TaxReturn(ssn,lastName,firstName,streetAddress,city,state,zipCode,annualIncome,status);

        taxInfo.display();
    }
}*/

/*import java.util.*;
public class PrepareTax {
    public static void main(String[] args) {
        // Write your code here
    }
}*/

import java.util.Scanner;

public class PrepareTax {
    public static void main(String[] args) {
        getTaxInfo();
    }

    public static void getTaxInfo() {
        String SSN;
        String lastName;
        String firstName;
        String streetAddress;
        String city;
        String state;
        String zipCode;
        double annualIncome;
        char maritalStatus;
        TaxReturn taxReturn = null;
        Scanner input = new Scanner(System.in);

        //Validate SSN 999-99-9999
        System.out.print("Enter Social Security Number >>>> ");
        SSN = new String(input.nextLine());
        while(SSN.length() != 11 || SSN.charAt(3) != '-' || SSN.charAt(6) != '-') {
            System.out.print("Social Security Number contains 9 digits and dashes. Try again >>>> ");
            SSN = new String(input.nextLine());
        }

        System.out.print("Enter last name >>>> ");
        lastName = input.nextLine();

        System.out.print("Enter first name >>>> ");
        firstName = input.nextLine();

        System.out.print("Enter street address >>>> ");
        streetAddress = input.nextLine();

        System.out.print("Enter city >>>> ");
        city = input.nextLine();

        System.out.print("Enter state >>>> ");
        state = input.nextLine().toUpperCase();

        System.out.print("Enter zip code >>>> ");
        zipCode = new String(input.nextLine());
        while(zipCode.length() != 5) {
            System.out.print("Zip Code must contain 5 digits. Try again >>>> ");
            zipCode = new String(input.nextLine());
        }

        System.out.print("Enter marital status >>>> ");
        maritalStatus = input.next().toUpperCase().charAt(0);
        while (maritalStatus!='M' && maritalStatus != 'S' && maritalStatus !='m' && maritalStatus !='s'){
            System.out.print("Enter marital status >>>> ");
            maritalStatus = input.next().toUpperCase().charAt(0);
        }


        System.out.print("Enter annual income >>>> ");
        annualIncome = input.nextDouble();
        while (annualIncome<0){
            System.out.println("Please enter above 0: ");
            annualIncome = input.nextDouble();
        }

        //input.close();

        TaxReturn tax = new TaxReturn(SSN, lastName, firstName, streetAddress, city, state, zipCode, annualIncome, maritalStatus);
        tax.displayTaxReturnData();
    }
}
/*
import java.util.*;
public class PrepareTax {
    public static void main(String[] args) {
        // TODO code application logic here
        TaxReturn tax;
        Scanner scan = new Scanner(System.in);
        int correct1 = 0, correct2 = 0, correct3 = 0, correct4 = 0;
        char c;
        String maritalStatus = "", socialSecurity = "", zipCode = "", name;
        int annualIncome = 0, i;
        System.out.println("Please input your name:");
        name = scan.nextLine();
        while(correct1 != 1 || correct2 != 5 || correct3 != 1 || correct4 != 1){
            correct1 = 0;
            correct2 = 0;
            correct3 = 0;
            correct4 = 0;
            System.out.println("Please input the social security number (for example: 999-99-9999):");
            socialSecurity = scan.nextLine();
            if(socialSecurity.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]")){
                correct1 = 1;
            }
            System.out.println("Please input the zip code (five digits):");
            zipCode = scan.nextLine();
            if(zipCode.length() == 5){
                for(i = 0;i < 5;++i){
                    c = zipCode.charAt(i);
                    if(Character.isDigit(c))
                        correct2 += 1;
                }
            }
            System.out.println("Please input your marital status Now (Married or Single):");
            maritalStatus = scan.nextLine();
            c = Character.toUpperCase(maritalStatus.charAt(0));
            if(c == 'M' || c == 'S')
                correct3 += 1;
            System.out.println("Now, please input your annual income:");
            annualIncome = scan.nextInt();
            if(annualIncome >= 0)
                correct4 += 1;
            scan.nextLine();
        }
        tax = new TaxReturn(socialSecurity, name, Integer.parseInt(zipCode), annualIncome, maritalStatus);
        tax.displayData();
    }

}*/
