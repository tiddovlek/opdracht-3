package hoofdstuk14;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

public class h14_2 extends Applet {

	double r;
	int kleur;
	int figuur;
	int kaartnummer;
	String kaardkleur;
	String kaardfiguur;
	private String[] kleurkaart = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Heer", "Vrouw", "Aas" };
	private String[] kleurfiguur = { "Klaver", "Schoppen", "Ruiten", "Harten" };
	private String[] speler4 = new String[13];
	private String[] speler1 = new String[13];
	private String[] speler2 = new String[13];
	private String[] speler3 = new String[13];
	private String[] deck = new String[52];

	public void init() {
		int index = 0;
		setSize(800, 500);
		

		
		for (int k = 0; k < kleurfiguur.length; k++) {

			for (int i = 0; i < kleurkaart.length; i++) {
				deck[index] = kleurfiguur[k] + " " + kleurkaart[i];
				index++;
			}
			
		}
		for (int i = 0; i < 13; i++) {
		speler1[i] = deelKaart();
		speler2[i] = deelKaart();
		speler3[i] = deelKaart();
		speler4[i] = deelKaart();
		}
		

	} 

	public void paint(Graphics g) {
			int x1 = 50;
			int x2 = 250;
			int x3 = 450;
			int x4 = 650;
			int y = 70;
			
			
		g.drawString("Speler 1", x1, y);
		g.drawString("Speler 2", x2, y);
		g.drawString("Speler 3", x3, y);
		g.drawString("Speler 4", x4, y);
		y = 100;
		for (int i = 0; i < 13; i++) {
			g.drawString(speler1[i], x1, y);
			g.drawString(speler2[i], x2, y);
			g.drawString(speler3[i], x3, y);
			g.drawString(speler4[i], x4, y);
			y = y + 20;
		}
		}
	

private String deelKaart() {
int random = new Random().nextInt(deck.length);
String kaart = deck[random];
String[] hulplijst = new String[deck.length -1];
int hulpindex = 0;

	for(int i = 0; i < deck.length; i++) {
		if(i != random) {
		hulplijst[hulpindex] = deck[i];	
		hulpindex++;
		}
	}
	deck = hulplijst;
		return kaart;
	
}

}
