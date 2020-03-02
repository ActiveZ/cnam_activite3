package Exercice4;

public class Tour extends Piece {

    public Tour (String pNom, boolean pCouleur, Position pPosition) {
        super(pNom, pCouleur, pPosition);
        pAsc = pCouleur ? "2656" : "265C";
    }

    @Override
    public void seDeplace() {

    }

}
