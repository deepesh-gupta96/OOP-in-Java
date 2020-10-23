public class SugarSmashPlayer {
    int idNumber;
    String name;
    int[] scores=new int[50];

    public void setIdNumber(int id) {
        this.idNumber =id;
    }

    public void setName(String n) {
        this.name=n;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setScore(int score, int level)
    {
        int x;
        boolean isBadLevel = false;
        if(level < 0 || level > scores.length - 1)
            System.out.println(level + " is an invalid level number");
        else
        {
            for(x = 0; x < level; ++x)
                if(scores[x] < 100)
                    isBadLevel = true;
            if(isBadLevel)
                System.out.println("A score cannot yet be set for level " + level);
            else
                scores[level] = score;
        }
    }

    public int getScore(int level)
    {
        int score = -99;
        if(level < 0 || level > scores.length - 1)
            System.out.println(level + " is an invalid level number");
        else
            score = scores[level];
        return score;
    }

}
