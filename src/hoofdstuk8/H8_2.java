package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class H8_2 extends Applet {
	
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String schermtekst;
    int mannen;
    int vrouwen;
    int volwassenmannen;
    int volwassenvrouwen;
   

    
    public void init() {
    	setSize(500,200);
        knop = new Button("Mannen");
        knop2 = new Button("vrouwen");
        knop4 = new Button("volwassenmannen");
        knop3 = new Button("volwassenvrouwen");
        KnopListener1 kl = new KnopListener1();
        knop.addActionListener(kl);
        
        Knopreset reset = new Knopreset(); 
        knop2.addActionListener(reset);
        
        Knopreset2 reset2 = new Knopreset2(); 
        knop3.addActionListener(reset2);
        
        Knopreset3 reset3 = new Knopreset3(); 
        knop4.addActionListener(reset3);
        
        mannen = 0;
        vrouwen = 0;
        volwassenvrouwen = 0;
        volwassenmannen = 0;
   
        schermtekst = "";

        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        schermtekst = new String("");
    
    }

    public void paint(Graphics g) {
    	  g.drawString("Aantal mannen Aanwezig"+mannen+"", 50, 60 );
    	  g.drawString("Aantal vrouwen Aanwezig"+vrouwen+"", 50, 80 );
    	  g.drawString("Aantal volwassen Vaders Aanwezig"+volwassenmannen+"", 50, 120 );
    	  g.drawString("Aantal volwassen Moeders Aanwezig"+volwassenvrouwen+"", 50, 100 );
    }
	
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	mannen++;
        	repaint();
        }
    }
        class Knopreset implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
            	vrouwen++;
            	repaint();
            }
    }
       class Knopreset2 implements ActionListener {
           public void actionPerformed( ActionEvent e ) {
           	volwassenvrouwen++;
            	repaint();
            }
        }
        class Knopreset3 implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
           	volwassenmannen++;
            	repaint();
            }
    }
}
   