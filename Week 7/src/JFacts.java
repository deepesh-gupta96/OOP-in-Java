import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFacts extends JFrame implements ActionListener
{//Global Declaration Section
    FlowLayout flow = new FlowLayout();//create new FlowLayout named flow
    JButton b = new JButton("Press to change fact");//create new JButton named b
    JLabel stars = new JLabel("**********************************************");//create new JLabel named stars
    JLabel fact = new JLabel();//create new JLabel named fact
    String[] quotes = new String[]{//create a string with 6 quotes in it
            "Only seven prisoners were in the Bastille when it was stormed.",
            "A Tale of Two Cities is a novel set during the French Revolution.",
            "Perhaps 40,000 people were executed at the guillotine.",
            "A loaf of bread cost a weeks wages prior to the French Revolution.",
            "Thomas Jefferson was the U.S. Minister to France during the Revolution.",
            "Protestant and Jewish religions were illegal in France before 1879."
    };
    int counter = 0;
    public JFacts()
    { //Input Section
        JPanel panel = new JPanel();//create new JPanel called panel
        panel.setLayout(flow);//determining how to list the items
        fact.setText(quotes[counter%6]);//take the quotes, rotate through based off counter
        counter++;//repeat
        panel.add(fact);//adding the fact label to the panel
        panel.add(stars);//adding the stars label to the panel
        b.addActionListener(this);//attaching the ActionListener to the button
        panel.add(b);//adding the button to the panel
        add(panel);//adding the panel itself to the JFrame
    }
    public static void main(String[] args) {

        JFacts rFrame = new JFacts();//create a frame with new facts
        rFrame.setSize(450, 100);//set height and width
        rFrame.setVisible(true);//allow the frame to be visible
    }
    @Override
    public void actionPerformed(ActionEvent e)
    { //Output Section
        fact.setText(quotes[counter%6]);//take the quotes, rotate through based off counter
        counter++; //repeat
    }
}