package Exercice4;

public class Pion extends Piece {

    public Pion (String pNom, boolean pCouleur, Position pPosition) {
        super(pNom, pCouleur, pPosition);
        pAsc = pCouleur ? "2659" : "265F";
    }

    @Override
    public void seDeplace() {

    }
}
