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
         * @formatter:off
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
         * @formater:on
         */
        
        Zeichenbrett zeichenbrett = new Zeichenbrett();

        Dreieck dreieck = new Dreieck(200, 200);

        GleichseitigesDreieck gleichseitigesDreieck = new GleichseitigesDreieck(300, 300);
        gleichseitigesDreieck.setFuellFarbe(new Color(123, 123, 123));

        zeichenbrett.fuegeZeichenbaresObjektHinzu(dreieck);
        zeichenbrett.fuegeZeichenbaresObjektHinzu(gleichseitigesDreieck);

        zeichenbrett.zeichneAlleZeichenbarenObjekte();

        /* vier Linien, die ein Rechteck ergeben */
        zeichenbrett.zeichneLinie(50, 750, 200, 750);
        zeichenbrett.zeichneLinie(200, 750, 200, 650);
        zeichenbrett.zeichneLinie(200, 650, 50, 650);
        zeichenbrett.zeichneLinie(50, 650, 50, 750);
    }
}