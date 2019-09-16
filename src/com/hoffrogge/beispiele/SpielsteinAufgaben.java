package com.hoffrogge.beispiele;

import com.hoffrogge.lehreinheit03.Farbe;

public class SpielsteinAufgaben {

    public static void main(String[] args) {

	/* 1. Erstelle einen Spielstein und weise ihn einer Variable zu */
	Spielstein einSpielstein = new Spielstein();

	/* 2. Welche Farbe hat der Spielstein? */
	einSpielstein.getFarbe();

	/* 3. Welches x hat dieser Spielstein? */
	int x = einSpielstein.getX();

	/* 4. Welches y hat dieser Spielstein? */
	einSpielstein.getY();

	/* 5. An welchem Punkt ist dieser Spielstein? */
	einSpielstein.getPosition();

	/* 6. Erstelle ein Objekt von Farbe und weise es einer Variablen zu */
	Farbe farbe2 = new Farbe(12, 34, 99);

	/* 7. Setze dem Spielstein eine Farbe! */
	einSpielstein.setFarbe(farbe2);

	/* 8. Setze dem Spielstein eine andere x-Koordinate! */
	einSpielstein.setX(22);

	/* 9. Erstelle ein Objekt von einem Spielstein mit x = 5 und y = 10 */
	Spielstein spielstein = new Spielstein(5, 10);

	/* 10. An welchem Punkt ist dieser Spielstein? */
	spielstein.getPosition();

	/* 11. Welche Farbe hat das neue Objekt? */
	spielstein.getFarbe();

	/* 12. Erstelle ein neues Objekt von Spielstein mit dieser Farbe */
	Spielstein spielstein2 = new Spielstein(farbe2);

	/* 13. Welche Farbe hat der Spielstein? */
	spielstein2.getFarbe();

	/* 14. Welches x hat dieser Spielstein? */
	spielstein2.getX();

	/* 15. Welches y hat dieser Spielstein? */
	spielstein2.getY();

	/*
	 * 16. Erstelle noch ein Objekt von Spielstein mit anderen Werten für die Farbe,
	 * x und y! (Vergiss nicht, das Objekt einer Variablen zuzuweisen.)
	 */

	/* 17. Welchen x-Wert hat das Objekt? */

	/* 18. Welchen x-Wert hat das allererste Objekt? */

	/* 19. Ändere den x-Wert vom allerersten Objekt! */

	/* 20. Welchen x-Wert hat das letzte Objekt? */
    }
}