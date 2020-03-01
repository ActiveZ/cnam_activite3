package Exercice1;

public class HabitationIndividuelle extends Habitation {
    private int nbPiece = 0;
    private boolean piscine = false;
    private double impot = 0; // montant de l'impot de l'habitation

    public HabitationIndividuelle(String nomPropietaire, String adresseLocal, double surfaceHabitation, int nbPiece, boolean piscine) {
        super(nomPropietaire, adresseLocal, surfaceHabitation);
        this.nbPiece = nbPiece;
        this.piscine = piscine;
        this.impot = calcImpot(); // calcul de l'impôt dès la construction de l'habitation
    }

    public double getImpot() {
        return impot;
    }

    protected double calcImpot() {
        return super.calcImpot() + (nbPiece * 15) + ((piscine ? 1 : 0) * 75);
    }

    public void affiche() {
        super.affiche();
        System.out.println("Nombre de pièce: " + nbPiece);
        System.out.println("Piscine: " + piscine);
    }
}
