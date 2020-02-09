package com.hoffrogge.uebungen;

import java.util.Collection;

public interface FarbenInfos {

    int getRotAnteil(Farbe farbe);

    int getGruenAnteil(Farbe farbe);

    int getBlauAnteil(Farbe farbe);

    Collection<Farbe> getAlleFarben();
}