package com.hoffrogge.lehreinheit04;

import java.awt.Color;

import com.hoffrogge.lehreinheit01.Zeichenbrett;

public class Main {

    public static void main(String[] args) {

	/*
	 * =====================================================================
	 * 
	 * Dieses Zeichenbrett hat eine Laenge und Breite von 800.
	 *
	 * AUFGABE: Schaue dir die Beispiele an und erstelle eine eigene Klasse, die
	 * gezeichnet werden kann.
	 * =====================================================================
	 */

	Zeichenbrett zeichenbrett = new Zeichenbrett();

	Dreieck dreieck = new Dreieck(200, 200);
	zeichenbrett.zeichneGeometrischeFigur(dreieck);

	GleichseitigesDreieck gleichseitigesDreieck = new GleichseitigesDreieck(300, 300);
	gleichseitigesDreieck.setFuellFarbe(new Color(123, 123, 123));
	zeichenbrett.zeichneGeometrischeFigur(gleichseitigesDreieck);

	Quadrat quadrat = new Quadrat(150);
	quadrat.setMittelpunkt(new Punkt(400, 500));

	zeichenbrett.zeichneGeometrischeFigur(quadrat);
    }
}