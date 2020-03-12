package Exercice4;

import Exercice4.pieces.Piece;
import Exercice4.pieces.Position;

import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.function.BiConsumer;

public class Jeu {
    Scanner sc = new Scanner(System.in);
    private boolean typeJoueurBlanc = false, typeJoueurNoir = false; //1=humain, 0=ordinateur

    //définir si humain ou machine pour les 2 couleurs
    public void selectionJoueurs() {
        System.out.println("Le joueur blanc est 1: humain ou 2: ordinateur ?");
        String choix = sc.nextLine();
        typeJoueurBlanc = choix.equals("1");
        System.out.println("Le joueur noir est 1: humain ou 2: ordinateur");
        choix = sc.nextLine();
        typeJoueurNoir = choix.equals("1");
        System.out.println("Démarrage partie joueur blanc: " + (typeJoueurBlanc ? "humain" : "ordinateur") +
                " contre joueur noir: " + (typeJoueurBlanc ? "humain" : "ordinateur"));
        System.out.println("Pour déplacer une pièce d'une case à une autre, donnez les coordonnées sous la forme: e2e4");
        System.out.println("Entrez 0 pour quitter");
        System.out.println("Joueur blanc commence:");

    }

    public void jouer() {
        Scanner sc = new Scanner(System.in);
        String str1 = "abcdefgh";
        String str2 = "12345678";
        String choix;

        do {
            System.out.print("jouez: ");
            choix = sc.nextLine();
            switch (choix) {
                case "0":
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                default:
                    //System.out.println("x1: " + str1.indexOf(choix.charAt(0)) + ", " + str2.indexOf(choix.charAt(1)));
                    Position pDepart = new Position(str1.indexOf(choix.charAt(0)), str2.indexOf(choix.charAt(1))); // position de départ de la pièce
                    Position pArrivee = new Position(str1.indexOf(choix.charAt(2)), str2.indexOf(choix.charAt(3))); // position d'arrivée de la pièce

                    //annulation si déplacement sur place
                    if (pArrivee.getX() == pDepart.getX() && pArrivee.getY() == pDepart.getY()) {break;}

                    Piece pieceEnJeu =  Plateau.tabPlaleau[pDepart.getX()][pDepart.getY()];

                    // jouer le coup s'il est possible et actualiser le plateau
                    if (isCoupPossible(pieceEnJeu,pArrivee)) {
                        System.out.println(pieceEnJeu.getpNom() + (pieceEnJeu.getCouleur() ? " blanc":" noir") + " se déplace en " + choix.substring(2).toUpperCase());
                        pieceEnJeu.seDeplace(pArrivee);
                        Plateau.tabPlaleau[pArrivee.getX()][pArrivee.getY()] = pieceEnJeu;
                        Plateau.tabPlaleau[pDepart.getX()][pDepart.getY()] = null;
                        Plateau.affichePlateau();
                    } else {
                        System.out.println("Déplacement refusé !");
                    }
                break;
            }
        } while (true);
    }

    // retourne true si la piece peut se déplacer à la position souhaitée par joueur (humain)
    private boolean isCoupPossible(Piece p, Position arrivee) {
        HashMap<Position,Integer> casesPossibles = p.calculCoupsPossibles();

        for (Position pos : casesPossibles.keySet()) {
            if (pos.getX()==arrivee.getX() && pos.getY()==arrivee.getY()) {return true;}
        }
        return false; // déplacement refusé car pas dans la liste
    }
}
