package com.hoffrogge.beispiele;

/**
 * Erläutert den Unterschied von Abfragen mit Bedingungen und Ausführen von Code
 * für If-Abfragen, While-Schleifen und Do-While-Schleifen.
 */
public class IfDoWhile {

    public static void main(String[] args) {

        int zaehler = 0;

        /*
         * Bedingung wird genau 1 mal geprüft und wenn sie wahr ist, der Code 1
         * mal ausgeführt.
         * 
         * Code wird 0 - 1 mal ausgeführt.
         */
        if (zaehler < 10) {

            System.out.println("If-Abfrage: " + zaehler);
            zaehler++;
        }

        /*
         * Bedingung wird zuerst geprüft, trifft sie zu, wird der Code
         * ausgeführt. Wird solange wiederholt, bis die Bedigung nicht mehr
         * zutrifft.
         * 
         * Code wird 0 - n mal ausgeführt.
         */
        while (zaehler < 10) {

            System.out.println("While-Schleife: " + zaehler);
            zaehler++;
        }

        /*
         * Zuerst wird der Code ausgeführt, dann wird die Bedingung geprüft und
         * wenn sie zutrifft, der Code wieder ausgeführt, die Bedingung wieder
         * geprüft usw.
         * 
         * Code wird 1 - n mal ausgeführt.
         */
        do {

            System.out.println("Do-While-Schleife: " + zaehler);
            zaehler++;

        } while (zaehler < 10);
    }
}