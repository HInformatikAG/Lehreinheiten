package com.hoffrogge.lehreinheit05;

import com.hoffrogge.lehreinheit03.Rechteck;

import junit.framework.TestCase;

public class RechteckTest extends TestCase {

	public void testDiagonale() {

		Rechteck rechteck = new Rechteck(1, 1);

		double diagonale = rechteck.berechneDiagonale();

		assertEquals(1.4142135623730951, diagonale);

		rechteck = new Rechteck(17, 4);

		diagonale = rechteck.berechneDiagonale();

		assertEquals(17.46424919657298, diagonale);

		rechteck = new Rechteck(13, 37);

		diagonale = rechteck.berechneDiagonale();

		assertEquals(39.21734310225516, diagonale);
	}

	public void testFlaeche() {

		/* Schreibe ein paar Tests fuer rechteck.berechneFlaeche() */
		fail("Dieser Test ist unvollständig.");
	}
}