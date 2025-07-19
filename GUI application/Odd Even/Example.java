import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example extends JFrame implements ActionListener{
    JTextField t, ans;
    JButton b;
    
    public Example(){
        setSize(400,500);
        t = new JTextField();
        ans = new JTextField();
        b = new JButton("Check");
        t.setColumns(10);
        ans.setColumns(10);
        ans.setEditable(false);
        setVisible(true);
        setLayout(new FlowLayout());
        add(t);
        add(ans);
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int num = Integer.parseInt(t.getText());
        String result;
        if(num%2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }
        ans.setText(result);
    }

    public static void main(String[] args) {
        new Example();
    }

}
