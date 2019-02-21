package com.hoffrogge.lehreinheit01;

import com.hoffrogge.lehreinheit04.Zeichenbrett;

public class Main {

    public static void main(String[] args) {

        Zeichenbrett zeichenbrett = new Zeichenbrett();

        Zeichenflaeche rahmen = new Zeichenflaeche();

        zeichenbrett.fuegeZeichenbaresObjektHinzu(rahmen);

        zeichenbrett.zeichneAlleZeichenbarenObjekte();
    }
}