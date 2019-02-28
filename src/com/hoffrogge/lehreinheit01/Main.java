package com.hoffrogge.lehreinheit01;

import com.hoffrogge.lehreinheit04.Zeichenbrett;

public class Main {

    public static void main(String[] args) {

        Zeichenbrett zeichenbrett = new Zeichenbrett();

        Zeichenflaeche zeichenFlaeche = new Zeichenflaeche();

        zeichenbrett.fuegeZeichenbaresObjektHinzu(zeichenFlaeche);

        zeichenbrett.zeichneAlleZeichenbarenObjekte();
    }
}