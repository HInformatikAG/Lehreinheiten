package com.hoffrogge.lehreinheit04;

import java.util.Date;

public class KeyWordsBeispiele {

	private Date wannWurdeDiesesObjektErzeugt;
	private static Date statischesDatum = new Date(0);

	/* Konstruktor */
	public KeyWordsBeispiele() {

		wannWurdeDiesesObjektErzeugt = new Date();
	}

	public Date getWannWurdeDiesesObjektErzeugt() {
		return wannWurdeDiesesObjektErzeugt;
	}

	public void wasMachtKeywordThis() {

		System.out.println("Wann wurde dieses Objekt erzeugt? " + this.getWannWurdeDiesesObjektErzeugt());

		KeyWordsBeispiele andereKeyWordsbeispiele = new KeyWordsBeispiele();
		System.out.println(
				"Wann wurde das andere Objekt erzeugt? " + andereKeyWordsbeispiele.getWannWurdeDiesesObjektErzeugt());

	}

	@SuppressWarnings("static-access")
    public static void wasMachtKeyWordStatic() {

		System.out.println("Das statische Datum dieses Objekts ist " + statischesDatum);

		KeyWordsBeispiele andereKeyWordsbeispiele = new KeyWordsBeispiele();
		System.out.println(
				"Ein anderes Objekt hat genau das selbe statische Datum: " + andereKeyWordsbeispiele.statischesDatum);
		System.out.println("Deswegen nutzt man als Zugriff auf diese Variable auch die statische Schreibweise: "
				+ KeyWordsBeispiele.statischesDatum);
	}

	@SuppressWarnings("unused")
    public void berechneSummeVoid(int a, int b) {

		/* hier wird etwas getan, aber nichts zurueckgegeben */
		int summe = a + b;
	}

	public int berechneSumme(int a, int b) {

		int summe = a + b;
		return summe;
	}
}