package Exercice4.pieces;

public class Fou extends Piece {
    public static final int VALEUR_FOU = 3;

    public Fou (boolean pCouleur, Position pPosition) {
        super(TypePiece.Fou, pCouleur, pPosition);
    }

    @Override
    public void seDeplace() {

    }
}
