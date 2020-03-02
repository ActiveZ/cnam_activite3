package Exercice4;

import java.util.Arrays;

public class Plateau {
    //private final String[] symbolePiece = {"", "P", "C", "F", "Q", "K"};
    private Piece[][] tabPlaleau = new Piece[8][8];

    public void initPlateau(){
        // remplissage avec des 0
        //Arrays.fill(tabPlaleau,0);
        // remplissage avec les pieces au début de partie
        // valeur numérique de la pièce: aucune=0, pion=1, cavalier=2, fou=3, tour=4, reine=5, roi=6
//        for (int x = 0; x < 8; x++) {
//            tabPlaleau[x][1] = 1; //ligne des pions blancs
//            tabPlaleau[x][6] = 1; //ligne des pions noirs
//        }
//        tabPlaleau[0][0] = 4;
//        tabPlaleau[1][0] = 2;
//        tabPlaleau[2][0] = 3;
//        tabPlaleau[3][0] = 5;
//        tabPlaleau[4][0] = 6;
//        tabPlaleau[5][0] = 3;
//        tabPlaleau[6][0] = 2;
//        tabPlaleau[7][0] = 4;
//        tabPlaleau[0][7] = 4;
//        tabPlaleau[1][7] = 2;
//        tabPlaleau[2][7] = 3;
//        tabPlaleau[3][7] = 5;
//        tabPlaleau[4][7] = 6;
//        tabPlaleau[5][7] = 3;
//        tabPlaleau[6][7] = 2;
//        tabPlaleau[7][7] = 4;
        }

        public void affichePlateau() {
            for (int y = 7; y >= 0; y--) {
                for (int x =0; x < 8; x++) {
                    //System.out.print(tabPlaleau[x][y] + " ");
                    //System.out.print(symbolePiece[tabPlaleau[x][y]] + " ");
                    System.out.print(tabPlaleau[x][y]);

                    if (x == 7) { System.out.println();}
                }
            }
        }

    public void creationPieces() {
        // création des 16 pions et positionnement sur le plateau
        for (int i = 1; i < 9; i++) {
            //Pion pion = new Pion("pion"+i,i<9,true, new Position(i-1, (i < 9 ? 1 : 6)),(i < 9 ? "&#9817" : "&#9823"));
            tabPlaleau[i - 1][1] = new Pion("pion" + i, i < 9, true, new Position(i - 1, (i < 9 ? 1 : 6)), (i < 9 ? "&#9817" : "&#9823"));
        }
        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
            }
        }
    }
}


