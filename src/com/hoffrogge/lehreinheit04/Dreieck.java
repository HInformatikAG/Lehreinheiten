//Dies ist ein Kommentar
/*Dies ist auch ein Kommentar*/
/*
 * Dies ist ein mehrzeiliger
 * Kommentar.
 **/

/* Definition des Packages, in dem die Klasse sich befindet */
package com.hoffrogge.lehreinheit04;

import java.awt.Color;
/* Definition von Imports, d. h. von anderen Klassen, die hier in dieser Klasse benutzt werden. */
import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

/*
 * Definition der Klasse: public -> sie ist oeffentlich, also von ueberall aus nutzbar,
 * implements GeometrischeFigur -> sie implementiert alle Methoden, die von dem 
 * Interface GeometrischeFigur vorgegeben werden, dadurch kann sie an anderen Stellen im Programm
 * wie eine Instanz vom Typ GeometrischeFigur benutzt werden. Das hat den Vorteil, dass z. B.
 * ein Dreieck, ein Quadrat, ein Kreis, ein Trapez allesamt vom Typ GeometrischeFigur sein koennen
 * und der Rest des Programms nicht auf die Besonderheiten der einzelnen Implementierungen Acht
 * geben muss, sondern alle gleich behandeln kann.
 */
public class Dreieck implements GeometrischeFigur {

    /*
     * Definition von Variablen, sie sind als private markiert, d. h. sie
     * koennen nur in dieser Klasse genutzt werden. Werden auch Felder genannt.
     * Variablen koennen hier einen Standardwert bekommen, falls nicht, haben
     * sie per Definition einen Standardwert: 0 fuer primitive Zahlen, false
     * fuer boolean und null fuer Objekte.
     */
    private int                x;
    private int                y;
    private Farbe              fuellFarbe    = new Farbe(0, 255, 255);  //initial weiss
    private Farbe              linienFarbe   = new Farbe(0, 0, 0);      //initial schwarz

    /*
     * Besondere Form eines Feldes, dies ist keine Variable, sondern eine
     * Konstante. Sie gilt fuer alle Instanzen der Klasse gleich (Keyword
     * static) und sie kann nicht geandert werden (Keyword final). Sie kann in
     * dieser Klasse und in allen Kindern genutzt werden (Keyword protected).
     */
    protected static final int KANTEN_LAENGE = 100;

    /*
     * Ein Konstruktor, erkennbar daran, dass er genau so heisst, wie die
     * Klasse. Es kann mehrere Konstruktoren geben, solange sie unterschiedliche
     * Parameter haben.
     */
    public Dreieck() {
        // erstellt eine Instanz dieser Klasse, ohne Aenderungen an den
        // Feldern/Variablen vorzunehmen
    }

    /*
     * Ein zweiter Konstruktor mit anderen Parametern. Die Signatur dieses
     * Parameters ist also anders als die des ersten.
     * 
     * int x ist ein Parameter, d. h. beim Aufruf dieser Methode (denn auch
     * Konstruktoren sind Methoden) muessen zwei Parameter uebergeben werden,
     * die vom Typ int sind. Z. B. new GleichseitigesDreieck(100, 100);
     */
    public Dreieck(int x, int y) {

        /*
         * Hier werden die Parameter den Feldern der Klasse zugewiesen, somit
         * haben beide den gleichen Wert. Da die Parameter und die Felder den
         * gleichen Namen haben, werden die Felder mit this bezeichnet, damit
         * eindeutig ist, auf welche Variable Bezug genommen wird. (Parameter
         * sind auch nur Variablen).
         */
        this.x = x;
        this.y = y;
    }

    /*
     * Noch ein Konstruktor, der als Parameter eine Farbe uebergeben bekommt und
     * diese einem Feld zuordnet.
     */
    public Dreieck(Farbe fuellFarbe) {
        this.fuellFarbe = fuellFarbe;
    }

    /*
     * Methoden, die mit der Annotation @Override versehen sind, ueberschreiben
     * die Methode, die sie entweder aus einem Interface (wie GeometrischeFigur)
     * oder aus einer Elternklasse kennen (siehe Vererbung, das kommt noch).
     * Sind sie aus einem Interface, dann muessen sie ueberschrieben werden,
     * weil ein Interface die Methoden nur vorgibt, sie aber nicht selbst
     * implementiert. Bei einer vererbten Methode muss sie nicht unbedingt
     * ueberschrieben werden.
     * 
     * Methoden mit setVariable... nennt man auch Setter.
     */
    @Override
    public void setMittelpunkt(Punkt mittelpunkt) {
        this.x = mittelpunkt.getX();
        this.y = mittelpunkt.getY();
    }

    /*
     * Methoden mit getVariable... nennt man auch Getter.
     */
    @Override
    public Punkt getMittelPunkt() {
        return new Punkt(x, y);
    }

    @Override
    public void setDurchmesser(int d) {
        throw new UnsupportedOperationException("Dieses Dreieck braucht keinen Druchmesser");
    }

    @Override
    public Farbe getLinienFarbe() {
        return linienFarbe;
    }

    @Override
    public void setLinienFarbe(Farbe farbe) {
        this.linienFarbe = farbe;
    }

    /*
     * Diese Methode aus dem Interface GeometrischeFigur muss implementiert
     * werden, damit das GeometrischeFigur gezeichnet werden kann. Bleibt die
     * Methode leer, wird einfach nichts gezeichnet.
     */
    @Override
    public void zeichnen(Graphics graphics) {

        /*
         * Farbe ist eine eigene Implementierung, Java benoetigt zum Zeichnen
         * aber ein Objekt vom Typ Color. Zum Glueck hat die Klasse Farbe eine
         * Methode, die ein Objekt vom Typ Color erzeugt (mit der aktuellen
         * Farbe natuerlich).
         */
        Color linienFarbeAlsColor = linienFarbe.konvertiereZuColor();
        graphics.setColor(linienFarbeAlsColor);

        // vom Mittelpunkt nach rechts zeichnen
        graphics.drawLine(x, y, x, y + KANTEN_LAENGE);

        // vom Ende der vorherigen Linie nach oben zeichnen
        graphics.drawLine(x, y + KANTEN_LAENGE, x - KANTEN_LAENGE, y + KANTEN_LAENGE);

        // vom Ende der vorherigen Linie zum Anfang der ersten Linie zeichnen
        graphics.drawLine(x - KANTEN_LAENGE, y + KANTEN_LAENGE, x, y);
    }

    /*
     * Hier folgen Methoden, die nicht im Interface GeometrischeFigur definiert
     * sind. Der Rest des Programs kann diese Methoden nutzen, wenn er ein
     * Dreieck als Dreieck kennt (also eine Instanz/Variable vom Typ Dreieck
     * hat) und die Methoden public sind Wenn er das Dreieck aber nur als
     * GeometrischeFigur kennt, koennen diese Methoden dort nicht genutzt
     * werden.
     */

    /*
     * Ein Getter fuer die Farbe, die zum Fuellen verwendet wird.
     */
    public Farbe getFuellFarbe() {
        return fuellFarbe;
    }

    /*
     * Ein Setter fuer die Farbe, die zum Fuellen verwendet wird.
     */
    public void setFuellFarbe(Farbe fuellFarbe) {
        this.fuellFarbe = fuellFarbe;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}