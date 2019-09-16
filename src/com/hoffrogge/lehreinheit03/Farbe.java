package com.hoffrogge.lehreinheit03;

import java.awt.Color;

public class Farbe {

    int rot;
    int gruen;
    int blau;

    public Farbe(int rot, int gruen, int blau) {
	this.rot = rot;
	this.gruen = gruen;
	this.blau = blau;
    }

    public int getRot() {
	return rot;
    }

    public void setRot(int rot) {
	this.rot = rot;
    }

    public int getGruen() {
	return gruen;
    }

    public void setGruen(int gruen) {
	this.gruen = gruen;
    }

    public int getBlau() {
	return blau;
    }

    public void setBlau(int blau) {
	this.blau = blau;
    }

    public Color konvertiereZuColor() {
	return new Color(rot, gruen, blau);
    }

    @Override
    public String toString() {
	return "RGB: " + rot + ":" + gruen + ":" + blau;
    }
}