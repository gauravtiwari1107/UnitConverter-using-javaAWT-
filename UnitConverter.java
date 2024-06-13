import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UnitConverter {
    public static void converter() {
        JFrame jf = new JFrame("Unit Converter");

        // Creating two labels
        JLabel l1, l2;

        // creating two textfield

        JTextField t1, t2;

        // Creating three buttons

        JButton b1, b2, b3;

        // Naming the labels and setting the bounds for the labels

        l1 = new JLabel("Rupees: ");
        l1.setBounds(20, 40, 60, 30);

        l2 = new JLabel("Dollar: ");
        l2.setBounds(170, 40, 60, 30);

        // Initializing the textfields with 0 by default and setting the bounds for the
        // textfields
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 60, 30);

        t2 = new JTextField("0");
        t2.setBounds(230, 40, 60, 30);

        // Creating a button for INR , one button for dollar and one button to close and
        // setting the bound
        b1 = new JButton("INR");
        b1.setBounds(50, 80, 60, 15);

        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 80, 15);

        b3 = new JButton("Cancel");
        b3.setBounds(130, 120, 80, 25);

        // Add actionListener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Converting to double
                double d = Double.parseDouble(t1.getText());

                // Converting ruppes to dollar

                double d1 = (d / 83.0);

                // getting the string value of calculated value

                String str = String.valueOf(d1);

                // placing it into textBox

                t2.setText(str);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Converting to double
                double d2 = Double.parseDouble(t2.getText());

                // Converting dollar to rupees

                double d3 = (d2 * 83.0);

                // getting the string value of calculated value

                String str1 = String.valueOf(d3);

                // placing it into textBox

                t1.setText(str1);

            }
        });

        // Action Listener to close the form

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
            }
        });

        // Default method for closing the frame

        jf.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding the created objects to form
        jf.add(l1);
        jf.add(l2);

        jf.add(t1);
        jf.add(t2);

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);

        jf.setLayout(null);
        jf.setSize(400, 300);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        converter();
    }
}
