package Exercice4.pieces;

import java.util.HashMap;

public class Fou extends Piece {
    public static final int VALEUR_FOU = 3;

    public Fou (boolean pCouleur, Position pPosition) {
        super(TypePiece.Fou, pCouleur, pPosition);
    }

    @Override
    public HashMap calculCoupsPossibles() {
        HashMap mapCoupsPossibles = new HashMap(); //tableau clé-valeur avec clé=position testée et valeur=points rapportés
        mapCoupsPossibles.clear();
        int i = 0;
        boolean ok = false;

        // diagonale nord-ouest
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() - i , pPosition.getY() + i);
            if (isCoupPermis(testPosition)) {
                ok = true;
                mapCoupsPossibles.put(testPosition, testPosition.valPosition());
            }
        } while (ok);

        // diagonale nord-est
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() + i, pPosition.getY() + i);
            if (isCoupPermis(testPosition)) {
                ok = true;
                mapCoupsPossibles.put(testPosition, testPosition.valPosition());
            }
        } while (ok);

        // diagonale sud-ouest
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() - i , pPosition.getY() - i);
            if (isCoupPermis(testPosition)) {
                ok = true;
                mapCoupsPossibles.put(testPosition, testPosition.valPosition());
            }
        } while (ok);

        // diagonale sud-est
        i = 0;
        do {
            ok = false;
            i++;
            Position testPosition = new Position(pPosition.getX() + i, pPosition.getY() - i);
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
