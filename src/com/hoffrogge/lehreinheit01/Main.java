package com.hoffrogge.lehreinheit01;

import com.hoffrogge.lehreinheit04.Dreieck;
import com.hoffrogge.lehreinheit04.GleichseitigesDreieck;
import com.hoffrogge.lehreinheit04.Zeichenbrett;

public class Main {

    public static void main(String[] args) {

        Zeichenbrett zeichenbrett = new Zeichenbrett();

        Dreieck dreieck = new Dreieck(200, 200);
        GleichseitigesDreieck gleichseitigesDreieck = new GleichseitigesDreieck(300, 300);

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