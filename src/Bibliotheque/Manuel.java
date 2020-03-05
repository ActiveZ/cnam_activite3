package Bibliotheque;

public class Manuel extends Livre {
    private int niveauScolaire;

    public Manuel(int isbn, String titre, String auteur, int nbPages, int niveauScolaire) {
        super(isbn, titre, auteur, nbPages);
        this.niveauScolaire = niveauScolaire;
    }

    public int getNiveauScolaire() {
        return niveauScolaire;
    }

    public void setNiveauScolaire(int niveauScolaire) {
        this.niveauScolaire = niveauScolaire;
    }
}
