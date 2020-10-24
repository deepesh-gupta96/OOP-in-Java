import java.util.*;
public class TestScore {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] ids = {1234, 2345, 3456, 4567, 5678};
        int[] scores = {0, 0, 0, 0, 0};
        String scoreString = new String();
        final int HIGHLIMIT = 100;
        String inString, outString = "";
        for (int x = 0; x < ids.length; ++x) {
            System.out.println("Enter score for student id number: " + ids[x]);
            inString = input.next();
            scores[x] = Integer.parseInt(inString);
            try{
                if (scores[x]>HIGHLIMIT){

                    throw (new ScoreException(scoreString));
                }
            }
            catch (ScoreException e){
                System.out.println("Score over 100");
                scores[x] = 0;
            }
        }
        for (int x = 0; x < ids.length; ++x)
            outString = outString + "ID #" + ids[x] + "  Score " +
                    scores[x] + "\n";
        System.out.println(outString);
    }
}
