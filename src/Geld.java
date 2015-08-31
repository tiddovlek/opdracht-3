
import java.awt.*;
import java.applet.*;


public class Geld extends Applet {
    double a, b, c, uitkomst;
	
	
    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}