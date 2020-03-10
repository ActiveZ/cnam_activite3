package Exercice4.pieces;

import Exercice4.Plateau;

public class Position {
    private int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSurPlateau() { //vérifie que la position reste sur le plateau
        return (getX() >= 0  && getX() < 8 && getY() >= 0 && getY() < 8);
    }

    public boolean isLibre() { //vérifie que la case est libre (vide)
        return  (Plateau.tabPlaleau[getX()][getY()] == null); // case libre
    }

    public boolean isCouleurDifferente (Boolean couleur) { //vérifie si la case est occupée par une piece d'une autre couleur
        if (Plateau.tabPlaleau[getX()][getY()] == null) {return false;} //cas du déplacement sur case vide
        return (Plateau.tabPlaleau[getX()][getY()].pCouleur != couleur); // renvoi true si couleur différente
    }

    public int valPosition () { //calcul de la valeur de la pièce à prendre à la position p
        if (Plateau.tabPlaleau[getX()][getY()].pNom == TypePiece.Pion) {return 1;}
        if (Plateau.tabPlaleau[getX()][getY()].pNom == TypePiece.Cavalier) {return 3;}
        if (Plateau.tabPlaleau[getX()][getY()].pNom == TypePiece.Fou) {return 3;}
        if (Plateau.tabPlaleau[getX()][getY()].pNom == TypePiece.Tour) {return 5;}
        if (Plateau.tabPlaleau[getX()][getY()].pNom == TypePiece.Reine) {return 9;}
        if (Plateau.tabPlaleau[getX()][getY()].pNom == TypePiece.Roi) {return 10;}
        return 0; //case vide
    }
}

