public class CollegeCourse {
    String dept;
    int id;
    double credits;
    double price;

   public CollegeCourse(String depart, int id, double cred) {
        this.dept = depart;
        this.id = id;
        this.credits = cred;
        price = credits * 120;
    }

    public void display(){
        System.out.println(dept+id+"\nNon-lab course\n"+credits +" credits\nTotal fee is $"+price);
    }
}
