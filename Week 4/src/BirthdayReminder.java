/*import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;

public class BirthdayReminder {
    public static void main(String[] args) {
        String[] namesArray = new String[10];
        LocalDate[] birthdaysArray = new LocalDate[10];
        String enteredName, enteredBirthday;
        Scanner scan = new Scanner(System.in);
        int i;
        final String QUIT = "ZZZ";
        final int MAX = 10;
        int count = 0;
        int namesCount = 0;
        int birthdayCount = 0;
        boolean didFind;
        System.out.println("Please enter a name or ZZZ to quit:");
        enteredName = scan.nextLine();
        while(count < MAX && !enteredName.equalsIgnoreCase(QUIT)){
            namesArray[namesCount] = enteredName;
            ++namesCount;
            System.out.println("Now please enter the birthday for: "+enteredName);
            enteredBirthday = scan.nextLine();
            birthdaysArray[birthdayCount] = LocalDate.parse(enteredBirthday);
            ++birthdayCount;
            ++count;
            if(count < MAX){
                System.out.println("Please enter the next name or ZZZ to quit:");
                enteredName = scan.nextLine();
            }
        }
        namesArray = Arrays.copyOf(namesArray, namesCount);
        birthdaysArray = Arrays.copyOf(birthdaysArray, birthdayCount);
        System.out.println("Please enter a name to check their birthday or ZZZ to quit:");
        enteredName = scan.nextLine();
        while(!enteredName.equalsIgnoreCase(QUIT)){
            didFind = false;
            for(i = 0;i < namesArray.length;++i){
                if(namesArray[i].equalsIgnoreCase(enteredName)){
                    System.out.println("Name: "+namesArray[i]+"\n"+
                            "Birthday: "+birthdaysArray[i]);
                    didFind = true;
                    break;
                }
            }
            if(!didFind)
                System.out.println("The name entered is not in the list.");
            System.out.println("Please enter a new name to check their birthday or ZZZ to quit:");
            enteredName = scan.nextLine();
        }
    }
}
*/

import java.util.Scanner;
public class BirthdayReminder {
    public static void main(String[] args) {
        String names[] = new String[10];
        String birthdays[] = new String[10];
        Scanner userInput = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("Enter a name: ");
            String name = userInput.nextLine();
            if (name.equals("ZZZ")) {
                break;
            }
            System.out.print("Enter a birthday: ");
            String birthday = userInput.nextLine();
            names[count] = name;
            birthdays[count] = birthday;
            count++;
            if (count == 10) {
                break;
            }
        }
        System.out.println("Total number of names entered: "+count);
        System.out.println();
        for (int i=0;i<count;i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        while (true) {
            System.out.print("Enter a name: ");
            String name = userInput.nextLine();
            if (name.equals("ZZZ")) {
                break;
            }
            boolean searchFlag = false;
            for (int i=0;i<count;i++) {
                if (names[i].equals(name)){
                    System.out.println("Birth Date: "+birthdays[i]);
                    searchFlag = true;
                    break;
                }
            }
            if (!searchFlag) {
                System.out.println("Sorry, no entry for "+name);
            }
        }
        userInput.close();
    }
}