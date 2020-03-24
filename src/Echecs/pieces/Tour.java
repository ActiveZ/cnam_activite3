package Echecs.pieces;

import java.util.HashMap;

public class Tour extends Piece {
    public static final int VALEUR_TOUR = 5;

    public Tour (boolean pCouleur, Position pPosition) {
        super(TypePiece.Tour, pCouleur, pPosition);
    }


    @Override
    public HashMap calculCoupsPossibles() {
        HashMap mapCoupsPossibles = new HashMap(); //tableau clé-valeur avec clé=position testée et valeur=points rapportés
        mapCoupsPossibles.clear();
        int i = 0;
        boolean ok = false;

        // ligne nord
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() , pPosition.getY() + i);
            if (isCoupPermis(testPosition)) {
                ok = true;
                mapCoupsPossibles.put(testPosition, testPosition.valPosition());
            }
        } while (ok);

        // ligne sud
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() , pPosition.getY() - i);
            if (isCoupPermis(testPosition)) {
                ok = true;
                mapCoupsPossibles.put(testPosition, testPosition.valPosition());
            }
        } while (ok);

        // ligne ouest
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() - i , pPosition.getY());
            if (isCoupPermis(testPosition)) {
                ok = true;
                mapCoupsPossibles.put(testPosition, testPosition.valPosition());
            }
        } while (ok);

        // ligne est
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() + i, pPosition.getY());
            if (isCoupPermis(testPosition)) {
                ok = true;
                mapCoupsPossibles.put(testPosition, testPosition.valPosition());
            }
        } while (ok);

        return mapCoupsPossibles;
    }

    private boolean isCoupPermis(Position pTest) {
        if (pTest.isSurPlateau() && pTest.isLibre()) {return true;}
        if (pTest.isSurPlateau() && pTest.isCouleurDifferente(pCouleur)) {return true;}
        return false;
    }
}
