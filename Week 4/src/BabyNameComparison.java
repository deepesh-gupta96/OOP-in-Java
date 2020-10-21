import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String name1, name2, name3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name 1: ");
        name1 = sc.next();

        System.out.println("Enter name 2: ");
        name2 = sc.next();

        System.out.println("Enter name 3: ");
        name3 = sc.next();

        System.out.println("First combo: "+name1+" "+name2);
        System.out.println("Second combo: "+name2+" "+name3);
        System.out.println("Third combo: "+name1+" "+name3);

        System.out.println("First combo: "+name2+" "+name1);
        System.out.println("Second combo: "+name3+" "+name2);
        System.out.println("Third combo: "+name3+" "+name1);
    }
}
