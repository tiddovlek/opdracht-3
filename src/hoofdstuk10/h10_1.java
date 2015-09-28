package hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.applet.*;


public class h10_1 extends Applet {
	TextField tekstvak;
	String s;
	Label label;
	int getal = 0;
	int getal2 = 0;
	  int num = 0;
	  int res;
	  int num2 = 0;
	  int res2;
  public void init() {
	  tekstvak = new TextField("",10);
	  label = new Label("Type hier een getal in");
	    tekstvak.addActionListener( new KnopListener() );
	    add(label);
	  add(tekstvak);
	  

      s = "";
  }


  public void paint(Graphics g) {
    g.drawString("" + num + " is groter dan " + res , 50, 70 );
    g.drawString("" + res + " is kleiner dan " + num  , 50, 90);
  }
  class KnopListener implements ActionListener {

      public void actionPerformed( ActionEvent e ) {
    
    	  getal = Integer.parseInt(tekstvak.getText());
    
    	 res = getal;
    	if(getal > num)
    	
    	num = getal; 
    
    	if(num == res)
    	res = 0;
    	
  	  getal2 = (int) Double.parseDouble(tekstvak.getText());
  	  res2 = getal2;  
  	if(getal2 < num2)
  	num2 = getal2; 
  

          repaint();
      }
}}
  
