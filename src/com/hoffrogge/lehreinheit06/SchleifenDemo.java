package com.hoffrogge.lehreinheit06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SchleifenDemo {

	/* Namen sind zufaellig generiert und haben keinen Bezug zu Teilnehmern */
	private static String namen[] = { "Monika", "Sophie", "Dieter", "Johanna", "Michelle", "Heike", "Simone", "Thomas",
			"Ralf", "Erik" };

	private static Set<Schueler> schueler;

	public static void main(String[] args) {

		schueler = new HashSet<>();

		Random r = new Random();

		for (int i = 0; i < 10; i++)
			schueler.add(new Schueler(namen[i], r.nextInt(10)));

		gebeSchuelerNamenAus();
		gebeSchuelerAnwesenheitsStundenAus();
		verteileNoten();
	}

	private static void gebeSchuelerNamenAus() {

		System.out.println("Teilnehmer");
		System.out.println();

		for (Schueler einSchueler : schueler)
			System.out.println(einSchueler.getName());

		System.out.println();
	}

	private static void gebeSchuelerAnwesenheitsStundenAus() {

		System.out.println("Anwesenheit der Teilnehmer:");
		System.out.println();

		for (Schueler einSchueler : schueler)
			System.out.println(
					einSchueler.getName() + " war " + einSchueler.getAnwesenheitsStunden() + " Stunden anwesend.");

		System.out.println();
	}

	private static void verteileNoten() {

		int note = 0;
		Random r = new Random();

		while (note != 6) {

			note = r.nextInt(6) + 1;

			System.out.println(namen[r.nextInt(10)] + " erhält die Note " + note);
		}
	}
}