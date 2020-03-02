package Exercice4;

public class Plateau {

    private Piece[][] tabPlaleau = new Piece[8][8];

        public void affichePlateau() {
            for (int y = 7; y >= 0; y--) {
                for (int x =0; x < 8; x++) {
                    System.out.print(tabPlaleau[x][y]);
                    if (x == 7) { System.out.println();}
                }
            }
            Pion pTest = new Pion("test",true, new Position(1,1));
            System.out.println("pTest:" + pTest.pNom + pTest.pVivant);
        }

    public void creationPieces() {
        // création des pièces et positionnement sur le plateau
        for (int i = 0; i < 8; i++) {
            //pions blancs
            tabPlaleau[i][1] = new Pion("pion" + i +1, true, new Position(i , 1));
            //pions noirs
            tabPlaleau[i][6] = new Pion("pion" + i + 9, false, new Position(i , 7));
            //tours1
            //tabPlaleau[i][0]=
        }

    }

}


