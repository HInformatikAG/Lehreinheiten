package com.hoffrogge.uebungen;

import com.hoffrogge.lehreinheit02.Wuerfel;;

public interface KlassenWeitergeben {
	
	/**
	 * Diese Methode sollte einen Würfel zu einer Liste von Würfelinstanzen hinzufügen.
	 */
	public void fuegeZuInstanzenListeHinzu(Wuerfel wuerfel);
	
	/**
	 * Diese Methode sollte einen Würfel mit einer Bezeichnung in der Liste finden und zurückgeben;
	 */
	public Wuerfel getWuerfelByBezeichnung(String bezeichnung);
	
	/**
	 * Diese Methode gibt ein Array mit den Ergebnissen aller Würfel zurück.
	 */
	public int[] alleWuerfeln();
}
