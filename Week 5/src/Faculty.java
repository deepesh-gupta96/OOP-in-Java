import java.util.*;
public class Faculty extends CollegeEmployee
{
    private boolean isTenured = false;
    Scanner sc = new Scanner(System.in);

    public Faculty() {
        super();
    }

    @Override
    public void setData() {
        String temp;
        super.setData();
        System.out.println("Is this faculty member tenured - Y or N?");
        temp = sc.nextLine();
        if(temp.charAt(0) == 'Y' || temp.charAt(0) == 'y')
            isTenured = true;

    }
    @Override
    public void display() {
        super.display();
        if(isTenured)
            System.out.println("Faculty member is tenured");
        else
            System.out.println("Faculty member is not tenured");// write your code here
    }
}
