package Exercice3;

import java.util.PrimitiveIterator;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom, double rayon) {
        super();
        this.nomFigure = nom;
        this.rayon = rayon;
    }


    @Override
    double calculSurface() {
        return rayon * Math.PI * Math.PI;
    }
}
