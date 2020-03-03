package Bibliotheque;

public abstract class Livre extends Document {
    protected String auteur;
    protected int nbPages;

    public Livre(int isbn, String titre, String auteur, int nbPages) {
        super(isbn, titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
}
