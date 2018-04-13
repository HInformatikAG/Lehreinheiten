package com.hoffrogge.lehreinheit03;

public class Rechteck {

	/* Eigenschaften der Klasse */

	private int breite;
	private int laenge;
	private Farbe farbe;

	/* Konstruktoren der Klasse */

	public Rechteck() {

		/* Standardkonstruktor */
		/*
		 * Die Eigenschaften von Rechteck, also breite, laenge und farbe werden nicht
		 * veraendert. Sie haben also die Werte 0, 0 und null.
		 */
	}

	public Rechteck(int breite, int laenge) {

		this.breite = breite;
		this.laenge = laenge;

		/*
		 * breite und laenge dieses Objekts werden auf die Werte der passenden Parameter
		 * gesetzt. farbe bleibt aber null
		 */
	}

	public Rechteck(Farbe farbe) {

		this.farbe = farbe;

		/*
		 * farbe wird auf den Wert des Parameters gesetzt, laenge und breite bleiben
		 * aber bei 0 und 0
		 */
	}

	public Rechteck(int breite, int laenge, Farbe farbe) {

		this.breite = breite;
		this.laenge = laenge;
		this.farbe = farbe;

		/*
		 * Alle drei Eigenschaften breite, laenge und farbe werden auf die Werte der
		 * Parameter gesetzt
		 */
	}

	/* Getter und Setter der Klasse */

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}

	/* Manipulierende Methoden der Klassen */

	public double berechneDiagonale() {

		/* a² + b² = c² */

		double diagonaleQuadrat = Math.pow(breite, 2) + Math.pow(laenge, 2);

		return Math.sqrt(diagonaleQuadrat);
	}

	public int berechneFlaeche() {
		return breite * laenge;
	}

	public void mischeFarbe() {
		/* diese Methode kann noch nichts tun */
	}
}