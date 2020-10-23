import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        String dept;
        int id;
        double credits;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the three letter department code: ");
        dept = sc.nextLine().toUpperCase();
        System.out.print("Enter the course number: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the amount of credit hours: ");
        credits = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        switch(dept) {
            case "BIO":
            case "CHM":
            case "CIS":
            case "PHY": LabCourse labCourse = new LabCourse(dept, id, credits);
                labCourse.display();
                break;
            default: CollegeCourse colCourse = new CollegeCourse(dept, id, credits);
                colCourse.display();
                break;
        }
    }
}
