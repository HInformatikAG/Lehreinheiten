package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public class Stern implements GeometrischeFigur {

	private int mittelpunktX;
	private int mittelpunktY;
	private int durchmesser;

	private Farbe farbe;

	@Override
	public void setMittelpunkt(int x, int y) {
		this.mittelpunktX = x;
		this.mittelpunktY = y;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		this.farbe = farbe;
	}

	@Override
	public void zeichnen(Graphics graphics) {

		graphics.setColor(farbe.konvertiereZuColor());

		int groesse = (int) (durchmesser / 0.5);
		int verschiebung = (int) (durchmesser / 1.5);

		int[] xPoints = { mittelpunktX, mittelpunktX - groesse, mittelpunktX + groesse };
		int[] yPoints = { mittelpunktY - groesse - verschiebung, mittelpunktY + groesse - verschiebung,
				mittelpunktY + groesse - verschiebung };
		int nPoints = 3;

		graphics.fillPolygon(xPoints, yPoints, nPoints);

		int[] xPoints2 = { mittelpunktX, mittelpunktX + groesse, mittelpunktX - groesse };
		int[] yPoints2 = { mittelpunktY + groesse + verschiebung, mittelpunktY - groesse + verschiebung,
				mittelpunktY - groesse + verschiebung };

		graphics.fillPolygon(xPoints2, yPoints2, nPoints);
	}

	@Override
	public void setDurchmesser(int durchmesser) {
		this.durchmesser = durchmesser;
	}
}
