package Exercice4;

public class Launch {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        plateau.creationPieces();
        plateau.affichePlateau();

        Jeu jeu = new Jeu();
        jeu.jouer();

    }
}
