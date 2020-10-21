/*public class TaxReturn{
    private String ssn;
    private String last;
    private String first;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private double income;
    private char status;
    private double tax;
    private double taxAmt;
    private final double LOWINCOME = 20000;
    private final double HIGHINCOME = 50000;
    private final double SINGLELOW = 0.15;
    private final double SINGLEMED = 0.22;
    private final double SINGLEHIGH = 0.30;
    private final double MARRIEDLOW = 0.14;
    private final double MARRIEDMED = 0.20;
    private final double MARRIEDHIGH = 0.28;

    public TaxReturn(String socSec, String lastName, String firstName, String add, String cty, String st,
                     String zip, double inc, char stat){

        this.ssn=socSec;
        this.last =lastName;
        this.first =firstName;
        this.address =add;
        this.city= cty;
        this.zipCode=zip;
        this.income =inc;
        this.status =stat;
        this.state = st;

        if(income>50000){
            if(st.equalsIgnoreCase("M"))
                tax =.28;
            else if(st.equalsIgnoreCase("S"))
                tax =.30;
        }
        else if(income>20000){
            if(st.equalsIgnoreCase("M"))
                tax =.20;
            else if(st.equalsIgnoreCase("S"))
                tax =.22;
        }
        else if(income>0){
            if(st.equalsIgnoreCase("M"))
                tax =.14;
            else if(st.equalsIgnoreCase("S"))
                tax =.15;
        }

        taxAmt=(double)income* tax;
    }

    public void display() {
        System.out.println("Taxpayer ssn: " + ssn + " " + first + " " + last + "\n" +
                address + "\n" + city + ", " + state + " " + zipCode +
                "\n Marital status: " + status + "\n" +
                "Income: $" + income + "  Tax: $" + tax);
    }
    }*/

/*import java.util.*;
public class TaxReturn {
    private String ssn;
    private String last;
    private String first;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private double income;
    private char status;
    private double tax;
    private final double LOWINCOME = 20000;
    private final double HIGHINCOME = 50000;
    private final double SINGLELOW = 0.15;
    private final double SINGLEMED = 0.22;
    private final double SINGLEHIGH = 0.30;
    private final double MARRIEDLOW = 0.14;
    private final double MARRIEDMED = 0.20;
    private final double MARRIEDHIGH = 0.28;

    public TaxReturn(String socSec, String lastName,
                     String firstName, String add, String cty, String st,
                     String zip, double inc, char stat) {
        // Write your code here
    }
    public void display() {
        System.out.println("Taxpayer ssn: " + ssn + " " + first + " " + last + "\n" +
                           address + "\n" + city + ", " + state + " " + zipCode +
                           "\n Marital status: " + status + "\n" +
                           "Income: $" + income + "  Tax: $" + tax);
    }
}*/

public class TaxReturn {
    String SSN;
    String lastName;
    String firstName;
    String streetAddress;
    String city;
    String state;
    String zipCode;
    double annualIncome;
    char maritalStatus;
    double taxLiability;
    double tax_amount;

    public TaxReturn(String SSN, String lastName, String firstName, String streetAddress,
                     String city, String state, String zipCode, double annualIncome, char maritalStatus) {
        this.SSN = SSN;
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = Character.toUpperCase(maritalStatus);

        if(annualIncome > 0 && annualIncome < 20_000) {
            if(this.maritalStatus == 'S')
                this.taxLiability = annualIncome*0.15;
            else if(this.maritalStatus == 'M')
                this.taxLiability = annualIncome*0.14;
            else
                this.taxLiability = 0;
        }
        else if(annualIncome > 20_001 && annualIncome < 50_000) {
            if(this.maritalStatus == 'S')
                this.taxLiability = annualIncome*0.22;
            else if(this.maritalStatus == 'M')
                this.taxLiability = annualIncome*0.20;
            else
                this.taxLiability = 0;
        }
        else if(annualIncome > 50_001) {
            if (this.maritalStatus == 'S')
                this.taxLiability = annualIncome * 0.30;
            else if (this.maritalStatus == 'M')
                this.taxLiability = annualIncome * 0.28;
            else
                this.taxLiability = 0;
        }
        //TaxReturn tax = tax.displayTaxReturnData();

    }

    public void displayTaxReturnData() {
        System.out.println("\nSocial Security Number: " + SSN +"\nName: " + lastName + ", " + firstName +
                "\nStreet Address: " + streetAddress +
                ", " + city + " - " + state + ", " + zipCode +
                "\nAnnual Income: " + annualIncome +
                "\nMarital Status: " + maritalStatus +
                "\nTax Liability: " + taxLiability);
    }
}
/*
public class TaxReturn {
    private final String socialSecurityNumber;
    private String lastName;
    private final String firstName;
    private String streetAddress;
    private String city;
    private String state;
    private final int zipCode;
    private final int annualIncome;
    private final String maritalStatus;
    private double taxLiability;

    public TaxReturn(String socialSecurityNumber, String lastName, String firstName, String streetAddress, String city, String state, int zipCode, int annualIncome, String maritalStatus) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = maritalStatus.toUpperCase();
        this.setTaxLiability();
    }

    public TaxReturn(String socialSecurityNumber, String firstName, int zipCode, int annualIncome, String maritalStatus) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = maritalStatus.toUpperCase();
        this.setTaxLiability();
    }

    private void setTaxLiability() {
        if(annualIncome >= 0 && annualIncome <= 20000){
            switch(maritalStatus){
                case "MARRIED":
                    this.taxLiability = annualIncome * 0.14;
                    break;
                case "SINGLE":
                    this.taxLiability = annualIncome *  0.15;
                    break;
            }
        }else if(annualIncome > 20000 && annualIncome <= 50000){
            switch(maritalStatus){
                case "MARRIED":
                    this.taxLiability = annualIncome *  0.20;
                    break;
                case "SINGLE":
                    this.taxLiability = annualIncome *  0.22;
                    break;
            }
        }else{
            switch(maritalStatus){
                case "MARRIED":
                    this.taxLiability = annualIncome *  0.28;
                    break;
                case "SINGLE":
                    this.taxLiability = annualIncome *  0.30;
                    break;
            }

        }
    }

    public void displayData(){
        System.out.println("Dear "+firstName+", your tax return data is:"+"\n"+
                "Annual income of: "+annualIncome+"\n"+
                "And tax liability of: "+taxLiability);
    }
}

*/