package hoofdstuk14;

import java.applet.Applet;
import java.awt.Graphics;

public class Test extends Applet{

	String test = "hoi";
	
	public void init() {
		paint1();
		paint2();
	}
	
	public void paint1() 
	{
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test = "hoi1";
		repaint();
	}
	
	public void paint2()
	{
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test = "hoi2";
		repaint();		
	}
	
	public void paint(Graphics g)
	{
		g.drawString(test, 5, 10);
	}
}
