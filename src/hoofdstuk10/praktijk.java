package hoofdstuk10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class praktijk extends Applet {

	TextField tekstvak;
	Label lebel;
	double cijfer;	
	int cijfercase;
	double gemiddelde;	
	double som;
	String s;	
	String sgemiddelde;
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
		sgemiddelde = "";
	  }
	  public void paint(Graphics g) {
		  int x;	
		  int y;
		  x= 50;
		  y= 80;
		    g.drawString("Behaalde cijfer"+cijfer+""+s , x, y );
		    y+= 20;
		    g.drawString("Gemiddelde cijfer"+gemiddelde+""+sgemiddelde  , x, y );
	  }
	  class tekstvakactionlistener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
		
			 cijfer = Double.parseDouble(tekstvak.getText());
		
			 if(cijfer >= 11){
				 tekstvak.setText(String.format("wrong number"));

			 }
			if(cijfer <= 10) {
			
				 som = (som + cijfer);
				 aantal++;
				 gemiddelde = (som/aantal);
				 
	            switch(cijfercase) {
	            
                case 1:
				 cijfer = 1;
					gemiddelde+= 1;
				 break;
				 
                case 2:
				 s = "Slecht";
				 cijfer = 2;

				gemiddelde+= 2;

				 break;
				 
                case 3:
				 s = "Slecht";
				 cijfer = 3;

					gemiddelde+= 3;
			
				 break;
				 
                case 4:
				 s = "Onvoldoende";
				 cijfer = 4;

				 gemiddelde+= 4;

				 break;
                case 5:
				 s = "Matig";
				 cijfer = 5;

				 gemiddelde+= 5;

				 break;
				 
                case 6:
				 s = "Voldoende";
				 cijfer = 6;

				 gemiddelde+= 6;

				 break;
				 
                case 7:
				 s = "Voldoende";
				 cijfer = 7;

				 gemiddelde+= 7;

				 break;
				 
                case 8:
				 s = "Goed";
				 cijfer = 8;

				 gemiddelde+= 8;

				 break;

                case 9:
				 s = "Goed";
				 cijfer = 9;

				 gemiddelde+= 9;

				 break;
				 
                case 10:
				 s = "Goed";
				 cijfer = 10;

				 gemiddelde+= 10;

				 break;
	            }
	       	 gemiddelde = (som/aantal);
				if (cijfer == 1){
				s = "slecht";
				}
				if (cijfer == 2){
				s = "slecht";
				}
				if (cijfer == 3){
				s = "slecht";
				}
				if (cijfer == 4){
				s = "onvoldoende";
				}
				if (cijfer == 5){
				s = "matig";
				}
				if (cijfer == 6){
				s = "voldoende";
				}
				if (cijfer == 7){
				s = "voldoende";
				}
				if (cijfer == 8){
				s = "goed";
				}
				if (cijfer == 9){
				s = "goed";
				}
				if (cijfer == 10){
				s = "goed";
				}
				if (gemiddelde == 1){
				sgemiddelde = "slecht";
				}
				if (gemiddelde == 2){
				sgemiddelde = "slecht";
				}
				if (gemiddelde == 3){
				sgemiddelde = "slecht";
				}
				if (gemiddelde == 4){
				sgemiddelde = "onvoldoende";
				}
				if (gemiddelde == 5){
				sgemiddelde = "matig";
				}
				if (gemiddelde == 6){
				sgemiddelde = "voldoende";
				}
				if (gemiddelde == 7){
				sgemiddelde = "voldoende";
				}
				if (gemiddelde == 8){
				sgemiddelde = "goed";
				}
				if (gemiddelde == 9){
				sgemiddelde = "goed";
				}
				if (gemiddelde == 10){
				sgemiddelde = "goed";
				}
			repaint();
	            }
			}
		}
	  }
