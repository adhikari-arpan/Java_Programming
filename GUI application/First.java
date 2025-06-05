import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class First extends JFrame implements MouseListener, MouseMotionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel first, second;
	
	public First() {
		setSize(400,400);
		first = new JLabel();
		second = new JLabel();
		add(first);
		add(second);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		first.setText("In");
	}
	
	public void mouseExited(MouseEvent e) {
		first.setText("Out");
	}
	
	public void mouseMoved(MouseEvent e) {
		String loc = "X:" + e.getX() + "" + "Y:" + e.getY();
		second.setText(loc);
	}
	
	public void mousePressed(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
	
	public static void main(String[] args) {
		new First();
	}
}
