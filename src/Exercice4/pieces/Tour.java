package Exercice4.pieces;

public class Tour extends Piece {
    public static final int VALEUR_TOUR = 5;

    public Tour (boolean pCouleur, Position pPosition) {
        super(TypePiece.Tour, pCouleur, pPosition);
    }

    @Override
    public void seDeplace() {

    }

}
