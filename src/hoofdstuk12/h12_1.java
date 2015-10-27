package hoofdstuk12;

import java.applet.Applet;
import java.awt.Graphics;

public class h12_1 extends Applet {

	
	
    double[] salaris;
    double gemiddelde;

public void init() {
	setSize(500,200);
	salaris = new double[10];
	salaris[0] = 10;
	salaris[1] = 22;
	salaris[2] = 45;
	salaris[3] = 12;
	salaris[4] = 13;
	salaris[5] = 16;
	salaris[6] = 14;
	salaris[7] = 13;
	salaris[8] = 16;
	salaris[9] = 19;
	gemiddelde = (salaris[0]+salaris[1]+salaris[2]+salaris[3]+salaris[4]+salaris[5]+salaris[6]+salaris[7]+salaris[8]+salaris[9]) / 10;
	 
 }



public void paint(Graphics g) {
	 for (int teller = 0; teller < salaris.length; teller ++) {
         g.drawString("" + salaris[teller], 50 * teller + 20, 20);
         g.drawString("Het gemiddelde is" + gemiddelde, 80, 40);
	 }
}
}
