package h11;

import java.applet.Applet;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class luss extends Applet {


	  public void init() {

}
	 
	  public void paint(Graphics g) {
		  
		  int x = 50;
		  int y = 50;
		  
		  for(int j = 0; j < 30; j++) {
			  for(int i = 0; i < 30; i++) {
		  g.drawString("x", x ,y);
	  x +=10;
}
			  x = 50;
			  y += 10;
	  } 
}
}