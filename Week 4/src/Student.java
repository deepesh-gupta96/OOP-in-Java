public class Student {
    private int stuID;
    public final int NUM_OF_COURSES = 5;
    public CollegeCourse[] courses = new CollegeCourse[NUM_OF_COURSES];

    public int getID() {
        return stuID;
    }

    public void setID(int idNum) {
        stuID = idNum;
    }

    public CollegeCourse getCourse(int x) {
        return (x >= 0 && x < NUM_OF_COURSES) ? courses[x] : null;
    }

    public void setCourse(CollegeCourse c, int x) {
        if(x >= 0 && x < NUM_OF_COURSES)
            this.courses[x] = c;
    }

    public void display() {
        System.out.println("Student ID:# " + getID());
    }
}


/*public class Student {
    private int stuID;
    private CollegeCourse[] course = new CollegeCourse[5];

    public int getID() {
        return stuID;
    }
    public CollegeCourse getCourse(int x) {
        return course[x];
    }

    public void setID(int idNum) {
        stuID = idNum;
    }
    public void setCourse(CollegeCourse c, int x) {
        course[x] = c;
    }
}
*/
