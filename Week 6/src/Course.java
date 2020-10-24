public class Course {
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    public Course() {
        department="";
        courseNumber=0;
        credits=0;

    }
    public Course(String dept, int num, double creditValue) throws CourseException {
        boolean isBad = false;
        String message = "";
        department = dept;
        courseNumber=num;
        credits = creditValue;
        if (dept.length()!=DEPT_LENGTH){
            message += "The Course code number must be 3 numerals ";

        }
        if (num<LOW_NUM|| num> HIGH_NUM){
            message+="Course number should be between 100 and 499";

        }
        if (creditValue<LOW_CREDITS|| creditValue> HIGH_CREDITS){
            message+="Credit must be between 1 or 6";

        }
        if(!message.equals("")){
            throw(new CourseException(message+"\nDepartment: "+department+" Course number:"+ courseNumber+"Credits: "+credits));
        }

    }
    public String toString() {
        return "Department: "+department+" Course number:"+ courseNumber+"Credits: "+credits;
    }
}
