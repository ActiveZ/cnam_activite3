package Bibliotheque;

public class Revue extends Document {
    private int mois;
    private int annee;

    public Revue(int isbn, String titre, int mois, int annee) {
        super(isbn, titre);
        this.mois = mois;
        this.annee = annee;
    }
}
