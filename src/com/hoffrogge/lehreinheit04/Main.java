package com.hoffrogge.lehreinheit04;

import com.hoffrogge.lehreinheit03.Farbe;

public class Main {

	public static void main(String[] args) {

		Zeichenbrett zeichenbrett = new Zeichenbrett();

		Quadrat rotesQuadrat = new Quadrat();
		rotesQuadrat.setKantenLaenge(100);
		rotesQuadrat.setMittelpunkt(100, 100);
		rotesQuadrat.setLinienFarbe(new Farbe(255, 0, 0));

		zeichenbrett.fuegeZeichenbaresObjektHinzu(rotesQuadrat);

		Quadrat blauesQuadrat = new Quadrat();
		blauesQuadrat.setKantenLaenge(100);
		blauesQuadrat.setMittelpunkt(0, 0);
		blauesQuadrat.setLinienFarbe(new Farbe(0, 0, 255));

		zeichenbrett.fuegeZeichenbaresObjektHinzu(blauesQuadrat);

		zeichenbrett.zeichneAlleZeichenbarenObjekte();
	}
}