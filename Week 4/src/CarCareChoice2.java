import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {

        String[] service = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] price = {25,22,15,5};
        int length = service.length;
        boolean isValidItem = false;
        int value = 0;

        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println(" Enter Service: ");
        input = sc.nextLine();

        for (int i = 0; i<length; ++i){
            if (input.substring(0,3).equals(service[i].substring(0,3)) ){

                isValidItem = true;
                value = price[i];
            }}
        if (isValidItem){
            System.out.println("$"+value);
        }
        else{
            System.out.println("Invalid Entry");
        }

    }



}

