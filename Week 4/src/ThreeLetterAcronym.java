import static java.lang.Character.*;
import java.util.*;

public class ThreeLetterAcronym {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String word1;
        String word2;
        String word3;
        char[] tla = new char[3];
        String[] Sigma = new String[3];

        System.out.println("Please enter a three word title for the TLA: ");
        word = sc.nextLine();
        Sigma = word.split(" ");
        word1 = Sigma[0];
        word2 = Sigma[1];
        word3 = Sigma[2];
        tla[0] = word1.charAt(0);
        System.out.println(tla[0]);
        tla[1] = word2.charAt(0);
        System.out.println(tla[1]);
        tla[2] = word3.charAt(0);
        System.out.println(tla[2]);

        for(int x = 0; x < tla.length; ++x) {
            tla[x] = toUpperCase(tla[x]);
        }
        System.out.print("TLA for " + word + " is: "+tla[0]+tla[1]+tla[2]);

    }

}