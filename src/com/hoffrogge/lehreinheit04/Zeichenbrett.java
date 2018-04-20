package com.hoffrogge.lehreinheit04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Zeichenbrett extends JPanel {

	private transient BufferedImage bild;

	private List<GeometrischeFigur> zeichenbareObjekte;

	public Zeichenbrett() {

		setBorder(BorderFactory.createRaisedBevelBorder());

		bild = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics g2d = bild.getGraphics();
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, bild.getWidth(), bild.getHeight());

		g2d.dispose();

		zeichenbareObjekte = new ArrayList<>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(bild, 0, 0, this);

		zeichneAlleZeichenbarenObjekte();
	}

	public int getBreite() {
		return bild.getWidth();
	}

	public int getHoehe() {
		return bild.getHeight();
	}

	public void zeichneAlleZeichenbarenObjekte() {

		Graphics g2d = bild.getGraphics();

		for (GeometrischeFigur zeichenbaresObjekt : zeichenbareObjekte)
			zeichenbaresObjekt.zeichnen(g2d);

		g2d.dispose();
	}

	public void fuegeZeichenbaresObjektHinzu(GeometrischeFigur zeichenbaresObjekt) {
		zeichenbareObjekte.add(zeichenbaresObjekt);
	}

	public void entferneZeichenbaresObjekt(GeometrischeFigur zeichenbaresObjekt) {
		zeichenbareObjekte.remove(zeichenbaresObjekt);
	}
}