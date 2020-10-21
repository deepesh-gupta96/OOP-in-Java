public class CollegeCourse {
    private String courseID;
    private int credits;
    private char grade;

    public String getID() {
        return courseID;
    }

    public void setID(String idNum) {
        this.courseID = idNum;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int cr) {
        this.credits = cr;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char gr) {
        this.grade = gr;
    }

    public void display() {
        System.out.println("Course ID: " + getID());
        System.out.println("Credit Hours: " + getCredits());
        System.out.println("Letter Grade: " + getGrade());
    }
}

/*public class CollegeCourse {
    private String courseID;
    private int credits;
    private char grade;
    public String getID() {
        return courseID;
    }
    public int getCredits() {
        return credits;
    }
    public char getGrade() {
        return grade;
    }
    public void setID(String idNum) {
        courseID = idNum;
    }
    public void setCredits(int cr) {
        credits = cr;
    }
    public void setGrade(char gr) {
        grade = gr;
    }
}*/