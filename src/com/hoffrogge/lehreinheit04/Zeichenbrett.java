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

/*
 * Zeichenfläche mit einer Größe von 800 x 800 Pixeln
 * @formatter:off
 *  
 *  0,0 ----------------------------------------- 800,0
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  0,800 --------------------------------------- 800,800
 *  
 * @formater:on 
 */
/**
 * Zeichenfläche mit einer Größe von 800 x 800 Pixeln. <br />
 * Kann eine {@link GeometrischeFigur} aufnehmen und zeichnen.<br />
 * Hinzufuegen mit {@link Zeichenbrett#fuegeZeichenbaresObjektHinzu(GeometrischeFigur)}.<br />
 * Zeichnen mit {@link Zeichenbrett#zeichneAlleZeichenbarenObjekte()}<br />
 * Zeichnen einer Linie ist möglich mit {@link Zeichenbrett#zeichneLinie(int, int, int, int)}<br />
 */
@SuppressWarnings("serial")
public class Zeichenbrett extends JPanel {

    private transient BufferedImage           zeichenflaeche;

    private transient List<GeometrischeFigur> zeichenbareObjekte;

    private JFrame                            fenster;

    public Zeichenbrett() {

        setBorder(BorderFactory.createRaisedBevelBorder());

        zeichenflaeche = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
        Graphics g2d = zeichenflaeche.getGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, zeichenflaeche.getWidth(), zeichenflaeche.getHeight());

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

        g.drawImage(zeichenflaeche, 2, 2, this);
    }

    public void zeichneAlleZeichenbarenObjekte() {

        Graphics g2d = zeichenflaeche.getGraphics();

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
    
    /**
     * Zeichnet eine Linie vom Punkt x1, y1 zum Punkt x2, y2
     */
    public void zeichneLinie(int x1, int y1, int x2, int y2) {
        
        Graphics g2d = zeichenflaeche.getGraphics();
        
        g2d.setColor(Color.BLACK);
        g2d.drawLine(x1, y1, x2, y2);
    }
}