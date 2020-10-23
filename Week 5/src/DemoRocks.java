import javax.swing.JOptionPane;
import java.util.Scanner;

public class DemoRocks {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IgneousRock igneousRock;
        MetamorphicRock metamorphicRock;
        SedimentaryRock sedimentaryRock;
        int sampleNumber1, sampleNumber2, sampleNumber3;
        int weight1, weight2, weight3;
        System.out.println("Please enter the sample number for the igneous rock");
        sampleNumber1= sc.nextInt();
        System.out.println("Please enter the weight for the igneous rock");
        weight1 = sc.nextInt();

        System.out.println("Please enter the sample number for the metamorphic rock");
        sampleNumber2 = sc.nextInt();
        System.out.println("Please enter the weight for the metamorphic rock");
        weight2 = sc.nextInt();
        System.out.println("Please enter the sample number for the sedimentary rock");
        sampleNumber3 = sc.nextInt();
        System.out.println("Please enter the weight for the sedimentary rock");
        weight3 = sc.nextInt();

        igneousRock = new IgneousRock(sampleNumber1, weight1);
        metamorphicRock = new MetamorphicRock(sampleNumber2, weight2);
        sedimentaryRock = new SedimentaryRock(sampleNumber3, weight3);
        displayAll(igneousRock, metamorphicRock, sedimentaryRock);
    }
    public static void displayAll(IgneousRock igneousRock,
                                  MetamorphicRock metamorphicRock,
                                  SedimentaryRock sedimentaryRock){
        System.out.println("The data for the igneous rock is: "
                +igneousRock.getSampleNumber()+" "
                +igneousRock.getWeight()+" "
                +igneousRock.getDescription()
                +"\n"
                +"The data for the metamorphic rock is: "
                +metamorphicRock.getSampleNumber()+" "
                +metamorphicRock.getWeight()+" "
                +metamorphicRock.getDescription()
                +"\n"
                +"The data for the sedimentary rock is: "
                +sedimentaryRock.getSampleNumber()+" "
                +sedimentaryRock.getWeight()+" "
                +sedimentaryRock.getDescription());
    }

}