import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class StudentsStanding {
    public static void main(String[] args) {
        Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");
        Path probFile = Paths.get("/root/sandbox/StudentsAcademicProbation.txt");
        Scanner sc = new Scanner(System.in);

        String s = "";
        String delimiter = ",";
        String stringId;
        String firstName;
        String lastName;
        double gpa;
        final String QUIT = "ZZZ";
        final double CUTOFF = 2.0;
        try
        {
            OutputStream goodStream = new BufferedOutputStream(Files.newOutputStream(goodFile, CREATE));
            BufferedWriter goodWriter = new BufferedWriter(new OutputStreamWriter(goodStream));
            OutputStream probStream = new BufferedOutputStream(Files.newOutputStream(probFile, CREATE));
            BufferedWriter probWriter = new BufferedWriter(new OutputStreamWriter(probStream));
            System.out.print("Enter student ID: ");
            stringId = sc.nextLine();
            while(!stringId.equals(QUIT))
            {
                System.out.print("Enter FirstName: ");
                firstName = sc.nextLine();
                System.out.print("Enter LastName: ");
                lastName = sc.nextLine();
                System.out.print("Enter GPA: ");
                gpa = sc.nextDouble();
                sc.nextLine();
                s = stringId + delimiter + firstName + delimiter +
                        lastName + delimiter + gpa + System.getProperty("line.separator");
                if(gpa < CUTOFF)
                    probWriter.write(s, 0, s.length());
                else
                    goodWriter.write(s, 0, s.length());
                System.out.print("Enter next student ID  or " + QUIT + " to quit: ");
                stringId = sc.nextLine();
            }
            probWriter.close();
            goodWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}
