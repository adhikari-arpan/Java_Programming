
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class First extends JFrame implements ActionListener {

    JTextField t;
    JButton btn;

    public First() {
        setTitle("Java");
        setSize(400, 500);
        t = new JTextField();
        t.setColumns(10);
        btn = new JButton("Click");
        add(t);
        add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setBackground(Color.BLACK);
        Font fnt = new Font("Arial", Font.BOLD, 20);
        t.setFont(fnt);
        t.setForeground(Color.RED);
    }

    public static void main(String[] args) {
        new First();
    }
}
