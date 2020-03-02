package Exercice4;

public abstract class Piece {
    protected String pNom; // nom de la pièce (p=pion, T=tour, C=cavalier, F=fou, Q=reine, K=roi)
    protected boolean pCouleur; //couleur de la pièce 0->noir  1->blanc
    protected boolean pMort; // statut de la pièce 0->en jeu    1->éliminé (mort)
    protected String pPosition; // position xy de la pièce de "00" à "88"

    public abstract void seDeplace();
}
