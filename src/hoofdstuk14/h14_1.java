package hoofdstuk14;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

public class h14_1 extends Applet {

	double r;
	String kaart;
	String nummer;
	
	String kaardkleur;
	String kaardfiguur;
	private String[] kleurkaart = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Heer", "Vrouw", "Aas" };
	private String[] kleurfiguur = { "Klaver", "Schoppen", "Ruiten", "Harten" };


	public void init() {
		kaartfiguur();
		kaartnummer();

	} 

	public void paint(Graphics g) {
g.drawString("je hebt " +kaart+ " "+nummer, 50, 50);
		}
	


void kaartfiguur() {
	int random = new Random().nextInt(kleurfiguur.length);
	kaart = kleurfiguur[random];
	
}

void kaartnummer() {
	int randomkleur = new Random().nextInt(kleurkaart.length);
	nummer = kleurkaart[randomkleur];
	

}
}
