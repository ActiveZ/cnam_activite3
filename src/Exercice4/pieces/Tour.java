package Exercice4.pieces;

import java.util.HashMap;

public class Tour extends Piece {
    public static final int VALEUR_TOUR = 5;

    public Tour (boolean pCouleur, Position pPosition) {
        super(TypePiece.Tour, pCouleur, pPosition);
    }

//    @Override
//    public void seDeplace() {
//
//    }

    @Override
    public HashMap calculCoupsPossibles() {
        return null;
    }
}
