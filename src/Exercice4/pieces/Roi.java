package Exercice4.pieces;

import java.util.HashMap;

public class Roi extends Piece {
    public static final int VALEUR_ROI = 10;

    public Roi (boolean pCouleur, Position pPosition) {
        super(TypePiece.Roi, pCouleur, pPosition);
    }

    @Override
    public HashMap calculCoupsPossibles() {
        HashMap mapCoupsPossibles = new HashMap(); //tableau clé-valeur avec clé=position testée et valeur=points rapportés
        int dep = pCouleur ? 1 : -1; // ajoute 1 au déplacement vertical si blanc, et -1 si noir
        mapCoupsPossibles.clear();

        // case nord-ouest
        Position testPosition1 = new Position(pPosition.getX() -1, pPosition.getY() + 1);
        if (isCoupPermis(testPosition1)) {mapCoupsPossibles.put(testPosition1, testPosition1.valPosition());}

        // case n
        Position testPosition2 = new Position(pPosition.getX(), pPosition.getY() + 1);
        if (isCoupPermis(testPosition2)) {mapCoupsPossibles.put(testPosition2, testPosition2.valPosition());}

        // case n-e
        Position testPosition3 = new Position(pPosition.getX() + 1, pPosition.getY() + 1);
        if (isCoupPermis(testPosition3)) {mapCoupsPossibles.put(testPosition3, testPosition3.valPosition());}

        // case o
        Position testPosition4 = new Position(pPosition.getX() -1 , pPosition.getY());
        if (isCoupPermis(testPosition4)) {mapCoupsPossibles.put(testPosition4, testPosition4.valPosition());}

        // case e
        Position testPosition5 = new Position(pPosition.getX() + 1, pPosition.getY());
        if (isCoupPermis(testPosition5)) {mapCoupsPossibles.put(testPosition5, testPosition5.valPosition());}

        // case s-o
        Position testPosition6 = new Position(pPosition.getX() -1 , pPosition.getY() - 1);
        if (isCoupPermis(testPosition6)) {mapCoupsPossibles.put(testPosition6, testPosition6.valPosition());}

        // case s
        Position testPosition7 = new Position(pPosition.getX(), pPosition.getY() - 1);
        if (isCoupPermis(testPosition7)) {mapCoupsPossibles.put(testPosition7, testPosition7.valPosition());}

        // case s-e
        Position testPosition8 = new Position(pPosition.getX() + 1, pPosition.getY() - 1);
        if (isCoupPermis(testPosition8)) {mapCoupsPossibles.put(testPosition8, testPosition8.valPosition());}

        // pas implémenté: déplacement sur case en échec
        // pas implémenté: roque

        return mapCoupsPossibles;
    }

    private boolean isCoupPermis(Position pTest) {  //todo
        if (pTest.isSurPlateau() && pTest.isLibre()) {return true;}
        if (pTest.isSurPlateau() && pTest.isCouleurDifferente(pCouleur)) {return true;}
        return false;
    }
}
