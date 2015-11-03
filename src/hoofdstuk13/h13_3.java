package hoofdstuk13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class h13_3 extends Applet{

	
	
	public void paint(Graphics g) {
		
		int y = 20;
	tekenDriehoek(g, 20, y, 40, 20);
	tekenDriehoek(g, 61, y, 40, 20);
	tekenDriehoek(g, 102, y, 40, 20);
	tekenDriehoek(g, 143, y, 40, 20);
	y = 41;
	tekenDriehoek(g, 20, y, 40, 20);
	tekenDriehoek(g, 61, y, 40, 20);
	tekenDriehoek(g, 102, y, 40, 20);
	tekenDriehoek(g, 143, y, 40, 20);
	y = 62;
	tekenDriehoek(g, 20, y, 40, 20);
	tekenDriehoek(g, 61, y, 40, 20);
	tekenDriehoek(g, 102, y, 40, 20);
	tekenDriehoek(g, 143, y, 40, 20);
	y = 83;
	tekenDriehoek(g, 20, y, 40, 20);
	tekenDriehoek(g, 61, y, 40, 20);
	tekenDriehoek(g, 102, y, 40, 20);
	tekenDriehoek(g, 143, y, 40, 20);
	y = 104;
	tekenDriehoek(g, 20, y, 40, 20);
	tekenDriehoek(g, 61, y, 40, 20);
	tekenDriehoek(g, 102, y, 40, 20);
	tekenDriehoek(g, 143, y, 40, 20);
	y = 125;
	tekenDriehoek(g, 20, y, 40, 20);
	tekenDriehoek(g, 61, y, 40, 20);
	tekenDriehoek(g, 102, y, 40, 20);
	tekenDriehoek(g, 143, y, 40, 20);
}
	
	
	void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2) {
		g.setColor(Color.red);
		g.fillRect(x1, y1, x2, y2);
		g.fillRect(x1, y1, x2, y2);
		
	}
}
