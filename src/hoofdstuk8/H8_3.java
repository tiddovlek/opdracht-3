package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Set;

import hoofdstuk8.H8_2.KnopListener1;

@SuppressWarnings({ "serial", "unused" })
public class H8_3 extends Applet {
    TextField tekstvak;
    Label label;				
    double getal;
	double btw;
    Button knop;
    Button knop2;
    double c;
    double d;
    
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        btw = 1.19;
        knop = new Button("Bereken BTW");
        knop2 = new Button("Reset");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        
        KnopListener2 kl2 = new KnopListener2();
        knop2.addActionListener(kl2);
        
        add(label);
        add(tekstvak);
        add(knop);
        add(knop2);
    

        
        
    }


	

    
    class KnopListener implements ActionListener {

        public void actionPerformed( ActionEvent e ) {
            getal = Double.parseDouble(tekstvak.getText());
            getal = (getal * btw);
            tekstvak.setText(String.format("%.2f", Double.valueOf(getal)));
            repaint();
        }
       
    }
    class KnopListener2 implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
                tekstvak.setText(String.format(""));

            repaint();
        }
   
    public void paint(Graphics g) {
        g.drawString("Prijs Inclusief BTW "+ (String.format("%.2f", Double.valueOf(getal)))  ,20, 70 );
    }
}
}
