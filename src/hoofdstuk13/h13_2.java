package hoofdstuk13;

import java.applet.Applet;
import java.awt.Graphics;

public class h13_2 extends Applet{

	
	
	public void paint(Graphics g) {
	tekenDriehoek(g, 50, 50, 70, 70, 90, 50);
}
	
	
	void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x1, y1, x3, y3);
	}
}
