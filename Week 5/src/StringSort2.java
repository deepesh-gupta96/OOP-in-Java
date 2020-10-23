import java.util.*;
public class StringSort2 {
    public static void main(String[] args) {
        String[] values = new String[15];
        int x = 0;
        int count = 0;
        String word;
        final String Quit = "zzz";
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        for (x = 0; x < values.length; ++x)
            values[x] = Quit;
        x = 0;
        System.out.println("Enter a word or " + Quit + " to quit");
        while (x < values.length) {
            word = in.nextLine();
            if (word.equals(Quit)) {
                count = x;
                x = values.length;
                exit = true;
            } else {
                values[x] = word;
                ++x;
            }
        }
        if (!exit)
            count = values.length;
        String output = "Values";
        Arrays.sort(values);
        for (x = 0; x < count; ++x)
            output = output + "  " + values[x];
        System.out.println(output);
    }
}
