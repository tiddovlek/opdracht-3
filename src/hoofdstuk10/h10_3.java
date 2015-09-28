package hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


public class h10_3 extends Applet {
	TextField tekstvak;
	TextField tekstvak2;
	String s;
	Label label;
	Label label2;
	int dag;
	int day;
	int jaar; 
	Button knop;
  	boolean isSchrikkeljaar;
  	
  public void init() {
	  tekstvak = new TextField("",2);
	  tekstvak2 = new TextField("",8);
	  label = new Label("Maand getal:");
	  label2 = new Label("Jaar getal:");
	  knop = new Button ("Berekenen");
	    knop.addActionListener( new KnopListener() );
	    add(label);
	  add(tekstvak);
	  add(label2);
	  add(tekstvak2);
	  add(knop);
	  day = 0;
	  dag = 0;
      s = "";
      

  }


  public void paint(Graphics g) {
    g.drawString(" Maand "+s+" heeft "+dag+" dagen"  , 50, 70 );
  }
  class KnopListener implements ActionListener {

      public void actionPerformed( ActionEvent e ) {

   
   	  	
    	  day = Integer.parseInt(tekstvak.getText());
    	  jaar = Integer.parseInt(tekstvak2.getText());

        	  
         
    	  if (day == 12){
        	  s = "december";
        	  dag = 31;
        	  }
    	  if (day == 11){
        	  s = "november";
        	  dag = 30;
        	  }
    	  if (day == 10){
        	  s = "oktober";
        	  dag = 31;
        	  }
    	  if (day == 9){
        	  s = "september";
        	  dag = 30;
        	  }
    	  if (day == 8){
        	  s = "augustus";
        	  dag = 31;
        	  }
    	  if (day == 7){
        	  s = "juli";
        	  dag = 31;
        	  }
    	  if (day == 6){
        	  s = "juni";
        	  dag = 30;
        	  }
    	  if (day == 5){
        	  s = "mei";
        	  dag = 31;
        	  }
    	  if (day == 4){
        	  s = "april";
        	  dag = 30;
        	  }
    	  if (day == 3){
        	  s = "maart";
        	  dag = 31;
        	  }
  	   	  if (day == 2){
        	    s = "february";
      	   	  dag = 28;
    	   	  }
          if ((jaar % 4 == 0 && !(jaar % 100 == 0)) || 
            		jaar % 400 == 0 && day == 2) {
    	    s = "february";
  	   	  dag = 29;
    	  }

  	   	  
    	 

    	  if (day == 1){
    	  s = "january";
    	  dag = 31;
    	  }
    	  
    
   	

          repaint();
      }
}}
  
