
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    JButton plus, sub;
    JTextField in1, in2, out;

    public Calculator() {
        setSize(400, 500);
        in1 = new JTextField();
        in2 = new JTextField();
        in1.setColumns(10);
        in2.setColumns(10);
        out = new JTextField();
        out.setColumns(10);
        plus = new JButton("Plus");
        sub = new JButton("Sub");
        add(in1);
        add(in2);
        add(out);
        add(plus);
        add(sub);
        in1.setToolTipText("Enter first number");
        in2.setToolTipText("Enter second number");
        setLayout(new FlowLayout());
        setVisible(true);
        out.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        plus.addActionListener(this);
        sub.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(in1.getText());
        int num2 = Integer.parseInt(in2.getText());
        int result = 0;
        if (e.getSource() == plus) {
            result = num1 + num2;
        } else {
            result = num1 - num2;
        }
        out.setText("" + result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
