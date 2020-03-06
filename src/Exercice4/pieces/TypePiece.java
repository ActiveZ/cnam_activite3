package Exercice4.pieces;

public enum TypePiece {
    // type de pièce, caractère si pièce blanche, caractère si pièce noire
    Fou ('\u2657','\u265D'),
    Tour ('\u2656','\u265C'),
    Roi ('\u2654','\u265A'),
    Reine ('\u2655','\u265B'),
    Cavalier ('\u2658','\u265E'),
    Pion ('\u2659','\u265F');

    // attributs
    private char blanc;
    private char noir;
    //private boolean couleur;

    // constructeur
    private TypePiece(char b, char n) {
        blanc = b;
        noir = n;
    }

    /**
     * @return the blanc
     */
    public char getBlanc() {
        return blanc;
    }

    /**
     * @return the noir
     */
    public char getNoir() {
        return noir;
    }

}
