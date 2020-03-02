package Exercice3;

public class Trapeze extends Figure {
    private double grandeBase, petiteBase, hauteur;

    public Trapeze(String nom, double petiteBase, double grandeBase, double hauteur) {
        super();
        this.nomFigure = nom;
        this.petiteBase = petiteBase;
        this.grandeBase = grandeBase;
        this.hauteur = hauteur;
    }

    @Override
    double calculSurface() { // surface trapèze = ((L+l)/2)*h
        return ((petiteBase + grandeBase) / 2) * hauteur ;
    }
}
