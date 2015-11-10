package hoofdstuk14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.applet.*;
import java.net.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.omg.CORBA.portable.InputStream;

import hoofdstuk12.h12_3.Actionlisteren;

public class Praktijk extends Applet {

	Label label;
	TextField tekstvak;
	Button speelknop;
	Button resetknop;
	private Image afbeelding;
	private Image afbeeldingwinnen;
	private Image sadface;
	private Image evilsmiley;
	URL pad;
	int aantalsmileys = 23;
	int aantalverwijderen;
	int turn = 0;
	boolean pcwin;
	double random;
	int randomverwijderen;
	int berekening;
	boolean playerwon;
	int weg;
	int maxsmileys = 23;

	@SuppressWarnings("deprecation")
	public void init() {
		setSize(550, 450);
		label = new Label("Hoeveel smileys neem je?(een, twee of drie)?");
		tekstvak = new TextField("", 20);
		speelknop = new Button("Speel");
		resetknop = new Button("Opnieuw");
		speelknop.addActionListener(new Actionlistener());
		tekstvak.addActionListener(new Actionlistener());
		resetknop.addActionListener(new reset());

		// afbeelding
		try {
			afbeelding = ImageIO.read(getClass().getResourceAsStream("index.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			afbeeldingwinnen = ImageIO.read(getClass().getResourceAsStream("index2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			sadface = ImageIO.read(getClass().getResourceAsStream("sad_face.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			evilsmiley = ImageIO.read(getClass().getResourceAsStream("evil-smiley-face.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// end afbeeldingen

		// toevoegen

		add(resetknop);
		add(label);
		add(tekstvak);
		add(speelknop);

		// end toevoegen
		resetknop.hide();
	}

	@SuppressWarnings("deprecation")
	public void paint(Graphics g) {
		int y = 50;
		int x = 0;
		if (aantalsmileys == 23 && turn == 0) {
			g.drawString("Aantal Smileys: " + aantalsmileys + ". Het is jouw beurt", 33, 40);
		}
		if (aantalsmileys < 23) {
			g.drawString("Aantal Smileys: " + aantalsmileys + ".", 33, 40);
		}

		if (playerwon == true && aantalsmileys == 0) {
			g.drawString("you won!!", 150, 150);
			g.drawImage(sadface, 200, 50, 150, 150, this);
			aantalsmileys = 0;
			speelknop.setVisible(false);
			tekstvak.setVisible(false);
			label.setVisible(false);
			resetknop.show();
			setSize(550, 451);

		}
		if (playerwon == false && aantalsmileys == 0) {
			g.drawString("you lost!!", 150, 150);
			g.drawImage(evilsmiley, 200, 50, 150, 150, this);
			aantalsmileys = 0;
			speelknop.setVisible(false);
			tekstvak.setVisible(false);
			label.setVisible(false);
			resetknop.show();
			setSize(550, 451);
		}
		if (pcwin == false) {
			for (int i = 0; i < aantalsmileys; i++) {
				if (i != 0 && i % 10 == 0) {
					x = 0;
					y += 60 + 20;
				}
				g.drawImage(afbeelding, x, y, 60, 60, this);
				x += 55;
			}
		}
		if (pcwin == true) {
			for (int i = 0; i < aantalsmileys; i++) {
				if (i != 0 && i % 10 == 0) {
					x = 0;
					y += 60 + 20;
				}
				g.drawImage(afbeeldingwinnen, x, y, 50, 50, this);
				x += 55;
			}
		}

	}

	class Actionlistener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			aantalverwijderen = Integer.parseInt(tekstvak.getText());
			random = Math.random();
			berekening = (int) (random * 3 + 1);

			if (turn == 0) {
				if (aantalverwijderen == 1 || aantalverwijderen == 2 || aantalverwijderen == 3) {
					aantalsmileys -= aantalverwijderen;
					turn++;
				} else {
					aantalsmileys -= 0;
				}
			}
			if (turn == 1) {

				if (aantalsmileys > 21) {
					weg = maxsmileys - aantalsmileys;
					aantalsmileys = 21;
					pcwin = true;

				} else if (aantalsmileys == 21) {
					aantalsmileys -= berekening;
					weg = maxsmileys - aantalsmileys;
				} else if (aantalsmileys > 17) {
					weg = maxsmileys - aantalsmileys;
					aantalsmileys = 17;
					pcwin = true;
				} else if (aantalsmileys == 17) {
					aantalsmileys -= berekening;
					weg = maxsmileys - aantalsmileys;
				} else if (aantalsmileys > 13) {
					aantalsmileys = 13;
					pcwin = true;
				} else if (aantalsmileys == 13) {
					aantalsmileys -= berekening;
					weg = maxsmileys - aantalsmileys;
				} else if (aantalsmileys > 9) {
					aantalsmileys = 9;
					pcwin = true;
				} else if (aantalsmileys == 9) {
					aantalsmileys -= berekening;
				} else if (aantalsmileys > 5) {
					aantalsmileys = 5;
					pcwin = true;
				} else if (aantalsmileys == 5) {
					aantalsmileys -= berekening;
				} else if (aantalsmileys > 1) {
					aantalsmileys = 1;

					pcwin = true;
				} else if (aantalsmileys >= 1) {
					playerwon = true;

					aantalsmileys = 0;

				}
				turn = 0;
			}
			if (aantalsmileys < 0) {
				aantalsmileys = 0;
			}
			repaint();
		}
	}

	class reset implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			aantalsmileys = 23;
			playerwon = false;
			speelknop.setVisible(true);
			tekstvak.setVisible(true);
			label.setVisible(true);
			resetknop.setVisible(false);
			pcwin = false;
			repaint();
		}
	}
}
