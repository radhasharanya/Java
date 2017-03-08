package dayAssignment;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public   class KeyPressEvent extends Applet implements KeyListener {
	
	public void paint(Graphics g)
	{
		g.drawString("HELLO",10,20);
	}
	public void init()
	{
		addKeyListener(this);
		requestFocus();
		
	}
	public void keyPressed(KeyEvent k)
	{
		showStatus("KeyPressed+");
		String c=String.valueOf(k.getKeyChar());
		showStatus(c);

}
	public void keyReleased(KeyEvent k)
	{
		showStatus("Key Released");
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
