package h11;

import java.applet.Applet;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class h11_2 extends Applet {
int cijfer;

	  public void init() {
		  setSize(250,250);

}
	 
	  public void paint(Graphics g) {
		  int i = 0;
		  
		  int x = 50;
		  int y = 50;
		  cijfer = 10;
		  
		  while (i < 11) {
			  g.drawString(""+cijfer, x ,y);
			
				i++;
		  	x+= 15;
		    cijfer += 1;
	  }
	  } 
}
