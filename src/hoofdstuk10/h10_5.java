package hoofdstuk10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class h10_5 extends Applet {

	TextField tekstvak;
	Label lebel;
	double cijfer;	
	double gemiddelde;	
	double som;
	String s;	
	int aantal;
		
	  public void init() {
		  aantal = 0;
		  gemiddelde = 0.0;
		  cijfer = 0.0;
		  som = 0.0;
	tekstvak = new TextField("",15);
	lebel = new Label("Getal:");
	tekstvak.addActionListener(new tekstvakactionlistener());
	
	
	add(lebel);
	add(tekstvak);
		s = "";  
	  }
	  public void paint(Graphics g) {
		  int x;	
		  int y;
		  x= 50;
		  y= 80;
		    g.drawString("Behaalde cijfer"+cijfer+" "+s+"" , x, y );
		    y+= 20;
		    g.drawString("Gemiddelde cijfer"+gemiddelde+" "+s+"" , x, y );
	  }
	  class tekstvakactionlistener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			 cijfer = Double.parseDouble(tekstvak.getText());
			

			 som = (som + cijfer);
			 aantal++;
			 
			 
			 if(cijfer < 5.5) {
			 s = "Onvoldoende";
			 }
			 if(cijfer >= 5.5) {
			 s = "Voldoende";
			
			 }
			 if(gemiddelde < 5.5) {
				 s = "Onvoldoende";
				 }
				 if(gemiddelde >= 5.5) {
				 s = "Voldoende";
				
				 }
			
			gemiddelde = (som/aantal);
			 repaint();
		} 
		  
	  }
	  
	  
}
