package com.hoffrogge.uebungen;

import com.hoffrogge.lehreinheit02.Wuerfel;;

public interface KlassenWeitergeben {
	
	/**
	 * Diese Methode sollte einen W�rfel zu einer Liste von W�rfelinstanzen hinzuf�gen.
	 */
	public void fuegeZuInstanzenListeHinzu(Wuerfel wuerfel);
	
	/**
	 * Diese Methode sollte einen W�rfel mit einer Bezeichnung in der Liste finden und zur�ckgeben;
	 */
	public Wuerfel getWuerfelByBezeichnung(String bezeichnung);
	
	/**
	 * Diese Methode gibt ein Array mit den Ergebnissen aller W�rfel zur�ck.
	 */
	public int[] alleWuerfeln();
}
