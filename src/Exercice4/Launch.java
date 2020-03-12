package Exercice4;

public class Launch {
    public static void main(String[] args) {

        Jeu jeu = new Jeu();
        Plateau plateau = new Plateau();
        jeu.selectionJoueurs();
        plateau.creationPieces();
        plateau.affichePlateau();
        jeu.jouer();



    }
}
