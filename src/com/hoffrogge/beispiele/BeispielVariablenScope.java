package com.hoffrogge.beispiele;

/**
 * Diese Klasse zeigt an Beispielen, wie der Scope von Variablen funktioniert.
 * <ul>
 * <li>Klassenvariablen</li>
 * <li>Objektvariablen/Instanzvariablen</li>
 * <li>lokale Variablen</li>
 * </ul>
 */
public class BeispielVariablenScope {

    /*
     * Klassenvariablen werden am Anfang der Klasse definiert, sie stehen
     * ausserhalb von Methoden, aber innerhalb der Klasse.
     * 
     * Klassenvariablen nutzen das Keyword "static".
     * 
     * Klassenvariablen sind in der ganzen Klasse nutzbar, jede Methode kann
     * darauf zugreifen.
     * 
     * Klassenvariablen sind fuer alle Objekte einer Klasse gleich.
     */
    private static int klassenVariable;

    /*
     * Objektvariablen/Instanzvariablen werden am Anfang der Klasse definiert,
     * sie stehen ausserhalb von Methoden, aber innerhalb der Klasse.
     * 
     * Objektvariablen sind in der ganzen Klasse nutzbar, jede Methode kann
     * darauf zugreifen.
     * 
     * Objektvariablen sind fuer jedes Objekt der Klasse verschieden (wichtiger
     * Unterschied zu Klassenvariablen).
     */
    private int        objektVariable;

    /* Konstruktor */
    public BeispielVariablenScope(int klassenVariable, int objektVariable) {

        /*
         * Auf Klassenvariablen wird mit der Punktnotation ueber die Klasse
         * zugegriffen. (Oder ueber setter und getter)
         */
        BeispielVariablenScope.klassenVariable = klassenVariable;

        /*
         * Auf Objektvariablen wird mit dem Keyword "this" und der Punktnotation
         * zugegriffen. (Oder ueber setter und getter)
         */
        this.objektVariable = objektVariable;
    }

    /*
     * Egal welches Objekt diese Methode aufruft, der Wert von klassenVariable
     * ist immer gleich!
     */
    public void printKlassenVariable() {
        System.out.println(klassenVariable);
    }

    /*
     * Der Wert von objektVariable kann fuer jedes Objekt unterschiedlich sein!
     */
    public void printObjektVariable() {
        System.out.println(objektVariable);
    }

    /* Gibt die Summer der klassenVariable und der objektVariable aus */
    public void printSumme() {

        /*
         * Dies ist eine lokale Variable.
         * 
         * Lokale Variablen koennen nur innerhalb der Methode benutzt werden, in
         * der sie definiert werden.
         */
        int lokaleSumme = klassenVariable + objektVariable;

        System.out.println("Summe: " + lokaleSumme);
    }

    public static void main(String[] args) {

        BeispielVariablenScope siebenElf = new BeispielVariablenScope(7, 11);
        System.out.print("siebenElf klassenVariable ");
        siebenElf.printKlassenVariable();
        System.out.print("siebenElf objektVvariable ");
        siebenElf.printObjektVariable();

        BeispielVariablenScope siebenSiebenElfElf = new BeispielVariablenScope(77, 1111);
        System.out.print("siebenSiebenElfElf klassenVariable ");
        siebenSiebenElfElf.printKlassenVariable();
        System.out.print("siebenSiebenElfElf objektVariable ");
        siebenSiebenElfElf.printObjektVariable();

        System.out.print("siebenElf klassenVariable ");
        siebenElf.printKlassenVariable();
        System.out.print("siebenElf objektVvariable ");
        siebenElf.printObjektVariable();
    }
}