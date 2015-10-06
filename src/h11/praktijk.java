package h11;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class praktijk extends Applet {
int cijfer;
int tafel;
int tafel2;
TextField tekstvak;

	  public void init() {
		  setSize(250,250);
		  tekstvak = new TextField("",20);
		  tekstvak.addActionListener(new tekstvakactionlistener());
		  tafel2 = 0;
		  
		  add(tekstvak);

}
	 
	  public void paint(Graphics g) {
		  int i = 1;
		  tafel = tafel2;
		  int x = 50;
		  int y = 50;
		 cijfer = 1;

		
		  
		  while (i < 10) {
			 
			  g.drawString(+tafel2+"x"+i+  " = "+tafel, x ,y);
			cijfer++;
			  tafel = (tafel2 * cijfer);
				i++;
		  	y+= 20;
		  	
	  }
	  } 
	  class tekstvakactionlistener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				tafel2 = Integer.parseInt(tekstvak.getText());
		 
		            
		                    repaint();
			}
	  }
	  }	
