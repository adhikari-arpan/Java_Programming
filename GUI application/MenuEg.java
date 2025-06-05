import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEg extends JFrame implements ActionListener {
	JMenu menu;
	JMenuBar mb;
	JMenuItem sa, x, c, v, close;
	JTextArea ta;
	
	public MenuEg(){
		setSize(400,500);
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		menu = new JMenu("Menu");
		mb.add(menu);
		
		sa = new JMenuItem("Select All");
		x = new JMenuItem("Cut");
		c = new JMenuItem("Copy");
		v = new JMenuItem("Paste");
		close = new JMenuItem("Close");
		
		menu.add(sa);
		menu.add(x);
		menu.add(c);
		menu.add(v);
		menu.addSeparator();
		menu.add(close);
		
		sa.addActionListener(this);
		x.addActionListener(this);
		c.addActionListener(this);
		v.addActionListener(this);
		close.addActionListener(this);
		
		ta = new JTextArea("");
		ta.setToolTipText("Type Something Here....");
		ta.setBounds(150,100,300,100);
		add(ta);
		
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String item = e.getActionCommand();
		
		switch(item) {
		case "Select All": 
			ta.selectAll();
			break;
			
		case "Cut":
			ta.cut();
			break;
			
		case "Copy":
			ta.copy();
			break;
				
		case "Paste": 
			ta.paste();
			break;
			
		case "Close":
			System.exit(0);
		
		}
	}
	
	public static void main(String[] args) {
		new MenuEg();
	}
	
}
