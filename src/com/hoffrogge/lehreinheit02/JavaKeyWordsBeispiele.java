package com.hoffrogge.lehreinheit02;

import java.util.Date;

public class JavaKeyWordsBeispiele {

    private static Date statischesDatum = new Date(0);
    private Date wannWurdeDiesesObjektErzeugt;

    /* Konstruktor */
    public JavaKeyWordsBeispiele() {
	wannWurdeDiesesObjektErzeugt = new Date();
    }

    public Date getWannWurdeDiesesObjektErzeugt() {
	return wannWurdeDiesesObjektErzeugt;
    }

    public void wasMachtKeywordThis() {

	System.out.println("Wann wurde dieses Objekt erzeugt? " + getWannWurdeDiesesObjektErzeugt());

	JavaKeyWordsBeispiele andereKeyWordsbeispiele = new JavaKeyWordsBeispiele();
	System.out.println(
		"Wann wurde das andere Objekt erzeugt? " + andereKeyWordsbeispiele.getWannWurdeDiesesObjektErzeugt());

    }

    @SuppressWarnings("static-access")
    public static void wasMachtKeyWordStatic() {

	System.out.println("Das statische Datum dieses Objekts ist " + statischesDatum);

	JavaKeyWordsBeispiele andereKeyWordsbeispiele = new JavaKeyWordsBeispiele();
	System.out.println(
		"Ein anderes Objekt hat genau das selbe statische Datum: " + andereKeyWordsbeispiele.statischesDatum);
	System.out.println("Deswegen nutzt man als Zugriff auf diese Variable auch die statische Schreibweise: "
		+ JavaKeyWordsBeispiele.statischesDatum);
    }

    @SuppressWarnings("unused")
    public void berechneSummeVoid(int a, int b) {

	/* hier wird etwas berechnet, aber nichts zurueckgegeben */
	int summe = a + b;
    }

    public int berechneSumme(int a, int b) {

	/* hier wird etwas berechnet und das Ergebnis zurueckgegeben */
	int summe = a + b;
	return summe;
    }
}