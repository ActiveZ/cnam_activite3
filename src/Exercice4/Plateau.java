package Exercice4;

public class Plateau {

    private static Piece[][] tabPlaleau = new Piece[8][8];

    public void affichePlateau() {

        for (int y = 7; y >= 0; y--) {
            for (int x =0; x < 8; x++) {
                System.out.print(tabPlaleau[x][y].pNom);
                if (x == 7) { System.out.println();}
            }
        }
        //System.out.println("pion:" + "\u2659" + "\u265f");
    }


    public void creationPieces() {
            Vide pVide = new Vide(null,false, null);

        for (int y = 7; y >= 0; y--) {
            for (int x =0; x < 8; x++) { tabPlaleau[x][y] = pVide; }
            }

        // création des pièces et positionnement sur le plateau
        for (int i = 0; i < 8; i++) { // balayage horizontal (x)
            //pions blancs
            tabPlaleau[i][1] = new Pion("pion" + (i + 1), true, new Position(i , 1));
            //pions noirs
            tabPlaleau[i][6] = new Pion("pion" + (i + 1), false, new Position(i , 7));
            switch (i) {
                case 0: //tours
                    tabPlaleau[0][0] = new Tour("tour1",true, new Position(0,0));
                    tabPlaleau[0][7] = new Tour("tour1",false, new Position(0,7));
                    break;
                case 1: //cavaliers
                    tabPlaleau[1][0] = new Cavalier("cavalier1", true, new Position(1,0));
                    tabPlaleau[1][7] = new Cavalier("cavalier1", false, new Position(1,7));
                    break;
                case 2: //fous
                    tabPlaleau[2][0] = new Fou("fou1", true, new Position(2,0));
                    tabPlaleau[2][7] = new Fou("fou1", false, new Position(2,7));
                    break;
                case 3: //reines
                    tabPlaleau[3][0] = new Reine("reine", true, new Position(3,0));
                    tabPlaleau[3][7] = new Reine("reine", false, new Position(3,7));
                    break;
                case 4: //rois
                    tabPlaleau[4][0] = new Roi("roi", true, new Position(4,0));
                    tabPlaleau[4][7] = new Cavalier("roi", false, new Position(4,7));
                    break;
                case 5: //fous
                    tabPlaleau[5][0] = new Fou("fou2", true, new Position(5,0));
                    tabPlaleau[5][7] = new Fou("fou2", false, new Position(5,7));
                    break;
                case 6: //cavaliers
                    tabPlaleau[6][0] = new Cavalier("cavalier2", true, new Position(6,0));
                    tabPlaleau[6][7] = new Cavalier("cavalier2", false, new Position(6,7));
                    break;
                case 7: //tours
                    tabPlaleau[7][0] = new Tour("tour2",true, new Position(7,0));
                    tabPlaleau[7][7] = new Tour("tour2",true, new Position(7,7));
                    break;
            }
        }
    }
}


