package h11;

import java.applet.Applet;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class h11_3 extends Applet {
int cijfer;
int previous;

	  public void init() {
		  setSize(250,250);

}
	 
	  public void paint(Graphics g) {
		  int i = 0;
		  previous = -1;
		  int x = 50;
		  int y = 50;
		  cijfer = 1;
		  
		  while (i < 11) {
			  int sum = cijfer + previous;
			  previous = cijfer;
			  cijfer = sum;
			  
			  g.drawString(""+cijfer, x ,y);
	
		
				i++;
		  	x+= 20;
		
	  }
	  } 
}
