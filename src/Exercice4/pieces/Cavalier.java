package Exercice4.pieces;

import java.util.HashMap;

public class Cavalier extends Piece {

    public Cavalier (boolean pCouleur, Position pPosition) {
        super(TypePiece.Cavalier, pCouleur, pPosition);
    }

    @Override
    public HashMap calculCoupsPossibles() { // 8 cases à tester
        HashMap mapCoupsPossibles = new HashMap(); //tableau clé-valeur avec clé=position testée et valeur=points rapportés
        mapCoupsPossibles.clear();

        //1 case au nord + 2 cases à l'est
        Position testPosition1 = new Position(pPosition.getX() + 2, pPosition.getY() + 1);
        if (isCoupPermis(testPosition1)) {mapCoupsPossibles.put(testPosition1, testPosition1.valPosition());}

        //1 case au nord + 2 cases à l'ouest
        Position testPosition2 = new Position(pPosition.getX() - 2, pPosition.getY() + 1);
        if (isCoupPermis(testPosition2)) {mapCoupsPossibles.put(testPosition2, testPosition2.valPosition());}


        //2 case au nord + 1 cases à l'est
        Position testPosition3 = new Position(pPosition.getX() + 1, pPosition.getY() + 2);
        if (isCoupPermis(testPosition3)) {mapCoupsPossibles.put(testPosition3, testPosition3.valPosition());}

        //2 cases au nord + 1 case à l'ouest
        Position testPosition4 = new Position(pPosition.getX() - 1, pPosition.getY() + 2);
        if (isCoupPermis(testPosition4)) {mapCoupsPossibles.put(testPosition4, testPosition4.valPosition());}


        //1 case au sud + 2 cases à l'est
        Position testPosition5 = new Position(pPosition.getX() + 2, pPosition.getY() - 1);
        if (isCoupPermis(testPosition5)) {mapCoupsPossibles.put(testPosition5, testPosition5.valPosition());}


        //1 case au sud + 2 cases à l'ouest
        Position testPosition6 = new Position(pPosition.getX() - 2, pPosition.getY() - 1);
        if (isCoupPermis(testPosition6)) {mapCoupsPossibles.put(testPosition6, testPosition6.valPosition());}

        //2 cases au sud + 1 cases à l'est
        Position testPosition7 = new Position(pPosition.getX() + 1, pPosition.getY() - 2);
        if (isCoupPermis(testPosition7)) {mapCoupsPossibles.put(testPosition7, testPosition7.valPosition());}

        //2 cases au sud + 1 cases à l'ouest (rien de nouveau)
        Position testPosition8 = new Position(pPosition.getX()-1, pPosition.getY() - 2);
        if (isCoupPermis(testPosition8)) {mapCoupsPossibles.put(testPosition8, testPosition8.valPosition());}

        return mapCoupsPossibles;
    }

    private boolean isCoupPermis(Position pTest) {
        if (pTest.isSurPlateau() && pTest.isLibre()) {return true;}
        if (pTest.isSurPlateau() && pTest.isCouleurDifferente(pCouleur)) {return true;}
        return false;
    }

}
