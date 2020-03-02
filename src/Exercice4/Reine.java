package Exercice4;

public class Reine extends Piece {

    public Reine (String pNom, boolean pCouleur, Position pPosition) {
        super(pNom, pCouleur, pPosition);
        pAsc = pCouleur ? "2655" : "265B";
    }

    @Override
    public void seDeplace() {

    }

}
