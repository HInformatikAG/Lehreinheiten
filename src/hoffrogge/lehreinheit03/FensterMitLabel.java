package hoffrogge.lehreinheit03;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*Hier stellen wir ein Label (Text, der nur angezeigt, aber nicht veraendert werden kann) dar.*/
public class FensterMitLabel {

	public FensterMitLabel() {
		/* Einfacher Konstruktor */
	}

	private void maleFenster() {

		/* Dies ist das Fenster */
		JFrame fenster = new JFrame();

		/* Dies ist das Label */
		JLabel label = new JLabel();

		/* so wird Text auf das Label gesetzt */
		label.setText("    Hallo ;)");

		/* hier wird das Label dem Fenster hinzugefuegt */
		fenster.add(label);

		/*
		 * Das Fenster wird automatisch mit den Standardbuttons
		 * Minimieren/Maximieren/Schliessen ausgestattet, man kann festlegen, was
		 * passieren soll, wenn einer dieser Buttons geklickt wird.
		 */
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* Hier wird die Groesse des Fensters gesetzt */
		fenster.setSize(new Dimension(150, 100));

		/*
		 * Standardmaessig ist ein neues Fenster unsichtbar, man muss es sichtbar
		 * setzen.
		 */
		fenster.setVisible(true);
	}

	public static void main(String[] args) {

		FensterMitLabel fensterMitLabel = new FensterMitLabel();
		fensterMitLabel.maleFenster();
	}
}