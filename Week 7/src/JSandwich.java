import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSandwich extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JLabel companyName = new JLabel("Sublime Sandwich");
    String[] meat = {"chicken","beef","tuna"};
    JComboBox mainBox = new JComboBox(meat);
    String[] bread = {"white","rye","whole wheat"};
    JComboBox breadBox = new JComboBox(bread);
    JLabel mainList = new JLabel("Main ingredient");
    JLabel breadList = new JLabel("Breads");
    JTextField totPrice = new JTextField(10);
    double[] mainPrices = {6.99, 7.99, 8.99};
    double value = 0;
    public JSandwich() {
        add(companyName);
        setLayout(flow);
        add(mainList);
        add(mainBox);
        mainBox.addItemListener(this::itemStateChanged);
        add(breadList);
        add(breadBox);
        add(totPrice);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] arguments) {
        JSandwich sandframe = new JSandwich();
        sandframe.setSize(240, 200);
        sandframe.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        Object getitem = mainBox.getSelectedItem();
        if (getitem.equals(meat[0]))
            value = mainPrices[0];
        else
        if (getitem.equals(meat[1]))
            value = mainPrices[1];
        else
        if (getitem.equals(meat[2]))
            value = mainPrices[2];

        totPrice.setText("Total price: $" + value);
    }
}
