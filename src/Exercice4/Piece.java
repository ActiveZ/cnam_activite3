package Exercice4;
// codes ascii des pieces: https://fr.wikipedia.org/wiki/Symboles_d%27%C3%A9checs_en_Unicode
public abstract class Piece {
    protected String pNom; // nom de la pièce
    protected boolean pCouleur; //couleur de la pièce 0->noir  1->blanc
    protected boolean pVivant = true; // statut de la pièce 1->en jeu (vivant par defaut)    0->éliminé (mort)
    protected Position pPosition; // position de la pièce
    protected String pAsc; //code ASCII de la pièce


    //constructeur
    public Piece(String pNom, boolean pCouleur, Position pPosition) {
        this.pNom = pNom;
        this.pCouleur = pCouleur;
        this.pPosition = pPosition;
    }

    // methode abstraite
    public abstract void seDeplace(); //ttt roque ?
}
