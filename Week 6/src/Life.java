import java.util.*;
public class Life extends Insurance {
    public Life() {
        super("Life");
        setCost();
    }
    public void setCost() {
        cost = 36;

    }
    public void display() {
        System.out.println("Life insurance costs: " + cost + "$ per month.");

    }
}
