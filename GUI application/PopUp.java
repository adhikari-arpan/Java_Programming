import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopUp extends MouseAdapter implements ActionListener {
	JFrame f;
	JPopupMenu popUp;
	JMenuItem sa, x, c, v, close;
	JTextArea ta;
	
	public PopUp(){
		f = new JFrame();
		f.setSize(400,500);
		
		popUp = new JPopupMenu();
		
		sa = new JMenuItem("Select All");
		x = new JMenuItem("Cut");
		c = new JMenuItem("Copy");
		v = new JMenuItem("Paste");
		close = new JMenuItem("Close");
		
		popUp.add(sa);
		popUp.add(x);
		popUp.add(c);
		popUp.add(v);
		popUp.addSeparator();
		popUp.add(close);
		
		sa.addActionListener(this);
		x.addActionListener(this);
		c.addActionListener(this);
		v.addActionListener(this);
		close.addActionListener(this);
		
		ta = new JTextArea("");
		ta.setToolTipText("Type Something Here....");
		ta.setBounds(150,100,300,100);
		f.add(ta);
		
		f.addMouseListener(this);
		f.setLayout(null);
		f.setVisible(true);
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
		
		public void mouseClicked(MouseEvent e) {
			popUp.show(f,e.getX(),e.getY());
		}
	
	public static void main(String[] args) {
		new PopUp();
	}
	
}
