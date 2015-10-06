package toets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class WereldTijd extends Applet{
	
int London;
int newyork;
int sydney;
int tokio;
TextField tekstvak;
Button enter;
int wereldtijd;


public void init() {
wereldtijd = 12;
tekstvak = new TextField("",20);
enter = new Button("Enter");

enter.addActionListener(new tekstvakaction());
add(tekstvak);
add(enter);



}
public void paint(Graphics g) { 
	int x= 50;
	int y= 80;
	
	g.drawString("Tijd in New York:  "+newyork+":00 uur", x, y);
	y+=15;	
	g.drawString("Tijd in Sydney:  "+sydney+":00 uur", x, y);
	y+=15;
	g.drawString("Tijd in London:  "+London+":00 uur", x, y);
	y+=15;
	g.drawString("Tijd in Tokio:  "+tokio+":00 uur", x, y);
	y+=15;
}
class tekstvakaction implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
       	wereldtijd = Integer.parseInt(tekstvak.getText());
       	
       	newyork = wereldtijd - 4;
       	sydney = wereldtijd + 9;
       	London = wereldtijd - 1;
       	tokio = wereldtijd + 8;
       	if (newyork > 23) {
       		newyork -= 24;
       	}
       	if (London > 23) {
       		London -= 24;
       	}
       	if (sydney > 23) {
       		sydney -= 24;
       	}
       	if (tokio > 23) {
       		tokio -= 24;
       	}
       	repaint();
    }

}

}