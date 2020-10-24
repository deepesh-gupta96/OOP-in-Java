import java.util.*;
public class UseInsurance {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int insurance;
        System.out.println("Enter 1 for Life Insurance or 2 for Health Insurance");
        String userInput = input.next();
        insurance = Integer.parseInt(userInput);

        if(insurance == 1)
            insuranceLife();
        else
            insuranceHealth();
    }
    public static void insuranceLife() {
        Life life = new Life();
        life.display();
    }
    public static void insuranceHealth() {
        Health health = new Health();
        health.display();
    }
}
