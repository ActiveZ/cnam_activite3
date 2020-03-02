package Exercice4;

public abstract class Piece {
    protected String pNom; // nom de la pièce
    protected boolean pCouleur; //couleur de la pièce 0->noir  1->blanc
    protected boolean pVivant = true; // statut de la pièce 1->en jeu (vivant par defaut)    0->éliminé (mort)
    protected Position pPosition; // position de la pièce
    protected String pAsc; //code ASCII de la pièce


    //constructeur
    public Piece(String pNom, boolean pCouleur, boolean pMort, Position pPosition, String pAsc) {
        this.pNom = pNom;
        this.pCouleur = pCouleur;
        this.pVivant = pMort;
        this.pPosition = pPosition;
        this.pAsc = pAsc;
    }

    // methode abstraite
    public abstract void seDeplace(); //ttt roque ?
}
