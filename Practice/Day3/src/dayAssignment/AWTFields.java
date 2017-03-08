package dayAssignment;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.TextField;
/*
<applet code="AWTFields" width=500 height=500>
</applet>
*/

public class AWTFields  extends Applet{
	
	  public void init(){
		  TextField txt=new TextField();
		  Button button1 = new Button();
		  button1.setLabel("Submit");
		  Choice options = new Choice();
		  options.add("option1");
		  options.add("option2");
		  add(options); 
		  add(txt);
		  add(button1);
		 
				
	  }

}
