package Exercice4.pieces;

import java.util.HashMap;

public class Roi extends Piece {
    public static final int VALEUR_ROI = 10;

    public Roi (boolean pCouleur, Position pPosition) {
        super(TypePiece.Roi, pCouleur, pPosition);
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
