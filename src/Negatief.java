
	import java.awt.*;
	import java.applet.*;


	public class Negatief extends Applet {
	    int a, b, c, uitkomst;
		
		
	    public void init() {
	        a = 2147483647;
	        b = 9;
	          uitkomst = (a + b);
	    }

	    public void paint(Graphics g) {
	        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
	    }
	}
