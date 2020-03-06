package Exercice4;

import Exercice4.pieces.*;

import static Exercice4.pieces.Cavalier.VALEUR_CAVALIER;
import static Exercice4.pieces.Fou.VALEUR_FOU;
import static Exercice4.pieces.Pion.VALEUR_PION;
import static Exercice4.pieces.Reine.VALEUR_REINE;
import static Exercice4.pieces.Roi.VALEUR_ROI;
import static Exercice4.pieces.Tour.VALEUR_TOUR;

public class Plateau {

    public static Piece[][] tabPlaleau = new Piece[8][8];


    public void affichePlateau() {
        for (int y = 7; y >= 0; y--) {
            for (int x =0; x < 8; x++) {
                if (tabPlaleau[x][y] != null) {System.out.print("\t" + tabPlaleau[x][y].pAscii());}
                else {System.out.print("\t.");}
                if (x == 7) { System.out.println();} //ligne suivante
            }
        }
    }


    // création des pièces et positionnement sur le plateau
    public void creationPieces() {
        for (int i = 0; i < 8; i++) { // balayage horizontal (x)
            //pions blancs
            tabPlaleau[i][1] = new Pion(true, new Position(i , 1,VALEUR_PION));
            //pions noirs
            tabPlaleau[i][6] = new Pion(false, new Position(i , 7,VALEUR_PION));
            switch (i) {
                case 0: //tours
                    tabPlaleau[0][0] = new Tour(true, new Position(0,0,VALEUR_TOUR));
                    tabPlaleau[0][7] = new Tour(false, new Position(0,7, VALEUR_TOUR));
                    break;
                case 1: //cavaliers
                    tabPlaleau[1][0] = new Cavalier(true, new Position(1,0, VALEUR_CAVALIER));
                    tabPlaleau[1][7] = new Cavalier( false, new Position(1,7, VALEUR_CAVALIER));
                    break;
                case 2: //fous
                    tabPlaleau[2][0] = new Fou( true, new Position(2,0, VALEUR_FOU));
                    tabPlaleau[2][7] = new Fou( false, new Position(2,7, VALEUR_FOU));
                    break;
                case 3: //reines
                    tabPlaleau[3][0] = new Reine( true, new Position(3,0, VALEUR_REINE));
                    tabPlaleau[3][7] = new Reine( false, new Position(3,7, VALEUR_REINE));
                    break;
                case 4: //rois
                    tabPlaleau[4][0] = new Roi( true, new Position(4,0, VALEUR_ROI));
                    tabPlaleau[4][7] = new Roi(false, new Position(4,7,VALEUR_ROI));
                    break;
                case 5: //fous
                    tabPlaleau[5][0] = new Fou( true, new Position(5,0,VALEUR_FOU));
                    tabPlaleau[5][7] = new Fou( false, new Position(5,7,VALEUR_FOU));
                    break;
                case 6: //cavaliers
                    tabPlaleau[6][0] = new Cavalier( true, new Position(6,0, VALEUR_CAVALIER));
                    tabPlaleau[6][7] = new Cavalier(false, new Position(6,7, VALEUR_CAVALIER));
                    break;
                case 7: //tours
                    tabPlaleau[7][0] = new Tour(true, new Position(7,0, VALEUR_TOUR));
                    tabPlaleau[7][7] = new Tour(true, new Position(7,7, VALEUR_TOUR));
                    break;
            }
        }
    }
}


