package com.hoffrogge.lehreinheit02;

import java.util.ArrayList;
import java.util.List;

import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Quadrat;

/**
 * Hier werden ein paar gängige Java Keywords vorgestellt.
 *
 * Bei einem Keyword handelt es sich um einen Ausdruck, den Java für eine
 * Funktionalität reserviert hat. Ein Keyword kann nicht als Variable oder
 * Methode oder Klasse genutzt werden.
 */
public class JavaKeyWords {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

	// Deklaration von Variablen
	int zahlA;

	// Zuweisung eines Wertes zu einer Variablen:
	zahlA = 7;

	// Deklaration und Zuweisung in einem Schritt
	int zahlB = 11;

	// boolsche Abfrage, etwas ist wahr oder falsch
	if (1 < 2)
	    System.out.println("1 ist kleiner als 2");

	if (zahlA < zahlB)
	    System.out.println(zahlA + "ist kleiner als " + zahlB);

	String test = null;

	if (test == null)
	    System.out.println("Der String 'test' ist null");

	test = "test";

	if (test == null)
	    System.out.println("Der String 'test' ist null");
	else
	    System.out.println("Der String 'test' ist nicht null");

	/*
	 * Es lässt sich alles abfragen, was zu wahr oder falsch ausgewertet werden
	 * kann: <, >, <=, >=, ==, != oder auch Methoden auf Objekten, zB
	 * liste.isEmpty()
	 */

	List<GeometrischeFigur> liste = new ArrayList<>();

	if (liste.isEmpty())
	    System.out.println("Die Liste ist leer");

	liste.add(new Quadrat());

	/* Man kann über alle Elemente einer Liste drüber gehen: */
	for (GeometrischeFigur figur : liste)
	    System.out.println("In der Liste gibt es die Figur: " + figur);

	/* In einer Liste kann man ein bestimmtes Element nutzen: */
	System.out.println(liste.get(0));

	/*
	 * Das funktioniert aber nicht, wenn nicht genug Elemente da sind: folgender
	 * Aufruf wirft einen Fehler
	 */
	System.out.println(liste.get(28));
    }
}