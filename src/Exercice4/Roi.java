package Exercice4;

public class Roi extends Piece {

    public Roi (String pNom, boolean pCouleur, Position pPosition) {
        super(pNom, pCouleur, pPosition);
        pAsc = pCouleur ? "2654" : "265A";
    }

    @Override
    public void seDeplace() {

    }

}
