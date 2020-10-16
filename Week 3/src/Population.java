public class Population {
    public static void main(String[] args)
    {
        double mexico = 128;
        double us = 323;
        int year = 0;

        while (mexico < us) {
            year++;
            mexico *= 1.0101;
            us *= 0.9985;
        }

        System.out.println("The population of Mexico will exceed the U.S. population in " + year + " years");
        System.out.println("The population of Mexico will be " + mexico + " million");
        System.out.println("and the population of the U.S. will be " + us + " million");
    }
}
