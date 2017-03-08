package dayAssignment;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class SwingExample  extends JFrame{
	public SwingExample() {
		JButton jb=new JButton("Submit");
		add(jb);
		JCheckBox jc=new JCheckBox("Check");
		add(jc);
		JRadioButton jr=new JRadioButton("select");
	}

	public static void main(String[] args) {
		SwingExample s=new SwingExample();

	}

}
