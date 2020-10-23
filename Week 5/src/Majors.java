import java.util.Scanner;
import java.util.ArrayList;
public class Majors {

    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};

    public static void main(String[] args) {
        Major subject;
        String[] divisions = {"Business Division","Science Division","Humanities Division"};
        Scanner sc = new Scanner(System.in);

        for(Major sub: Major.values())
            System.out.print(sub+" ");
        System.out.println("Enter Major: ");
        String s = sc.nextLine().toUpperCase();
        subject = Major.valueOf(s);
        switch (subject){
            case ACC:
            case CIS:
                System.out.println(divisions[0]);
                break;
            case ENG:
            case HIS:
                System.out.println(divisions[2]);
                break;
            case CHEM:
            case PHYS:
                System.out.println(divisions[1]);
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
