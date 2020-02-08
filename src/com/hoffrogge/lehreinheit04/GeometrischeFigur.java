package com.hoffrogge.lehreinheit04;

import java.awt.Color;
import java.awt.Graphics;

public interface GeometrischeFigur {

    void setMittelpunkt(Punkt mittelpunkt);

    Punkt getMittelPunkt();

    void setDurchmesser(int d);

    Color getLinienFarbe();

    void setLinienFarbe(Color farbe);

    void zeichnen(Graphics graphics);
}