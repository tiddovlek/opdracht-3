package hoofdstuk12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class praktijk extends Applet {

	
	
    	Button knop;
    	double[] aantal;
    	String[] naam;
    	int teller;
    	TextField[] tekstveld;
    	int teller2;
    	Label label;
    	Label label2;
    	int c;
    
    public void init() {
    	setSize(625,200);
    	knop = new Button("Oke");
   
    	tekstveld = new TextField[10];
    	aantal = new double[10];
    	naam = new String[10];
    	teller = 0;
    	c = 0;
    	teller2 = 0;
    	int x = 20;
    	int y = 20;
    	label = new Label("Namen");
    	label2 = new Label("Nummer");
	add(label);

	for (int i = 0; i < tekstveld.length; i++) {
		 	tekstveld[i] = new TextField("",10);
            tekstveld[i].addActionListener(new Actionlisteren());
            tekstveld[i].setBounds(x, y, 100, 20);               
            this.add(tekstveld[i]);
 }
   knop.addActionListener(new Actionlisteren());
	add(label2);
	  add(knop);
    }

class Actionlisteren implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		System.out.println(teller);
		
		naam[teller] = (tekstveld[teller].getText());
		teller ++;
		naam[teller] = "";	
		
    	int c = naam[teller].length();
	
			repaint();	
		
		
		
	}
}
public void paint(Graphics g) {
	
	
for(int i = 0; i < aantal.length; i ++) {


	g.drawString(""+naam[i],75 * i , 75);

}
}
}





