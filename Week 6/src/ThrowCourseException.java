public class ThrowCourseException {
    public static void main(String[] args) {
        Course[] courses = new Course[8];
        String[] crsDepartments = {"COM", "GBA", "MGT", "ECO", "Accounting", "Computer", "Math", "English"};
        int[] crsNumbers = {100, 200, 300, 400, 500, 600, 700, 800};
        double[] crsCredits ={1.0, 2.0, 3.0, 4.0, 5.0, 60, 70, 80};
        int x;
        for(x = 0; x < courses.length; ++x)
            courses[x] = new Course();
        for(x = 0; x < courses.length; ++x)
        {
            try
            {
                courses[x] = new Course(crsDepartments[x], crsNumbers[x], crsCredits[x]);
            }
            catch(CourseException error)
            {
                System.out.println("Course " + x + "  Error: " + error.getMessage());
            }
        }
        System.out.println("\nCourse values");
        for(x = 0; x < courses.length; ++x)
            System.out.println(courses[x].toString());
    }
}
