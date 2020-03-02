package Exercice3;

public class Carre extends Figure {
    private double longueur; // longueur du coté du carré

    public Carre(String nom, Double longueur) {
        super();
        this.nomFigure = nom;
        this.longueur = longueur;
    }

    @Override
    double calculSurface() {
        return longueur * longueur;
    }
}
