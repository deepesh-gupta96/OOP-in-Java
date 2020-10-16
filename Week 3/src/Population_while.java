public class Population_while {
    double mex = 128; //Mexico is 121 million
    double usa = 323; //United States is 315 million
    double mexRate = 1.0101; //Mexico's pop increases 1.05% annually
    double usaRate = 0.9985; //The USA pop is reduced 0.16% annually
    int year = 2020;
    int iter = 0;

    public void calcUsa() {
        this.usa = usa * usaRate;
    }
    public void calcMex() {
        this.mex = mex * mexRate;
    }
    public void calcYear() {
        year++;
    }
    public void calcIter() {
        iter++;
    }
    public double getusa() {
        return usa;
    }
    public double getmex() {
        return mex;
    }
    public int getyear() {
        return year;
    }
    public int getIter() {
        return iter;
    }
    public void display() {
        System.out.println("The population of the United States in " + getyear() + " is: "+getusa());
        System.out.println("The population of Mexico in " + getyear() + " is: "+getmex());
    }

    public void displayUsa() {
        System.out.println("The population of the United States during " +getyear() + " is: "+getusa());
    }

    public void displayMex() {
        System.out.println("The population of Mexico during " + getyear() + " is: "+getmex());
    }

    public void displayIter() {
        System.out.println("The population of Mexico will exceed the U.S. population in " + getIter() + " years");
        System.out.println("The population of Mexico will be " + getmex() + " million");
        System.out.println("and the population of the U.S. will be " + getusa() + " million");
    }

    public static void main(String[] args) {
        Population_while pop1 = new Population_while();
        while (pop1.usa > pop1.mex )
        {
            pop1.calcYear();  //increments year
            pop1.calcUsa();  //decrements usa
            pop1.calcMex();  //increments mex
            pop1.display();  //calls display() method from class
            pop1.calcIter();  //increments inter
        }
        pop1.displayIter();  //Calls displayiter() method from class
    }
}
