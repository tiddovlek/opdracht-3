import java.awt.*;
import java.applet.*;


public class Curtist extends Applet {
	 int a, b, c, d, e; 
	 double uitkomst;
 
	
	
    public void init() {
        a = 59;
        b = 63;
        c = 69;
        d = 3;
        e = 10;
        uitkomst = (a + b + c) /d;
        uitkomst /=10;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}