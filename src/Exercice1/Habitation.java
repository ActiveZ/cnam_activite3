package Exercice1;

public class Habitation {
    protected String nomProprietaire = "";
    protected  String adresseLocal = "";
    protected double surfaceHabitation = 0; // en m²
    final double TAUX_IMPOSITION = 0.35; // € par m² de surface habitable

    public Habitation(String nomPropietaire, String adresseLocal, double surfaceHabitation) {
        this.nomProprietaire = nomPropietaire;
        this.adresseLocal = adresseLocal;
        this.surfaceHabitation = surfaceHabitation;
    }

    protected double getImpot() {
        return 0;
    }

    protected double calcImpot() {
        return surfaceHabitation * TAUX_IMPOSITION;
    }

    protected void affiche() {
        System.out.println("Nom du propriétaire: " + nomProprietaire);
        System.out.println("Adresse du local: " + adresseLocal);
        System.out.println("Surface du local: " + surfaceHabitation);
    }
}
