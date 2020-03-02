package Exercice4;

public abstract class Piece {
    protected String[] pNom = {"", "Pion", "Cavalier", "Fou", "Tour", "Reine", "Roi"}; // nom de la pièce
    protected int pValeur; // valeur numérique de la pièce (donne son type: aucune=0, pion=1, cavalier=2, fou=3, tour=4, reine=5, roi=6)
    protected boolean pCouleur; //couleur de la pièce 0->noir  1->blanc
    protected boolean pMort; // statut de la pièce 0->en jeu    1->éliminé (mort)
    protected String pPosition; // position xy de la pièce de "11" à "88"

    public abstract void seDeplace(); //ttt roque ?
}
