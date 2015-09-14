package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



@SuppressWarnings("serial")
public class H8_1 extends Applet {
    Button knop;
    Button knop2;
    String schermtekst;
    TextField text1;
   

    
    public void init() {
    	setSize(500,200);
    	text1 = new TextField("",50);
        knop = new Button("ok");
        knop2 = new Button("reset");
        KnopListener1 kl = new KnopListener1();
        knop.addActionListener(kl);
        Knopreset reset = new Knopreset(); 
        knop2.addActionListener(reset);

   
        schermtekst = "";
        add(text1);
        add(knop);
        add(knop2);
        schermtekst = new String("");
    
    }

    public void paint(Graphics g) {
    	  g.drawString(schermtekst, 50, 60 );
    }
	
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	schermtekst = text1.getText();
        	repaint();
        }
    }
        class Knopreset implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
            	schermtekst = ("");
            	text1.setText("");
            	repaint();
            }
    }
    }