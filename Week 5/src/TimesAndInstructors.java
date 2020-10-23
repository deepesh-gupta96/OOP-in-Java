import java.util.Scanner;

public class TimesAndInstructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        boolean found = false;
        String[][] course = {{"CIS101","Mon 9 am" ,"Farrell"},{"CIS210","Mon 11 am","Patel"},
                {"MKT100","Tues 8:30 am","Wong"},{"ACC150","Tues 6 pm","Deitrich"},{"CIS101","Fri 1 pm","Lennon"}};

        System.out.println("Enter course name: ");
        input = sc.nextLine();

        for (int x = 0; x<course.length;x++){
            if (input.equals(course[x][0])){
                System.out.println("Course: "+course[x][0]+" Time: "+course[x][1]+" Instructor: "+course[x][2]);
                found = true;
            }

        }
        if (!found)
            System.out.println("Invalid Entry: No Such course");
    }
}
