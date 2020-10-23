public class LabCourse extends CollegeCourse {

    public LabCourse(String dept, int id, double credits) {
        super(dept, id, credits);
        price+= 50;
    }

    public void display() {
        System.out.println(dept+ id+ "\n"+ "Lab course\n"+ credits+" credits\nLab fee is $50\nTotal fee is $"+ price);
    }
}
