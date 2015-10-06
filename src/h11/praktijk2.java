package h11;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class praktijk2 extends Applet {
int cijfer;
int tafel;
int tafel2;
TextField tekstvak;
Button next;

	  public void init() {
		  setSize(250,250);
		  
		  next = new Button("Volgende Tafel");
		  next.addActionListener(new buttonactionlistener());
		  tafel2 = 0;
		  
		  add(next);

}
	 
	  public void paint(Graphics g) {
		  int i = 1;
		  tafel = tafel2;
		  int x = 50;
		  int y = 50;
		 cijfer = 1;

		
		  
		  while (i < 10) {
			 
			  g.drawString(+tafel2+"*"+i+  " "+tafel, x ,y);
			cijfer++;
			  tafel = (tafel2 * cijfer);
				i++;
		  	y+= 20;
		  	
	  }
	  } 
	  class buttonactionlistener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				
		 tafel2 +=1;
		 	
		            
		                    repaint();
			}
	  }
	  }	
