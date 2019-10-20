package day6;
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;

public class P1Applet extends Applet implements ActionListener, MouseListener, KeyListener {
	private String Bmsg="";
	private String Mmsg="";
	private String Kmsg="";
	public void init() {
		Button b1 = new Button("BUTTON");
		add(b1);
		b1.addActionListener(this);
		addMouseListener(this);
		addKeyListener(this);
		setFocusable(true);
	}
	public void mouseClicked(MouseEvent m) {
		Mmsg="MOUSE CLICKED!";
		repaint();
	}
	public void mouseEntered(MouseEvent m) {
		Mmsg="MOUSE ENTERED!";
		repaint();
	}
	public void mouseExited(MouseEvent m) {
		Mmsg="MOUSE EXITED!";
		repaint();
	}
	public void mousePressed(MouseEvent m) {
		Mmsg="MOUSE PRESSED!";
		repaint();
	}
	public void mouseReleased(MouseEvent m) {
		Mmsg="MOUSE RELEASED!";
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(Bmsg,20,40);
		g.drawString(Mmsg,20,70);
		g.drawString(Kmsg,20,130);
	}
	public void keyReleased(KeyEvent k) {
		showStatus("Key up");
		Kmsg = k.getKeyChar() + " RELEASED";
		repaint();
	}
	public void keyPressed(KeyEvent k) {
		showStatus("Key down");
		Kmsg = k.getKeyChar() + " PRESSED";
		repaint();
	}
	public void keyTyped(KeyEvent k) {
		Kmsg = k.getKeyChar() + " TYPED";
		repaint();
	}
	public void actionPerformed(ActionEvent a) {
		String action = a.getActionCommand();
		if(action.equals("BUTTON"))
			Bmsg = "BUTTON PRESSED!";
		repaint();			
	}
}
