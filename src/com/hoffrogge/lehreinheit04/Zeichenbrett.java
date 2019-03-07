package com.hoffrogge.lehreinheit04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Zeichenbrett extends JPanel {

    private transient BufferedImage           bild;

    private transient List<GeometrischeFigur> zeichenbareObjekte;

    private JFrame                            fenster;

    public Zeichenbrett() {

        setBorder(BorderFactory.createRaisedBevelBorder());

        bild = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
        Graphics g2d = bild.getGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, bild.getWidth(), bild.getHeight());

        g2d.dispose();

        zeichenbareObjekte = new ArrayList<>();

        fenster = new JFrame();
        fenster.setTitle("Zeichenbrett 800x800");

        Container fensterInhalt = fenster.getContentPane();
        fensterInhalt.setLayout(new BorderLayout());

        fensterInhalt.add(this, BorderLayout.CENTER);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fenster.setSize(new Dimension(822, 844));

        /*
         * Kleiner Trick, um das Fenster in der Mitte des Bildschirms anzuzeigen
         */
        fenster.setLocationRelativeTo(null);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawImage(bild, 2, 2, this);
    }

    public void zeichneAlleZeichenbarenObjekte() {

        Graphics g2d = bild.getGraphics();

        for (GeometrischeFigur zeichenbaresObjekt : zeichenbareObjekte)
            zeichenbaresObjekt.zeichnen(g2d);

        g2d.dispose();

        fenster.setVisible(true);
    }

    public void fuegeZeichenbaresObjektHinzu(GeometrischeFigur zeichenbaresObjekt) {
        zeichenbareObjekte.add(zeichenbaresObjekt);
    }

    public void entferneZeichenbaresObjekt(GeometrischeFigur zeichenbaresObjekt) {
        zeichenbareObjekte.remove(zeichenbaresObjekt);
    }
}