package Exercice4;

public class Fou extends  Piece {

    public Fou (String pNom, boolean pCouleur, Position pPosition) {
        super(pNom, pCouleur, pPosition);
        pAsc = pCouleur ? "2657" : "265D";
    }

    @Override
    public void seDeplace() {

    }
}
