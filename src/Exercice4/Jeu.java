package Exercice4;

import Exercice4.pieces.Piece;
import Exercice4.pieces.Position;

import java.util.HashMap;
import java.util.Scanner;

public class Jeu {
    public void jouer() {
        Scanner sc = new Scanner(System.in);
        String str1 = "abcdefgh";
        String str2 = "12345678";
        String choix;


        System.out.println("\nVous avez les blancs, l'ordinateur a les noirs.");
        System.out.println("Pour déplacer une pièce d'une case à une autre, donnez les coordonnées sous la forme: e2e4");
        System.out.println("Entrez 0 pour quitter");

        do {
            System.out.print("jouez: ");
            choix = sc.nextLine();
            //choix = "";
            switch (choix) {
                case "0":
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                default:
                    //choix = "e2e4";
                    //System.out.println("x1: " + str1.indexOf(choix.charAt(0)) + ", " + str2.indexOf(choix.charAt(1)));
                    Position pDepart = new Position(str1.indexOf(choix.charAt(0)), str2.indexOf(choix.charAt(1))); // position de départ de la pièce
                    Position pArrivee = new Position(str1.indexOf(choix.charAt(2)), str2.indexOf(choix.charAt(3))); // position d'arrivée de la pièce
                    //System.out.println("x1: " + pDepart.getX() + ", y1: " + pDepart.getY());

                    Piece pieceEnJeu =  Plateau.tabPlaleau[pDepart.getX()][pDepart.getY()];
                    System.out.println("classe: " + pieceEnJeu.getClass());
                    HashMap casesPossibles = pieceEnJeu.calculCoupsPossibles();

                    pieceEnJeu.seDeplace(pArrivee);
                    Plateau.tabPlaleau[pArrivee.getX()][pArrivee.getY()] = pieceEnJeu;
                    Plateau.tabPlaleau[pDepart.getX()][pDepart.getY()] = null;
                    Plateau.affichePlateau();
                    break;
            }
        } while (true);
    }
}
