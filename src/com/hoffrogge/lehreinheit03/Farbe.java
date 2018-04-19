package com.hoffrogge.lehreinheit03;

import java.awt.Color;

public class Farbe {

	int rot;
	int gelb;
	int blau;

	public Farbe(int rot, int gelb, int blau) {
		this.rot = rot;
		this.gelb = gelb;
		this.blau = blau;
	}

	public int getRot() {
		return rot;
	}

	public void setRot(int rot) {
		this.rot = rot;
	}

	public int getGelb() {
		return gelb;
	}

	public void setGelb(int gelb) {
		this.gelb = gelb;
	}

	public int getBlau() {
		return blau;
	}

	public void setBlau(int blau) {
		this.blau = blau;
	}

	public Color konvertiereZuColor() {
		return new Color(rot, gelb, blau);
	}
}