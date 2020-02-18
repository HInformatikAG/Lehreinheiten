package com.hoffrogge.lehreinheit02;

/**
 * Beispiel fuer einen komplexen Datentyp, der einen Text und eine Zahl als
 * Variable hat.
 */
public class Wuerfel {

    /* eine Zahl von -2.147.483.648 bis 2.147.483.647 */
    private int anzahlSeiten;

    /* ein Text */
    private String beschreibung;

    /*
     * Jede Klasse hat einen Konstruktor. Wenn kein Konstruktor explizit definiert
     * ist, hat sie trotzdem implizit den Standardkonstruktor!
     */

    /*
     * Standardkonstruktor ohne Parameter. Dieser Konstruktor erstellt ein Objekt
     * dieser Klasse, ohne Variablen zu setzen.
     */
    public Wuerfel() {
	/*
	 * Variablen werden nicht gesetzt, d. h. sie haben folgende Werte:
	 *
	 * anzahlSeiten ist 0 (Standardwert fuer int)
	 *
	 * beschreibung ist null (Standardwert fuer String)
	 */
    }

    /*
     * Konstruktor mit einem Parameter, der die Zahl sofort einem bestimmten Wert
     * zuweist.
     */
    public Wuerfel(int anzahlSeiten) {
	/*
	 * der Wert von anzahlSeiten in diesem Objekt ("this.anzahlSeiten") wird auf den
	 * Wert des Parameters gesetzt ("anzahlSeiten" ohne this)
	 */
	this.anzahlSeiten = anzahlSeiten;

	/* beschreibung ist immer noch null */
    }

    /*
     * Konstruktor mit einem Parameter, der den Text sofort einem bestimmten Wert
     * zuweist.
     */
    public Wuerfel(String beschreibung) {
	this.beschreibung = beschreibung;

	/* anzahlSeiten ist hier noch 0 */
    }

    /* Konstruktor, der beide Variablen fuer das erstellte Objekt setzt */
    public Wuerfel(int anzahlSeiten, String beschreibung) {
	this.anzahlSeiten = anzahlSeiten;
	this.beschreibung = beschreibung;
    }

    /*
     * Getter und Setter werden verwendet, um die Variablen eines Objekts abzufragen
     * und zu aendern
     */
    public int getAnzahlSeiten() {
	return anzahlSeiten;
    }

    public void setAnzahlSeiten(int anzahlSeiten) {
	this.anzahlSeiten = anzahlSeiten;
    }

    public String getBeschreibung() {
	return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
	this.beschreibung = beschreibung;
    }
}