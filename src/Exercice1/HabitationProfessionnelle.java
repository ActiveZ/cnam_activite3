package Exercice1;

public class HabitationProfessionnelle extends Habitation {
    private int nbEmployes = 0;
    private double impot = 0; // montant de l'impot de l'habitation

    public HabitationProfessionnelle(String nomPropietaire, String adresseLocal, double surfaceHabitation, int nbEmployes) {
        super(nomPropietaire, adresseLocal, surfaceHabitation);
        this.nbEmployes = nbEmployes;
        this.impot = calcImpot();
    }

    public double getImpot() {
        return impot;
    }

    protected double calcImpot() {
        return super.calcImpot() + nbEmployes/10*150;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Nombre d'employés: " + nbEmployes);
    }
}
