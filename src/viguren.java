import java.awt.*;
import java.applet.*;



public class viguren extends Applet {

	   //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    
	private static final long serialVersionUID = -6513971802368604190L;


public void init() {
    setBackground(Color.green);
    opvulkleur = Color.MAGENTA;
    lijnkleur = Color.BLACK;
    breedte = 250;
    hoogte = 150;
  }

  
public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);
    g.drawString("Lijn", 120, 30 );
    g.drawString("Rechthoek", 110, 220 );
    
    g.drawString("Gevulde rechthoek met ovaal", 300, 220 );
    g.drawString("Taartpunt met ovaal eromheen", 620, 220 );
    
    g.drawString("Afgeronde rechthoek", 100, 420 );
    
    g.drawString("Gevulde ovaal", 350, 420 );
    g.drawString("Cirkel", 620, 450 );
    
    
    
    
    g.drawOval(280, 50, breedte, hoogte);
	    g.setColor(Color.black);
	    g.drawRect(1, 10, breedte, 1);
	    g.drawRect(1, 50, breedte, hoogte);
	    g.setColor(opvulkleur);
	    g.fillRect(280, 50, breedte, hoogte);
	    g.setColor(lijnkleur);
	    g.drawOval(280, 50, breedte, hoogte);
	    g.drawOval(580, 50, breedte, hoogte);
	    g.setColor(opvulkleur);
	    g.fillArc(580, 50, breedte, hoogte, 360, 45);
	    g.setColor(lijnkleur);
	    g.drawOval(580, breedte, hoogte, 150); // as long as WIDTH and HEIGHT are equal the oval should look like a circle
	    g.drawRoundRect(1, breedte, breedte, hoogte, 50, 50);
	    g.setColor(opvulkleur);
	    g.fillOval(280, 250, breedte, hoogte);
	    
  }
 
}