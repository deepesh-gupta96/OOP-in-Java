import java.util.*;
public class DemoLLBaseballGame
{
    public static void main(String[] args)
    {
        LittleLeagueBaseballGame L_game = new LittleLeagueBaseballGame();
        L_game.setNames("WSU", "Trine");
        display(L_game);
        L_game.setScore(0, 0, 2);
        L_game.setScore(1, 0, 0);
        System.out.println("After setting first inning");
        display(L_game);
        System.out.println("Trying to set fifth inning (inning 4) too soon");
        L_game.setScore(0, 4, 1);
        System.out.println("After setting second inning scores");
        L_game.setScore(0, 1, 1);
        L_game.setScore(1, 1, 4);
        display(L_game);
        System.out.println("Trying to use an invalid inning");
        L_game.setScore(0, 6, 2);
        System.out.println("Trying to use an invalid team");
        L_game.setScore(2, 2, 2);
        System.out.println("\nAfter setting the rest of the innings");
        for(int t = 0; t < 2; ++t)
            for(int i = 2; i < L_game.getInnings(); ++i)
                L_game.setScore(t, i, 2);
        L_game.setScore(1, 5, 10); //10 extra runs in last inning
        display(L_game);

    }
    public static void display(LittleLeagueBaseballGame b)
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
        if(b.getScore(0, 0) == BaseballGame.UNPLAYED && b.getScore(1, 0) == LittleLeagueBaseballGame.UNPLAYED)
            System.out.println("No match played yet.");
        if(!areInningsLeft)
        {
            if(total[0] > total[1])
                System.out.println("Team 1 wins");
            else
            if(total[0] < total[1])
                System.out.println("Team 2 wins");
            else
                System.out.println("Tie Game!");
        }
    }
}
