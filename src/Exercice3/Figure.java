package Exercice3;

public abstract class Figure {
    protected String nomFigure;

    public String getNomFigure() {
        return nomFigure;
    }

    abstract double calculSurface();
}
