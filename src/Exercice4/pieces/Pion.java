package Exercice4.pieces;

import Exercice4.Plateau;

public class Pion extends Piece {
    private boolean premierCoup = true;
    public static final int VALEUR_PION = 1;

    public Pion (boolean pCouleur, Position pPosition) {
        super(TypePiece.Pion, pCouleur, pPosition);
    }

    public boolean isPremierCoup() {
        return premierCoup;
    }

    public void setPremierCoup(boolean premierCoup) {
        this.premierCoup = premierCoup;
    }
    //////////////////////////////////////
    private boolean isSurPlateau(Position p) { //vérifie que la position reste sur le plateau
        return (p.getX() >= 0  && p.getX() < 8 && p.getY() >= 0 && p.getY() < 8);
    }

    private boolean isCasePossible (Position p, Boolean couleur) { //vérifie que la case est libre ou pas occupée par une piece de la même couleur
        if (Plateau.tabPlaleau[p.getX()][p.getY()] == null) { return true;} // case libre
        else if (Plateau.tabPlaleau[p.getX()][p.getY()].pCouleur != couleur) { return true; } // case occupée avec couleur adverse
        else {return false;}
    }

    private int calculValeurCoup(Position p) { //calcul de la valeur de la pièce à prendre
        if (Plateau.tabPlaleau[p.getX()][p.getY()].pNom == TypePiece.Pion) {return 1;}
        if (Plateau.tabPlaleau[p.getX()][p.getY()].pNom == TypePiece.Cavalier) {return 3;}
        if (Plateau.tabPlaleau[p.getX()][p.getY()].pNom == TypePiece.Fou) {return 3;}
        if (Plateau.tabPlaleau[p.getX()][p.getY()].pNom == TypePiece.Tour) {return 5;}
        if (Plateau.tabPlaleau[p.getX()][p.getY()].pNom == TypePiece.Reine) {return 9;}
        if (Plateau.tabPlaleau[p.getX()][p.getY()].pNom == TypePiece.Roi) {return 10;}
        return 0; //case vide
    }

    private void calculCoupsPossibles() {
        int dep = pCouleur ? 1 : -1; // ajoute 1 au déplacement vertical si blanc, et -1 si noir
        listeCoupsPossibles.clear();

    }


    @Override
    public void seDeplace() {

    }
}
