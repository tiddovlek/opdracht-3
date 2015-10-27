package hoofdstuk12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import java.applet.*;

public class h12_6 extends Applet {
    boolean gevonden;
 double[] salaris = {34, 200, 500 , 400, 300, 200, 100 , 500, 300 }; 
 double gezocht;
 int count;
    int teller;
    TextField tekstvak;
	double[] lastitem;
    public void init() {
        gezocht = 0;
        teller = 0;
        count = 0;
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new Actionlisteren());
        gevonden = false;
        int teller = 0;
        add(tekstvak);
  
       
        
    }


	public void paint(Graphics g) {

        if(gevonden == true) {
        	
            g.drawString("index = "+gezocht + " aantal keer gevonden " +count , 20, 50);
            count = 0;   
        }
        else {
            g.drawString("Deze waarde bestaat niet.", 20, 50);
        }
        
    }
	
	
    
    class Actionlisteren implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			gezocht = Double.parseDouble(tekstvak.getText());
         	
	        int teller = 0;
	        gevonden = false;
	        
	    
	        
			while(teller < salaris.length) {

	            if(salaris[teller] == gezocht) {
	                gevonden = true;
	                System.out.println(salaris[teller]);
	               count = count+1;
	               System.out.println(count);
	            }
	   
	            teller ++;
	          
	       
			}

        	repaint();
			
		}
    
    }
    
    
}
