package Exercice4;

public class Cavalier extends Piece {

    public Cavalier (String pNom, boolean pCouleur, Position pPosition) {
        super(pNom, pCouleur, pPosition);
        pAsc = pCouleur ? "2658" : "265E";
    }

    @Override
    public void seDeplace() {

    }

}
