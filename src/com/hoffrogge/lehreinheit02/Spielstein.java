//Dies ist ein Kommentar

/*Dies ist auch ein Kommentar*/

/*Dies ist die Package Deklaration. Diese Klasse befindet sich in diesem Package (so �hnlich wie ein Ordner)*/
package com.hoffrogge.lehreinheit02;

import java.awt.Color;

import com.hoffrogge.lehreinheit04.Punkt;

/*Die ist die Definition der Klasse, sie ist �ffentlich, sie ist eine Klasse und sie heisst "Spielstein"*/
public class Spielstein {

    /*
     * hier sind die Eigenschaften der Klasse, auch Attribute, Felder oder Variablen
     * genannt
     */

    /*
     * Hier wird eine Variable deklariert. Sie ist private, kann also nur in der
     * Klasse hier genutzt werden. Sie ist vom Typ "Color" (Gro�- / Kleinschreibung
     * beachten). Sie heisst "farbe" (Gro�- / Kleinschreibung beachten). Der Name
     * ist relativ egal, man k�nnte die Variable auch "schwarz", "gruen" oder
     * "peter" nennen. Peter ist aber kein guter Name f�r eine Farbe.
     */
    private Color farbe;

    /* noch mehr Variablen */
    private int x;
    private int y;

    /* Ein Konstruktor ohne Parameter */
    public Spielstein() {
	/*
	 * Konstruiert ein Objekt dieser Klasse. Dieses Objekt ist einzigartig. Selbst
	 * wenn es die gleichen Eigenschaften wie ein anderes Objekt hat, ist es
	 * trotzdem ein anderer Spielstein.
	 *
	 * Die Eigenschaften werden nicht gesetzt, sie behalten ihre Standardwerte.
	 *
	 * Dies ist ein Standardkonstruktor.
	 */
    }

    /*
     * Noch ein Konstruktor, mit einem Parameter vom Typ Farbe und mit Namen farbe
     * (beachte Gro�- / Kleinschreibung). Auch hier ist der Typ wichtig, der Name
     * kann aber ge�ndert werden.
     */
    public Spielstein(Color farbe) {

	/*
	 * Das neue Objekt der Klasse soll eine bestimmte Farbe haben. Die Farbe aus dem
	 * Parameter wird dem Objekt gesetzt.
	 *
	 * "this.farbe" ist die Farbe f�r das Objekt. farbe (ohne .this) ist die Farbe
	 * aus dem Parameter.
	 *
	 * Wenn Parameter und Eigenschaft gleich hei�en, kann man sie so unterscheiden.
	 */
	this.farbe = farbe;
    }

    /*
     * Ein Konstruktor mit zwei Parametern vom Typ "int" und Namen "x" und "y"
     */
    public Spielstein(int x, int y) {

	/* Das neue Objekt der Klasse soll bestimmte Werte f�r x und y haben. */
	this.x = x;
	this.y = y;
    }

    /* Ein Konstruktor mit allen drei Parametern */
    public Spielstein(Color farbe, int x, int y) {

	/* alle drei Werte merken */
	this.farbe = farbe;
	this.x = x;
	this.y = y;
    }

    /*
     * Eine Klasse kann beliebig viele Konstruktoren haben, solange keine zwei davon
     * gleich sind.
     */

    /*
     * Ein Getter f�r die Farbe. Die aktuelle Farbe des Spielsteins wird an den
     * Aufrufer gegeben.
     */
    public Color getFarbe() {

	System.out.println("Dieser Spielstein hat die Farbe " + farbe);

	return farbe;
    }

    /*
     * Ein Setter f�r die Farbe. Die neue Farbe des Spielsteins wird vom Aufrufer
     * vorgegeben.
     */
    public void setFarbe(Color farbe) {

	this.farbe = farbe;

	System.out.println("Der Spielstein hat jetzt die Farbe " + farbe);
    }

    /* Setter und Getter f�r x und y */
    public int getX() {

	System.out.println("x ist: " + x);

	return x;
    }

    public void setX(int x) {

	this.x = x;

	System.out.println("x ist jetzt: " + x);
    }

    public int getY() {

	System.out.println("y ist: " + y);

	return y;
    }

    public void setY(int y) {

	System.out.println("y ist jetzt: " + y);

	this.y = y;
    }

    public Punkt getPosition() {

	Punkt punkt = new Punkt(x, y);

	System.out.println("Dieser Spielstein befindet sich am Punkt " + punkt);

	return punkt;
    }
}