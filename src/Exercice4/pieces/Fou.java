package Exercice4.pieces;

import java.util.HashMap;

public class Fou extends Piece {
    public static final int VALEUR_FOU = 3;

    public Fou (boolean pCouleur, Position pPosition) {
        super(TypePiece.Fou, pCouleur, pPosition);
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
