package com.hoffrogge.uebungen;

import java.util.ArrayList;

import com.hoffrogge.lehreinheit02.Wuerfel;;

public interface KlassenWeitergeben {
	
	public ArrayList<Wuerfel> instanceList = new ArrayList<Wuerfel>();
	
	/**
	 * Diese Methode sollte einen Würfel zu einer Liste von Rechtecksinstanzen hinzufügen.
	 */
	public void addToInstanceList(Wuerfel wuerfel);
	
	/**
	 * Diese Methode sollte einen Würfel mit einer Bezeichnung in der Liste finden und zurückgeben;
	 */
	public Wuerfel getDieByName();
	
	/**
	 * Diese Methode gibt ein Array mit den Ergebnissen aller Würfel zurück.
	 */
	public int[] rollAll();
}
