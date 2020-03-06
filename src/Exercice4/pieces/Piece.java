package Exercice4.pieces;

import java.util.ArrayList;
import java.util.List;

// codes ascii des pieces: https://fr.wikipedia.org/wiki/Symboles_d%27%C3%A9checs_en_Unicode
public abstract class Piece {
    protected TypePiece pNom; // nom de la pièce
    protected boolean pCouleur; //couleur de la pièce 0->noir  1->blanc
    protected boolean pVivant = true; // statut de la pièce 1->en jeu (vivant par defaut)    0->éliminé (mort)
    protected Position pPosition; // position de la pièce
    protected List<Position> listeCoupsPossibles = new ArrayList<Position>(); //liste des coups possibles pour la piece (positif si prise, négatif si coup faible)


    //constructeur
    public Piece(TypePiece pNom, boolean pCouleur, Position pPosition) {
        this.pNom = pNom;
        this.pCouleur = pCouleur;
        this.pPosition = pPosition;
    }

    //retourne le code ascii de la piece en fonction de sa couleur
    public char pAscii() {
        return pCouleur ? pNom.getBlanc() : pNom.getNoir();
    }

    // methode abstraite
    public abstract void seDeplace(); //ttt roque ?
}
