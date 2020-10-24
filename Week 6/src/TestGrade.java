import java.util.*;
public class TestGrade {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] ids = {1234, 1245, 1267, 1278, 2345,
                1256, 3456, 3478, 4567, 5678
        };
        char[] grades = new char[10];
        String gradeString = new String();
        final int HIGHLIMIT = 100;
        String inString, outString = "";
        int flag = 0;
        for (int x = 0; x < ids.length; ++x) {
            System.out.println("Enter letter grade for student id number: " + ids[x]);
            inString = input.next();
            grades[x] = inString.charAt(0);
            try
            {
                flag = 0;
                for(int y = 0; y < GradeException.VALID_GRADES.length; ++y)
                {
                    if(grades[x] == GradeException.VALID_GRADES[y])
                        flag = 1;
                }
                if(flag == 0)
                {
                    gradeString = "Invalid grade";
                    throw(new GradeException(gradeString));
                }
            }
            catch(GradeException e)
            {
                System.out.println(e.getMessage());
                grades[x] = 'I';
            }
        }

        for (int x = 0; x < ids.length; ++x)
            outString = outString + "ID #" + ids[x] + "  Grade " +
                    grades[x] + "\n";
        System.out.println(outString);
    }
}
