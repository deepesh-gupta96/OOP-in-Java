import java.util.*;
public class DemoTees
{
    public static void main(String[] args)
    {
        TeeShirt tee1 = new TeeShirt();
        TeeShirt tee2 = new TeeShirt();
        CustomTee tee3 = new CustomTee();;
        CustomTee tee4 = new CustomTee();
        tee1.setOrderNumber(100);
        tee1.setSize("XXL");
        tee1.setColor("blue");
        tee2.setOrderNumber(101);
        tee2.setSize("S");
        tee2.setColor("gray");
        tee3.setOrderNumber(102);
        tee3.setSize("L");
        tee3.setColor("red");
        tee3.setSlogan("Born to have fun");
        tee4.setOrderNumber(104);
        tee4.setSize("XXXL");
        tee4.setColor("black");
        tee4.setSlogan("Wilson for Mayor");
        display(tee1);
        display(tee2);
        displayCustomData(tee3);
        displayCustomData(tee4);
    }
    public static void display(TeeShirt tee)
    {
        System.out.println("Order #" + tee.getOrderNumber());
        System.out.println("     Description: " + tee.getSize() +
                " " + tee.getColor());
        System.out.println("     Price: $" + tee.getPrice());
    }
    public static void displayCustomData(CustomTee tee)
    {
        display(tee);
        System.out.println("     Slogan: " + tee.getSlogan());
    }
}
