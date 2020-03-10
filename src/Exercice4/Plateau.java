package Exercice4;

import Exercice4.pieces.*;

public class Plateau {

    public static Piece[][] tabPlaleau = new Piece[8][8];


    public static void affichePlateau() {
        System.out.println("\tA\tB\tC\tD\tE\tF\tG\tH");
        for (int y = 7; y >= 0; y--) {
            System.out.print(y+1);
            for (int x =0; x < 8; x++) {
                if (tabPlaleau[x][y] != null) {System.out.print("\t" + tabPlaleau[x][y].pAscii());}
                else {System.out.print("\t.");}
                if (x == 7) {
                    System.out.print("\t" + (y+1));
                    System.out.println();} //ligne suivante
            }
        }
        System.out.println("\tA\tB\tC\tD\tE\tF\tG\tH");
    }

//    // retourne la piece à la position p
//    public Piece getPiece (Position p) {
//        //Piece piece = new Piece(tabPlaleau[p.getX()][p.getY()].getpNom(),tabPlaleau[p.getX()][p.getY()].getCouleur(), new Position (p.getX(),p.getY()));
//
//        return null;
//    }

    // création des pièces et positionnement sur le plateau
    public void creationPieces() {
        for (int i = 0; i < 8; i++) { // balayage horizontal (x)
            //pions blancs
            tabPlaleau[i][1] = new Pion(true, new Position(i , 1));
            //pions noirs
            tabPlaleau[i][6] = new Pion(false, new Position(i , 7));
            switch (i) {
                case 0: //tours
                    tabPlaleau[0][0] = new Tour(true, new Position(0,0));
                    tabPlaleau[0][7] = new Tour(false, new Position(0,7));
                    break;
                case 1: //cavaliers
                    tabPlaleau[1][0] = new Cavalier(true, new Position(1,0));
                    tabPlaleau[1][7] = new Cavalier( false, new Position(1,7));
                    break;
                case 2: //fous
                    tabPlaleau[2][0] = new Fou( true, new Position(2,0));
                    tabPlaleau[2][7] = new Fou( false, new Position(2,7));
                    break;
                case 3: //reines
                    tabPlaleau[3][0] = new Reine( true, new Position(3,0));
                    tabPlaleau[3][7] = new Reine( false, new Position(3,7));
                    break;
                case 4: //rois
                    tabPlaleau[4][0] = new Roi( true, new Position(4,0));
                    tabPlaleau[4][7] = new Roi(false, new Position(4,7));
                    break;
                case 5: //fous
                    tabPlaleau[5][0] = new Fou( true, new Position(5,0));
                    tabPlaleau[5][7] = new Fou( false, new Position(5,7));
                    break;
                case 6: //cavaliers
                    tabPlaleau[6][0] = new Cavalier( true, new Position(6,0));
                    tabPlaleau[6][7] = new Cavalier(false, new Position(6,7));
                    break;
                case 7: //tours
                    tabPlaleau[7][0] = new Tour(true, new Position(7,0));
                    tabPlaleau[7][7] = new Tour(false, new Position(7,7));
                    break;
            }
        }
    }


}


