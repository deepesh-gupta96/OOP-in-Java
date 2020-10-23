import java.util.*;
public class DemoHSBaseballGame
{
    public static void main(String[] args)
    {
        HighSchoolBaseballGame H_game = new HighSchoolBaseballGame();
        H_game.setNames("WSU", "Trine");
        display(H_game);
        H_game.setScore(0, 0, 2);
        H_game.setScore(1, 0, 0);
        System.out.println("After setting first inning");
        display(H_game);
        System.out.println("Trying to set fifth inning (inning 4) too soon");
        H_game.setScore(0, 4, 1);
        System.out.println("After setting second inning scores");
        H_game.setScore(0, 1, 1);
        H_game.setScore(1, 1, 4);
        display(H_game);
        System.out.println("Trying to use an invalid inning");
        H_game.setScore(0, 7, 2);
        System.out.println("\nTrying to use an invalid team");
        H_game.setScore(2, 2, 2);
        System.out.println("After setting the rest of the innings");
        for(int t = 0; t < 2; ++t)
            for(int i = 2; i < H_game.getInnings(); ++i)
                H_game.setScore(t, i, 2);
        display(H_game);

    }
    public static void display(HighSchoolBaseballGame b)
    {
        int[] total = {0, 0};
        boolean areInningsLeft = false;
        int score;
        System.out.println("Game between " + b.getNames());
        for(int t = 0; t < 2; ++t)
        {
            for(int i = 0; i < b.getInnings(); ++i)
            {
                score = b.getScore(t, i);
                if(score != HighSchoolBaseballGame.UNPLAYED)
                {
                    if(i == 0)
                        System.out.print("Team " + t + ": ");
                    System.out.print(score + " ");
                    total[t] += score;
                }
                else
                    areInningsLeft = true;
            }
            System.out.println();
        }
        if(b.getScore(0, 0) == HighSchoolBaseballGame.UNPLAYED && b.getScore(1, 0) == HighSchoolBaseballGame.UNPLAYED)
            System.out.println("No innings played yet.");
        if(!areInningsLeft)
        {
            if(total[0] > total[1])
                System.out.println("Team 1 wins!");
            else
            if(total[0] < total[1])
                System.out.println("Team 2 wins!");
            else
                System.out.println("Tie Game!");
        }
    }
}
