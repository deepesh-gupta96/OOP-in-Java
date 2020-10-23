public class PremiumSugarSmashPlayer extends SugarSmashPlayer{
    boolean paid=false;

    public void setPaid(float n) {
        if (n>=2.99) {
            this.paid=true;
            System.out.println("You have successfully bought this version");
        }
        else {
            System.out.println("Insufficient payment amount");
            return;
        }
    }

    public boolean getPaid() {
        return this.paid;
    }

    public void setScore(int score, int level) {
        //this.highscore[level]=score;
        if (!this.paid) {
            System.out.println("You haven't bought this version yet");
            return;
        }
        if (level>50 && level<1) {
            System.out.println("No such level exists");
            return;
        }
        else if (level==1) {
            this.scores[0]=score;
        }
        else {
            for (int i=0;i<(level-1);i++) {
                if (this.scores[i]!=100) {
                    System.out.println("Cannot access this level yet");
                    return;
                }
            }
            this.scores[level-1]=score;
        }
    }

    public int getScore(int level) {
        if (level>50 && level<1) {
            System.out.println("No such level exists");
            return 0;
        }
        else {
            return this.scores[level-1];
        }
    }


}
