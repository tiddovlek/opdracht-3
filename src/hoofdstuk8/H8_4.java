  package hoofdstuk8;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import hoofdstuk8.H8_2.KnopListener1;


@SuppressWarnings({ "serial", "unused" })
public class H8_4 extends Applet {
	double getal;
	double getal2;
	TextField tekstvak;
	TextField tekstvak2;
	Button knop;
	Button knop1;
	Button knop2;
	Button knop3;
	
	
    public void init() {
    	
    tekstvak = new TextField("",10);
    tekstvak2 = new TextField("",10);
    knop = new Button("*");
    KnopListener1 kl = new KnopListener1();
    knop.addActionListener(kl);
    knop1 = new Button("/");
    KnopListener2 kl1 = new KnopListener2();
    knop1.addActionListener(kl1);
    knop2 = new Button("+");
    KnopListener3 kl3 = new KnopListener3();
    knop2.addActionListener(kl3);
    knop3 = new Button("-");
    KnopListener4 kl4 = new KnopListener4();
    knop3.addActionListener(kl4);
    add(tekstvak);
    add(tekstvak2);
    add(knop);
    add(knop1);
    add(knop2);
    add(knop3);
    }
    
    public void paint(Graphics g) {
    	   setSize(750,150);
    }
    
    
    
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());        
            getal = (getal*getal2);
            tekstvak.setText (Double.toString(getal));
            tekstvak2.setText(String.format(""));
          
        
      
            

        	repaint();
        }
        
    }




    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());        
            getal = (getal/getal2);
            tekstvak.setText (Double.toString(getal));
            tekstvak2.setText(String.format(""));

        	repaint();
        }
    }
    class KnopListener3 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());        
            getal = (getal+getal2);
            tekstvak.setText (Double.toString(getal));
            tekstvak2.setText(String.format(""));

        	repaint();
        }
    }
    class KnopListener4 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());        
            getal = (getal-getal2);
            tekstvak.setText (Double.toString(getal));
            tekstvak2.setText(String.format(""));

        	repaint();
        }
    }
}


