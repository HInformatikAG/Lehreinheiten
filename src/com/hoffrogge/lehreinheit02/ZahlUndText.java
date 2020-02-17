package com.hoffrogge.lehreinheit02;

/**
 * Beispiel fuer einen komplexen Datentyp, der einen Text und eine Zahl als
 * Variable hat.
 */
public class ZahlUndText {

    /* eine Zahl von -2.147.483.648 bis 2.147.483.647 */
    private int eineZahl;

    /* ein Text */
    private String einText;

    /*
     * Jede Klasse hat einen Konstruktor. Wenn kein Konstruktor explizit definiert
     * ist, hat sie trotzdem implizit den Standardkonstruktor!
     */

    /*
     * Standardkonstruktor ohne Parameter. Dieser Konstruktor erstellt ein Objekt
     * dieser Klasse, ohne Variablen zu setzen.
     */
    public ZahlUndText() {
	/*
	 * Variablen werden nicht gesetzt, d. h. sie haben folgende Werte:
	 * 
	 * einZahl ist 0 (Standardwert fuer int)
	 * 
	 * einText ist null (Standardwert fuer String)
	 */
    }

    /*
     * Konstruktor mit einem Parameter, der die Zahl sofort einem bestimmten Wert
     * zuweist.
     */
    public ZahlUndText(int eineZahl) {
	/*
	 * der Wert von eineZahl in diesem Objekt ("this.eineZahl") wird auf den Wert
	 * des Parameters gesetzt ("eineZahl" ohne this)
	 */
	this.setEineZahl(eineZahl);

	/* einText ist immer noch null */
    }

    /*
     * Konstruktor mit einem Parameter, der den Text sofort einem bestimmten Wert
     * zuweist.
     */
    public ZahlUndText(String einText) {
	this.setEinText(einText);

	/* einZahl ist hier noch 0 */
    }

    /* Konstruktor, der beide Variablen fuer das erstellte Objekt setzt */
    public ZahlUndText(int eineZahl, String einText) {
	this.setEineZahl(eineZahl);
	this.setEinText(einText);
    }

    /*
     * Getter und Setter werden verwendet, um die Variablen eines Objekts abzufragen
     * und zu ändern
     */
    public int getEineZahl() {
	return eineZahl;
    }

    public void setEineZahl(int eineZahl) {
	this.eineZahl = eineZahl;
    }

    public String getEinText() {
	return einText;
    }

    public void setEinText(String einText) {
	this.einText = einText;
    }
}