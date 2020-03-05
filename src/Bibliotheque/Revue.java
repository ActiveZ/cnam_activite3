package Bibliotheque;

public class Revue extends Document {
    private int mois;
    private int annee;

    public Revue(int isbn, String titre, int mois, int annee) {
        super(isbn, titre);
        this.mois = mois;
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
