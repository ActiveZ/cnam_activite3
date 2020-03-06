package Exercice4.pieces;

public class Cavalier extends Piece {
    public static final int VALEUR_CAVALIER = 3;

    public Cavalier (boolean pCouleur, Position pPosition) {
        super(TypePiece.Cavalier, pCouleur, pPosition);
    }

    @Override
    public void seDeplace() {

    }

}
