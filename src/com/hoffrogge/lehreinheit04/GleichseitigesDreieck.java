package com.hoffrogge.lehreinheit04;

import java.awt.Color;
import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

/*
 * Diese Klasse kann alles, was auch die Klasse Dreieck kann,
 * denn sie erbt von der Klasse Dreieck (Keyword extends). D. h.
 * sie kennt alle Methoden, die nicht private sind (dazu gehoert auch package private)
 * und alle Felder, die nicht private sind und alle Konstanten, die nicht private sind.
 * Da ein Dreieck eine GeometrischeFigur ist, ist auch ein
 * GleichseitigesDreieck eine GeometrischeFigur. 
 */
public class GleichseitigesDreieck extends Dreieck {

    /*
     * Ein Konstruktor, der seine Parameter einfach nur an seine Elternklasse
     * weiterreicht.
     */
    public GleichseitigesDreieck(int x, int y) {
        super(x, y);
    }

    /*
     * Hier wird die zeichnen-Methode der Elternklasse Dreieck ueberschrieben.
     * D. h., ein GleichseitigesDreieck verhaelt sich genau so, wie ein Dreieck,
     * mit Ausnahme der Zeichnung.
     */
    @Override
    public void zeichnen(Graphics graphics) {

        // lokale Variable, die nur in dieser Methode bekannt ist, sonst
        // nirgendwo
        int halbeKantenLaenge = KANTEN_LAENGE / 2;

        // getLinienFarbe() kommt aus der Klasse Dreieck
        Farbe linienFarbe = getLinienFarbe();
        Color linienColor = linienFarbe.konvertiereZuColor();
        graphics.setColor(linienColor);

        // getX() und getY() kommen aus Dreieck
        int x = getX();
        int y = getY();

        // Linie vom Mittelpunkt aus nach links
        graphics.drawLine(x, y, x - halbeKantenLaenge, y);

        // Linie vom Mittelpunkt aus nach rechts
        graphics.drawLine(x, y, x + halbeKantenLaenge, y);

        // die Methode berechneSpitzeDesDreiecksAlsPunkt() returned einen Punkt,
        // der weiter genutzt werden kann
        Punkt spitze = berechneSpitzeDesDreiecksAlsPunkt();

        // Linie von links zur Spitze
        graphics.drawLine(x - halbeKantenLaenge, y, spitze.getX(), spitze.getY());

        // Linie von rechts zur Spitze
        graphics.drawLine(x + halbeKantenLaenge, y, spitze.getX(), spitze.getY());

        /* damit das Dreieck noch schoener wird, wird es gefuellt */
        Farbe fuellFarbe = getFuellFarbe();
        graphics.setColor(fuellFarbe.konvertiereZuColor());

        // int[] ist ein Array mit allen X-Koordinaten
        int[] xPoints = { x - halbeKantenLaenge, x + halbeKantenLaenge, spitze.getX() };

        // int[] ist ein Array mit allen Y-Koordinaten
        int[] yPoints = { y, y, spitze.getY() };

        // Anzahl der Punkte fuer das Polygon
        int nPoints = 3;

        // ein gefuelltes Polygon zeichnen
        graphics.fillPolygon(xPoints, yPoints, nPoints);
    }

    /*
     * Eine private Methode, die nur in dieser Klasse genutzt werden kann. Diese
     * Methode returned ein Objekt vom Typ Punkt, d. h. die Stelle, die diese
     * Methode aufruft, bekommt dieses Punkt-Objekt und kann damit weiter
     * arbeiten.
     */
    private Punkt berechneSpitzeDesDreiecksAlsPunkt() {

        int x = getX();
        int y = getY();

        // eine Dezimalzahl
        double hoehe;

        // berechne Hoehe eines gleichseitigen Dreiecks: hoehe = Wurzel(3) / 2 *
        // Kantenlaenge
        hoehe = Math.sqrt(3) / 2 * KANTEN_LAENGE;

        // Nachkommestellen abschneiden, hier wird ein sogenannter Cast
        // durchgefuehrt, in diesem speziellen Fall werden dabei einfach die
        // Nachkommestellen abgeschnitten.
        int hoeheOhneNachkommeStellen = (int) hoehe;

        return new Punkt(x, y - hoeheOhneNachkommeStellen);
    }
}