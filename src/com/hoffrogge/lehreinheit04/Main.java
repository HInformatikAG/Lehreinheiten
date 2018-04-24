package com.hoffrogge.lehreinheit04;

import com.hoffrogge.lehreinheit03.Farbe;

public class Main {

	public static void main(String[] args) {

		Zeichenbrett zeichenbrett = new Zeichenbrett();

		Quadrat rahmen = new Quadrat();
		rahmen.setLinienFarbe(new Farbe(255, 153, 0));
		rahmen.setMittelpunkt(400, 400);
		rahmen.setDurchmesser(798);

		zeichenbrett.fuegeZeichenbaresObjektHinzu(rahmen);

		zeichenbrett.zeichneAlleZeichenbarenObjekte();
	}
}