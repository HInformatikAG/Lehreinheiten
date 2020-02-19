package com.hoffrogge.lehreinheit04;

import java.awt.Color;
import java.awt.Graphics;

public class Quadrat extends Rechteck implements GeometrischeFigur {

    private int mittelpunktX;
    private int mittelpunktY;
    private Color farbe = new Color(0, 0, 0);

    public Quadrat() {
    }

    public Quadrat(int kantenlaenge) {

	setBreite(kantenlaenge);
	setLaenge(kantenlaenge);

	System.out.println(berechneDiagonale());
    }

    @Override
    public void zeichnen(Graphics graphics) {

	graphics.setColor(farbe);

	int halbeKantenlaenge = getBreite() / 2;

	int linksObenX = mittelpunktX - halbeKantenlaenge;
	int linksObenY = mittelpunktY - halbeKantenlaenge;

	int rechtsObenX = mittelpunktX + halbeKantenlaenge;
	int rechtsObenY = mittelpunktY - halbeKantenlaenge;

	int rechtsUntenX = mittelpunktX + halbeKantenlaenge;
	int rechtsUntenY = mittelpunktY + halbeKantenlaenge;

	int linksUntenX = mittelpunktX - halbeKantenlaenge;
	int linksUntenY = mittelpunktY + halbeKantenlaenge;

	graphics.drawLine(linksObenX, linksObenY, rechtsObenX, rechtsObenY);
	graphics.drawLine(rechtsObenX, rechtsObenY, rechtsUntenX, rechtsUntenY);
	graphics.drawLine(rechtsUntenX, rechtsUntenY, linksUntenX, linksUntenY);
	graphics.drawLine(linksUntenX, linksUntenY, linksObenX, linksObenY);

    }

    @Override
    public void setMittelpunkt(Punkt mittelpunkt) {
	this.mittelpunktX = mittelpunkt.getX();
	this.mittelpunktY = mittelpunkt.getY();
    }

    @Override
    public void setLinienFarbe(Color farbe) {
	this.farbe = farbe;
    }

    @Override
    public Punkt getMittelPunkt() {
	return new Punkt(mittelpunktX, mittelpunktY);
    }

    @Override
    public Color getLinienFarbe() {
	return farbe;
    }

    @Override
    public void setDurchmesser(int durchmesser) {
	/* Durchmesser wird momentan nicht benoetigt */
    }
}