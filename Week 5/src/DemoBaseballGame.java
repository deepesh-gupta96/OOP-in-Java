import java.util.*;
public class DemoBaseballGame
{
    public static void main(String[] args)
    {
        BaseballGame baseballgame = new BaseballGame();
        baseballgame.setNames("WSU", "Trine");
        display(baseballgame);
        baseballgame.setScore(0, 0, 2);
        baseballgame.setScore(1, 0, 0);
        System.out.println("After setting first inning");
        display(baseballgame);
        System.out.println("Trying to set fifth inning (inning 4) too soon");
        baseballgame.setScore(0, 4, 1);
        System.out.println("After setting second inning scores");
        baseballgame.setScore(0, 1, 1);
        baseballgame.setScore(1, 1, 1);
        display(baseballgame);
        System.out.println("Trying to use an invalid inning");
        baseballgame.setScore(0, 9, 2);
        System.out.println("Trying to use an invalid team");
        baseballgame.setScore(2, 2, 2);
        System.out.println("After setting the rest of the innings");
        for(int t = 0; t < 2; ++t)
            for(int i = 2; i < baseballgame.getInnings(); ++i)
                baseballgame.setScore(t, i, 0);
        display(baseballgame);
    }
    public static void display(BaseballGame b)
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
                if(score != BaseballGame.UNPLAYED)
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
        if(b.getScore(0, 0) == BaseballGame.UNPLAYED && b.getScore(1, 0) == BaseballGame.UNPLAYED)
            System.out.println("No matches played yet.");
        if(!areInningsLeft)
        {
            if(total[0] > total[1])
                System.out.println(b.getName(0) + " win!");
            else
            if(total[0] < total[1])
                System.out.println(b.getName(1) + " win!");
            else
                System.out.println("Tie Game!");
        }
    }
}
