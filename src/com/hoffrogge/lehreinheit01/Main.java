package com.hoffrogge.lehreinheit01;

import java.awt.Color;

import com.hoffrogge.lehreinheit04.Dreieck;
import com.hoffrogge.lehreinheit04.GleichseitigesDreieck;

public class Main {

	public static void main(String[] args) {

	    

        /*
         * =====================================================================
         * Dieses Zeichenbrett hat eine Laenge und Breite von 800.
         *
         * AUFGABE: Schaue dir die Beispiele an und zeichne selbst ein paar
         * Linien. Schaffst du es, einen Tetrisspielstein zu zeichnen?
         * =====================================================================
         */
	
        /*
         * Zeichenflaeche mit einer Groesse von 800 x 800 Pixeln
         *
         *  x,y Koordinaten
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
         *
         */
        
        Zeichenbrett zeichenbrett = new Zeichenbrett();

		Dreieck dreieck = new Dreieck(200, 200);

		GleichseitigesDreieck gleichseitigesDreieck = new GleichseitigesDreieck(300, 300);
		gleichseitigesDreieck.setFuellFarbe(new Color(123, 123, 123));

		// zeichenbrett.fuegeZeichenbaresObjektHinzu(dreieck);
		// zeichenbrett.fuegeZeichenbaresObjektHinzu(gleichseitigesDreieck);

		zeichenbrett.zeichneAlleZeichenbarenObjekte();

		/* vier Linien, die ein Rechteck ergeben */
		// zeichenbrett.zeichneLinie(50, 750, 200, 750);
		// zeichenbrett.zeichneLinie(200, 750, 200, 650);
		// zeichenbrett.zeichneLinie(200, 650, 50, 650);
		// zeichenbrett.zeichneLinie(50, 650, 50, 750);

		for (int x = 0; x < 900; x += 10)
			for (int y = 0; y < 900; y += 10)
				for (int x2 = 0; x2 < 900; x2 += 10)
					for (int y2 = 0; y2 < 900; y2 += 100)
						zeichenbrett.zeichneLinie(x, y, x2, y2);
	}
}