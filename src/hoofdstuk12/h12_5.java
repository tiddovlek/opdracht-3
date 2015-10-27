package hoofdstuk12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import java.applet.*;

public class h12_5 extends Applet {
    boolean gevonden;
    double[] salaris = { 100, 200, 500 , 400, 300 }; 
    double gezocht;
    TextField tekstvak;
	
    public void init() {
        gezocht = 0;
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new Actionlisteren());
        gevonden = false;
        int teller = 0;
        add(tekstvak);
        
        
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("index = "+gezocht , 20, 50);
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
	                break;
	            }
	            teller ++;
	        }
			
        	repaint();
			
		}
    
    }
    
    
}