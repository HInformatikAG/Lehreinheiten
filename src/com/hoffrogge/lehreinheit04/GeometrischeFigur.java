package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public interface GeometrischeFigur {

	void setMittelpunkt(int x, int y);

	void setLinienFarbe(Farbe farbe);

	void zeichnen(Graphics graphics);

}