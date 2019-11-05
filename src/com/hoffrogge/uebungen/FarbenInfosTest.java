package com.hoffrogge.uebungen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

public class FarbenInfosTest {

    /* Rot testen */
    @Test
    public void testGetRotAnteilRot() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int rotAnteil = farbenInfosImpl.getRotAnteil(Farbe.ROT);

        assertEquals(255, rotAnteil);
    }

    @Test
    public void testGetGruenAnteilRot() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int gruenAnteil = farbenInfosImpl.getGruenAnteil(Farbe.ROT);

        assertEquals(0, gruenAnteil);
    }

    @Test
    public void testGetBlauAnteilRot() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int blauAnteil = farbenInfosImpl.getBlauAnteil(Farbe.ROT);

        assertEquals(0, blauAnteil);
    }

    /* Grün testen */
    @Test
    public void testGetRotAnteilGruen() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int rotAnteil = farbenInfosImpl.getRotAnteil(Farbe.GRUEN);

        assertEquals(0, rotAnteil);
    }

    @Test
    public void testGetGruenAnteilGruen() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int gruenAnteil = farbenInfosImpl.getGruenAnteil(Farbe.GRUEN);

        assertEquals(255, gruenAnteil);
    }

    @Test
    public void testGetBlauAnteilGruen() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int blauAnteil = farbenInfosImpl.getBlauAnteil(Farbe.GRUEN);

        assertEquals(0, blauAnteil);
    }

    /* Blau testen */
    @Test
    public void testGetRotAnteilBlau() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int rotAnteil = farbenInfosImpl.getRotAnteil(Farbe.BLAU);

        assertEquals(0, rotAnteil);
    }

    @Test
    public void testGetGruenAnteilBlau() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int gruenAnteil = farbenInfosImpl.getGruenAnteil(Farbe.BLAU);

        assertEquals(0, gruenAnteil);
    }

    @Test
    public void testGetBlauAnteilBlau() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int blauAnteil = farbenInfosImpl.getBlauAnteil(Farbe.BLAU);

        assertEquals(255, blauAnteil);
    }

    /* Schwarz testen */
    @Test
    public void testGetRotAnteilSchwarz() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int rotAnteil = farbenInfosImpl.getRotAnteil(Farbe.SCHWARZ);

        assertEquals(0, rotAnteil);
    }

    @Test
    public void testGetGruenAnteilSchwarz() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int gruenAnteil = farbenInfosImpl.getGruenAnteil(Farbe.SCHWARZ);

        assertEquals(0, gruenAnteil);
    }

    @Test
    public void testGetBlauAnteilSchwarz() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int blauAnteil = farbenInfosImpl.getBlauAnteil(Farbe.SCHWARZ);

        assertEquals(0, blauAnteil);
    }

    /* Weiß testen */
    @Test
    public void testGetRotAnteilWeiss() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int rotAnteil = farbenInfosImpl.getRotAnteil(Farbe.WEISS);

        assertEquals(255, rotAnteil);
    }

    @Test
    public void testGetGruenAnteilWeiss() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int gruenAnteil = farbenInfosImpl.getGruenAnteil(Farbe.WEISS);

        assertEquals(255, gruenAnteil);
    }

    @Test
    public void testGetBlauAnteilWeiss() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        int blauAnteil = farbenInfosImpl.getBlauAnteil(Farbe.WEISS);

        assertEquals(255, blauAnteil);
    }

    @Test
    public void testGetAlleFarben() {

        FarbenInfosImpl farbenInfosImpl = new FarbenInfosImpl();

        Collection<Farbe> alleFarben = farbenInfosImpl.getAlleFarben();

        assertNotNull(alleFarben);

        assertEquals(5, alleFarben.size());

        assertTrue(alleFarben.contains(Farbe.BLAU));
        assertTrue(alleFarben.contains(Farbe.GRUEN));
        assertTrue(alleFarben.contains(Farbe.ROT));
        assertTrue(alleFarben.contains(Farbe.SCHWARZ));
        assertTrue(alleFarben.contains(Farbe.WEISS));
    }
}