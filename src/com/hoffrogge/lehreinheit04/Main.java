package com.hoffrogge.lehreinheit04;

import java.util.Random;

import com.hoffrogge.lehreinheit03.Farbe;

public class Main {

	public static void main(String[] args) {

		Zeichenbrett zeichenbrett = new Zeichenbrett();

		Quadrat rahmen = new Quadrat();
		rahmen.setLinienFarbe(new Farbe(255, 153, 0));
		rahmen.setMittelpunkt(400, 400);
		rahmen.setDurchmesser(800);

		zeichenbrett.fuegeZeichenbaresObjektHinzu(rahmen);

		for (int i = 1; i <= 400; i++) {

			Random r = new Random();

			Stern stern = new Stern();
			stern.setMittelpunkt(r.nextInt(i), r.nextInt(i));
			stern.setLinienFarbe(new Farbe(r.nextInt(i) % 255, r.nextInt(i) % 255, r.nextInt(i) % 255));
			stern.setDurchmesser(i);

			zeichenbrett.fuegeZeichenbaresObjektHinzu(stern);
		}

		Stern stern = new Stern();
		stern.setMittelpunkt(400, 400);
		stern.setLinienFarbe(new Farbe(99, 254, 18));
		stern.setDurchmesser(21);

		zeichenbrett.fuegeZeichenbaresObjektHinzu(stern);

		zeichenbrett.zeichneAlleZeichenbarenObjekte();
	}
}