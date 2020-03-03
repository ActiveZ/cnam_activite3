package Bibliotheque;

public class Roman extends Livre {
    private int prix;

    public Roman(int isbn, String titre, String auteur, int nbPages, int prix) {
        super(isbn, titre, auteur, nbPages);
        this.prix = prix;
    }
}
