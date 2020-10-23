import java.util.*;
public class CollegeEmployee extends Person {
    protected String ssn;
    protected double annualSalary;
    protected String dept;
    Scanner sc = new Scanner(System.in);

    public CollegeEmployee() {
        super();
    }

    public void setData() {
        super.setData();

        System.out.println("Enter ssn: ");
        ssn = sc.nextLine();

        System.out.println("Enter annual Salary: ");
        annualSalary = sc.nextDouble();

        System.out.println("Enter dept: ");
        dept = sc.nextLine();

    }

    public void display() {
        super.display();
        System.out.println("SSN: " + ssn + " Salary $" +
                annualSalary + " Department: " + dept);
    }
}
