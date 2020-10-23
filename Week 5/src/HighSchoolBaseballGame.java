public class HighSchoolBaseballGame extends BaseballGame
{
    private final int INNINGS = 7;
    public HighSchoolBaseballGame()
    {
        scores = new int[2][INNINGS];
        for(int a = 0; a < scores.length; ++a)
            for(int i = 0; i < scores[a].length; ++i)
                scores[a][i] = UNPLAYED;
    }
    public int getInnings()
    {
        return INNINGS;
    }
}
