package h11;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class h11_6 extends Applet {
int cijfer;



	  public void init() {
		  setSize(250,250);


}
	 
	  public void paint(Graphics g) {
	
		  int x = 50;
		  int y = 50;

		
		  
		 for(int i = 0; i < 5; i++) {
			 
	 g.drawRect(x, y, 10, 10);
		x+= 10;
		y+= 10;
		  
		  	
	  }
	  } 

	  }	
