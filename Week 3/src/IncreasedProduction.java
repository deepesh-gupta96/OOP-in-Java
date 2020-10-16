public class IncreasedProduction {
    public static void main(String[] args) {
        double parts = 4000;
        double percent =0.06;

        for(int x=1; x <= 24;x++) {
            double increased = parts*percent;
            parts = increased +parts;
            System.out.println("Month number " + x + ", Number of parts: " + parts);
            if (parts >= 7000) {
                System.out.println(" The month in which production exceeds 7000.0 is month "+x);
            }
        }

    }
}
