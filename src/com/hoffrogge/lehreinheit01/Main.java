package com.hoffrogge.lehreinheit01;

/*
 * Zeichenfläche mit einer Größe von 800 x 800 Pixeln
 * 
 *  0,0 ----------------------------------------- 800,0
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  0,800 --------------------------------------- 800,800
 */
public class Main {

    public static void main(String[] args) {

	/*
	 * =====================================================================
	 * 
	 * Dieses Zeichenbrett hat eine Laenge und Breite von 800.
	 *
	 * AUFGABE: Schaue dir die Beispiele an und zeichne selbst ein paar Linien.
	 * Schaffst du es, einen Tetrisspielstein zu zeichnen?
	 * =====================================================================
	 */

	Zeichenbrett zeichenbrett = new Zeichenbrett();

	/* vier Linien, die ein Rechteck ergeben */
	zeichenbrett.zeichneLinie(50, 750, 200, 750);
	zeichenbrett.zeichneLinie(200, 750, 200, 650);
	zeichenbrett.zeichneLinie(200, 650, 50, 650);
	zeichenbrett.zeichneLinie(50, 650, 50, 750);
    }
}