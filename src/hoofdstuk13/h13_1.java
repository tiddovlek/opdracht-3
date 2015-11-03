package hoofdstuk13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h13_1 extends Applet {
	private Button[] knoppen = new Button[5];
	private Color[] kleuren = { Color.green, Color.red, Color.yellow, Color.magenta, Color.cyan, };
	private String[] kleurLabels = { "Groen", "Rood", "Geel", "Magenta", "Cyaan" };

	private String kleurTekst = "";

	public void init() {
		setSize(350, 150);
		for (int i = 0; i < knoppen.length; i++) {
			knoppen[i] = new Button();
			knoppen[i].setBackground(kleuren[i]);
			knoppen[i].setLabel(kleurLabels[i]);
			knoppen[i].addActionListener(new knoplistener());
			add(knoppen[i]);
		}

	}

	public void paint(Graphics g) {

		g.drawString(kleurTekst, 150, 75);
	}

	class knoplistener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Button knop = (Button) e.getSource();
			kleurTekst = knop.getLabel();

			repaint();

		}
	}
}