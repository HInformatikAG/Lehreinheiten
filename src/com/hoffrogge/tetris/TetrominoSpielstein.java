package com.hoffrogge.tetris;

import java.util.List;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;

/**
 * Definition eines Tetris-Spielsteins als TetrominoSpielstein. Dieses Interface
 * erbt von {@link GeometrischeFigur} und {@link Comparable}. D. h. ein
 * TetrominoSpielstein ist auch eine GeometrischeFigur und die Spielsteine
 * lassen sich sortieren.
 */
public interface TetrominoSpielstein extends GeometrischeFigur, Comparable<TetrominoSpielstein> {

    int getHoechstesY();

    int getTiefstesY();

    int getKanteLinksX();

    int getKanteRechtsX();

    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    void bewegeNachUnten();

    void bewegeNachRechts();

    void bewegeNachLinks();

    void rotiereNachLinks();

    void rotiereNachRechts();

    boolean faelltAuf(TetrominoSpielstein tetrominoSpielstein);

    /**
     * Jeder TetrominoSpielstein ist aus bis zu vier einzelnen, quadratischen
     * Blöcken aufgebaut.
     */
    List<TetrominoSpielstein> getViertelBloecke();

    Farbe getFuellFarbe();

    void setFuellFarbe(Farbe farbe);

}