package Exercice4.pieces;

import java.util.HashMap;

public class Reine extends Piece {
    public static final int VALEUR_REINE = 9;

    public Reine (boolean pCouleur, Position pPosition) {
        super(TypePiece.Reine, pCouleur, pPosition);
    }

    //@Override
    public void seDeplace() {
    }

    @Override
    public HashMap calculCoupsPossibles() {
        return null;
    }
}
