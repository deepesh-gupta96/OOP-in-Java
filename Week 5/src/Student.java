import java.util.*;
public class Student extends Person
{
    private String major;
    private double gpa;
    Scanner sc = new Scanner(System.in);

    public Student() {
        super();
    }

    @Override
    public void setData() {
        super.setData();
        System.out.println("Please enter student's major");
        major = sc.nextLine();
        System.out.println("Please enter grade point average");
        gpa = sc.nextDouble();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Major: " + major + "  GPA: " + gpa);
    }
}
