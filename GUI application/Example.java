
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example implements ActionListener {

    JFrame f;
    JButton red, black, green;

    public Example() {
        f = new JFrame();
        f.setSize(400, 500);
        red = new JButton("Red");
        black = new JButton("Black");
        green = new JButton("Green");
        f.add(black);
        f.add(green);
        f.add(red);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red.addActionListener(this);
        green.addActionListener(this);
        black.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            f.getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == green) {
            f.getContentPane().setBackground(Color.GREEN);
        } else {
            f.getContentPane().setBackground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new Example();
    }
}
