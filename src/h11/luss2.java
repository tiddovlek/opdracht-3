package h11;

import java.applet.Applet;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class luss2 extends Applet {


	  public void init() {

}
	 
	  public void paint(Graphics g) {
		  int i = 0;
		  int j = 0;
		  int x = 50;
		  int y = 50;
		  
		  
		  while (j < 30) {
			  x = 50;
			 y += 20;
		  while (i < 30) {
				g.drawString("x", x ,y);
				i++;
		  	x+= 10;
		  
	  }
		  i = 0;
		j++;  
		  }
	  } 
}
