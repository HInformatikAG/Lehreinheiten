package com.hoffrogge.lehreinheit05;

import com.hoffrogge.lehreinheit03.Rechteck;

public class Quadrat extends Rechteck {

	public Quadrat(int kantenlaenge) {

		setBreite(kantenlaenge);
		setLaenge(kantenlaenge);

		System.out.println(berechneDiagonale());
	}
}