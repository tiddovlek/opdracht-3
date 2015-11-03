package hoofdstuk13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class h13_4 extends Applet{

	
	
	public void paint(Graphics g) {
		
		int y = 40;
	tekenDriehoek(g, 20, y, 80, 40);
	tekenDriehoek(g, 101, y, 80, 40);
	tekenDriehoek(g, 182, y, 80, 40);
	tekenDriehoek(g, 263, y, 80, 40);
	y = 81;
	tekenDriehoek(g, 20, y, 80, 40);
	tekenDriehoek(g, 101, y, 80, 40);
	tekenDriehoek(g, 182, y, 80, 40);
	tekenDriehoek(g, 263, y, 80, 40);
	y = 122;
	tekenDriehoek(g, 20, y, 80, 40);
	tekenDriehoek(g, 101, y, 80, 40);
	tekenDriehoek(g, 182, y, 80, 40);
	tekenDriehoek(g, 263, y, 80, 40);
	y = 163;
	tekenDriehoek(g, 20, y, 80, 40);
	tekenDriehoek(g, 101, y, 80, 40);
	tekenDriehoek(g, 182, y, 80, 40);
	tekenDriehoek(g, 263, y, 80, 40);
	y = 204;
	tekenDriehoek(g, 20, y, 80, 40);
	tekenDriehoek(g, 101, y, 80, 40);
	tekenDriehoek(g, 182, y, 80, 40);
	tekenDriehoek(g, 263, y, 80, 40);
	y = 245;
	tekenDriehoek(g, 20, y, 80, 40);
	tekenDriehoek(g, 101, y, 80, 40);
	tekenDriehoek(g, 182, y, 80, 40);
	tekenDriehoek(g, 263, y, 80, 40);
}
	
	
	void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x1, y1, x2, y2);
		
	}
}
