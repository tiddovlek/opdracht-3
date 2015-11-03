package hoofdstuk13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class praktijkdeel2 extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		setSize(800, 800);
	}
	
	public void paint(Graphics g) {
		int y = 100;
		int p = 150;
		for(int j = 0; j < 3; j++) {
		y = 100;
			p += 100;
		for(int i = 0; i <5; i++){
		
			y += 100;
		drawTree(g, y, p);
		

		}
	
		}
	}
	
	void drawTree(Graphics g, int x, int y) {
		int d= y/350;
		int[] xPoints = {x, x-d*10, x-d*10, x-d*55, x-d*7, x, x+d*7, x+d*55,x+d*10,x+d*10};
		int[] yPoints = {y, y, y-d*50, y-d*80, y-d*60, y-d*100, y-d*60,y-d*80,y-d*50,y };
		g.setColor(new Color(185, 75, 5));
		g.fillPolygon(xPoints, yPoints, 10);
		g.setColor(Color.green);
		g.fillOval(x-d*63, y-d*85, d*30, d*24);
		g.fillOval(x+d*35, y-d*85, d*30, d*24);
		g.fillOval(x-d*30, y-d*120, d*60, d*48);

	}
}