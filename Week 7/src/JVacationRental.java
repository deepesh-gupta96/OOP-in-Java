import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVacationRental extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    String companyName = new String("Lambert's Vacation Rentals");
    Font bigFont = new Font("Arial", Font.PLAIN, 24);
    final int PARKPRICE = 600, POOLPRICE = 750, LAKEPRICE = 825;
    int totalPrice = 0;
    ButtonGroup locationGrp = new ButtonGroup();
    JCheckBox parkBox = new JCheckBox("Parkside", false);
    JCheckBox poolBox = new JCheckBox("Poolside", false);
    JCheckBox lakeBox = new JCheckBox("Lakeside", false);
    final int ONEPRICE = 0, TWOPRICE = 75, THREEPRICE = 150;
    ButtonGroup bdrmGrp = new ButtonGroup();
    JCheckBox oneBox = new JCheckBox("1 bedroom", false);
    JCheckBox twoBox = new JCheckBox("2 bedrooms", false);
    JCheckBox threeBox = new JCheckBox("3 bedrooms", false);
    final int NOMEALSPRICE = 0, MEALSPRICE = 200;
    ButtonGroup mealGrp = new ButtonGroup();
    JCheckBox noMealsBox = new JCheckBox("No meals", false);
    JCheckBox mealsBox = new JCheckBox("Meals included", false);
    JTextField totPrice = new JTextField(10);
    String output;
    public JVacationRental() {
        // Write your code here
    }
    public static void main(String[] arguments) {
        JVacationRental aFrame = new JVacationRental();
        aFrame.setSize(320, 200);
        aFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check) {
        // Write your code here
    }
}
