package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public interface GeometrischeFigur {

    void setMittelpunkt(Punkt mittelpunkt);

    Punkt getMittelPunkt();

    void setDurchmesser(int d);

    Farbe getLinienFarbe();

    void setLinienFarbe(Farbe farbe);

    void zeichnen(Graphics graphics);
}