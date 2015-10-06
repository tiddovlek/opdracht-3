package toets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Toets2 extends Applet {
	
Label label;
Label labelfooi;
TextField tekstvak;
Button hoger;
Button lager; 
TextField tekstvakpercentage;
double percentage;
double Bedrag;

    public void init() {
    	setSize(300,150);
percentage = 15;
tekstvakpercentage = new TextField(+percentage+"",10);
tekstvak = new TextField("",20);  
label = new Label("Rekening Bedrag:");
labelfooi = new Label("percentage fooi:");

    lager = new Button("-");
    lager.addActionListener(new lageractionlisener());
   
    tekstvak.addActionListener(new tekstvakaction());
    
    hoger = new Button("+");
    hoger.addActionListener(new hogeractionlisener());

add(label);
add(tekstvak);
add(labelfooi);
add(tekstvakpercentage);
add(lager);
add(hoger);
    }
     
    
    public void paint(Graphics g) {  
    }
    
	
    class hogeractionlisener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	percentage = Double.parseDouble(tekstvakpercentage.getText());
        	percentage +=1;
         	tekstvakpercentage.setText(""+percentage);
        	repaint();
        }

    }
    class tekstvakaction implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	percentage = Double.parseDouble(tekstvakpercentage.getText());
        	Bedrag = Double.parseDouble(tekstvak.getText());
       Bedrag = (Bedrag * (percentage/100+1));
    	tekstvak.setText(""+(String.format("%.2f", Double.valueOf((Bedrag)))));
        	repaint();
        }

    }
    class lageractionlisener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	percentage = Double.parseDouble(tekstvakpercentage.getText());
        	percentage -=1;
         	tekstvakpercentage.setText(""+percentage);
        	repaint();
        }

    }
}

