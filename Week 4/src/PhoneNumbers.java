import java.util.Scanner;
public class PhoneNumbers {

    public static void main(String[] args) {
        final int MAX_ENTRIES = 12;
        String entry;
        String[] names = new String[MAX_ENTRIES];
        names[0] = "Gina";
        names[1] = "Marcia";
        names[2] = "Rita";
        names[3] = "Jennifer";
        names[4] = "Fred";
        names[5] = "Neil";
        names[6] = "Judy";
        names[7] = "Arlene";
        names[8] = "LaWanda";
        names[9] = "Deepak";
        String[] numbers = new String[MAX_ENTRIES];
        numbers[0] = "(847) 341-0912";
        numbers[1] = "(847) 341-2392";
        numbers[2] = "(847) 354-0654";
        numbers[3] = "(414) 234-0912";
        numbers[4] = "(414) 435-6567";
        numbers[5] = "(608) 123-0904";
        numbers[6] = "(608) 435-0434";
        numbers[7] = "(608) 123-0312";
        numbers[8] = "(920) 787-9813";
        numbers[9] = "(930) 412-0991";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        entry = input.nextLine();

        do {
            for(int i = 0; i < names.length; ++i) {
                if(names[i] != null) {
                    if(entry.equalsIgnoreCase(names[i])) {
                        System.out.println("Phone number: " + numbers[i]);
                        break;
                    }
                } else {
                    names[i] = entry;
                    System.out.print("Enter a phone number for: " + names[i]);
                    entry = input.nextLine();
                    numbers[i] = entry;
                    break;
                }
            }
            if(names[MAX_ENTRIES-1] != null) {
                System.out.println("Phone Directory is FULL");
            }
            System.out.print("Enter a name or \"quit\" to exit: ");
            entry = input.nextLine();
        } while(!entry.equalsIgnoreCase("quit"));
    }
}
