package toets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class opdracht1 extends Applet {
 Button Fris;
 Button Bier;
 Button Wijn;
 Button Koffie;
 Button BinDist;
 Button BuitDist;
 Button VolgendeBestelling;
 Button Reset;
 double fris;
 double bier;
 double wijn;
 double koffie;
 double bindist;
 double buitdist;
 double Bestelling;
 double Dagomzet;
int gemiddelde;
double gemiddeld;

 
    public void init() {

    fris = 2.00;
    bier = 2.25;
    wijn = 2.50;
    koffie = 1.75;
    bindist = 2.75;
    buitdist = 3.50;
    Bestelling = 0.00;
    Dagomzet = 0.00;
    gemiddelde = 0;
    gemiddeld = 0.00;
   	
    Fris = new Button("Frisdrank");
    Fris.addActionListener(new Fris1());
    Bier = new Button("Bier");
    Bier.addActionListener(new Bier1());
    Wijn = new Button("Wijn");
    Wijn.addActionListener(new Wijn1());
    Koffie = new Button("Koffie");
    Koffie.addActionListener(new Koffie1());
    BinDist = new Button("BinDist");
    BinDist.addActionListener(new Bindist1());
    BuitDist = new Button("BuitDist");
    BuitDist.addActionListener(new Buitdist1());
    Reset = new Button("Volgende Bestelling");
    Reset.addActionListener(new reset());

    
    add(Fris);
    add(Bier);
    add(Wijn);
    add(Koffie);
    add(BinDist);
    add(BuitDist);
    add(Reset);
   
    }
     
    
    public void paint(Graphics g) {
    	int y;
    	int x;
    	y = 100;
    	x = 50;
    
    	  g.drawString("Totaal bedrag: $"+ (String.format("%.2f", Double.valueOf(Bestelling))), x, y );
    	  y += 20;
    	  
    	  g.drawString("Totale dag omzet: $"+(String.format("%.2f", Double.valueOf(Dagomzet))), x, y );
     	  y += 20;
    	  g.drawString("Gemiddelde per bestelling: $"+(String.format("%.2f", Double.valueOf((gemiddeld)))), x, y );
    	  
    }
    class Fris1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	
        	Bestelling = Bestelling + fris;
        	Dagomzet = Dagomzet + fris;
        	
        	repaint();
        
        }
    }
	
    class Bier1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	Bestelling = Bestelling + bier;
        	Dagomzet = Dagomzet + bier;
        	repaint();
        }
    }	
    class Wijn1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	Bestelling = Bestelling + wijn;
        	Dagomzet = Dagomzet + wijn;
        	repaint();
        }
    }
    class Koffie1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	Bestelling = Bestelling + koffie;
        	Dagomzet = Dagomzet + koffie;
        	repaint();
        }
    }
    class Bindist1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	Bestelling = Bestelling + bindist;
        	Dagomzet = Dagomzet + bindist;
        	repaint();
        }
    }
    class Buitdist1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	Bestelling = Bestelling + bindist;
        	Dagomzet = Dagomzet + bindist;
        	repaint();
        }
    }
    class reset implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	Bestelling = 0;
        	  gemiddelde ++;
        	  gemiddeld = (Dagomzet / gemiddelde);
        	repaint();
        	
        }
    }
}

