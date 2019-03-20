package com.hoffrogge.tetris;

import java.awt.Graphics;
import java.util.List;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.Punkt;

public class TetrominoBlock extends AllgemeinerTetromino {

    @Override
    public int getHoechstesY() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getTiefstesY() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getKanteLinksX() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getKanteRechtsX() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getX() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public void setX(int x) {
	// TODO Auto-generated method stub

    }

    @Override
    public int getY() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public void setY(int y) {
	// TODO Auto-generated method stub

    }

    @Override
    public void bewegeNachUnten() {
	// TODO Auto-generated method stub

    }

    @Override
    public void bewegeNachRechts() {
	// TODO Auto-generated method stub

    }

    @Override
    public void bewegeNachLinks() {
	// TODO Auto-generated method stub

    }

    @Override
    public void rotiereNachLinks() {
	// TODO Auto-generated method stub

    }

    @Override
    public void rotiereNachRechts() {
	// TODO Auto-generated method stub

    }

    @Override
    public boolean faelltAuf(TetrominoSpielstein tetrominoSpielstein) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public List<TetrominoSpielstein> getViertelBloecke() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Farbe getFuellFarbe() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setFuellFarbe(Farbe farbe) {
	// TODO Auto-generated method stub

    }

    @Override
    public void setMittelpunkt(Punkt mittelpunkt) {
	// TODO Auto-generated method stub

    }

    @Override
    public Punkt getMittelPunkt() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setDurchmesser(int d) {
	// TODO Auto-generated method stub

    }

    @Override
    public Farbe getLinienFarbe() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setLinienFarbe(Farbe farbe) {
	// TODO Auto-generated method stub

    }

    @Override
    public void zeichnen(Graphics graphics) {
	// TODO Auto-generated method stub

    }

    @Override
    public int compareTo(TetrominoSpielstein o) {
	// TODO Auto-generated method stub
	return 0;
    }

}