package Exercice4.pieces;

import Exercice4.Plateau;

import java.util.ArrayList;
import java.util.HashMap;

public class Pion extends Piece {
    private boolean premierCoup = true;

    public Pion (boolean pCouleur, Position pPosition) {
        super(TypePiece.Pion, pCouleur, pPosition);
    }

    public boolean isPremierCoup() {
        return premierCoup;
    }

    public void setPremierCoup(boolean premierCoup) {
        this.premierCoup = premierCoup;
    }

    //////////////////////////////////////

    @Override
    // retourne le tableau des positions des 4 coups possibles avec valeurs des gains (position, valeur)
    public HashMap calculCoupsPossibles() {
        HashMap mapCoupsPossibles = new HashMap(); //tableau clé-valeur avec clé=position testée et valeur=points rapportés
        int dep = pCouleur ? 1 : -1; // ajoute 1 au déplacement vertical si blanc, et -1 si noir
        mapCoupsPossibles.clear();

        // test avance 1 case
        Position testPosition1 = new Position(pPosition.getX(), pPosition.getY() + dep);
        testPosition1.setY(pPosition.getY() + dep); // modifie y de 1 par rapport à la position actuelle
        if (testPosition1.isSurPlateau() && testPosition1.isLibre() ) { // si la position à tester est sur le plateau et que case vide
            mapCoupsPossibles.put(testPosition1, 0); //déplacement simple => valeur = 0
        }

        // test avance 2 cases si premier coup
        if (isPremierCoup()) {
                Position testPosition2 = new Position(pPosition.getX(), pPosition.getY() + dep + dep);
                testPosition2.setY(pPosition.getY() + dep + dep); // modifie y de 2 par rapport à la position actuelle
                if (testPosition2.isSurPlateau() && testPosition2.isLibre()) { // si la position à tester est sur le plateau et que case vide
                    mapCoupsPossibles.put(testPosition2, 0); //déplacement simple => valeur = 0
                }
            }

        // test prend en diagonale g
        // modifie x de 1 vers la g et y de 1 par rapport à la position actuelle
        Position testPosition3 = new Position(pPosition.getX() - 1,pPosition.getY() + dep);
        if (testPosition3.isSurPlateau() && testPosition3.isCouleurDifferente(pCouleur)) {
            mapCoupsPossibles.put(testPosition3, testPosition3.valPosition()); //calcul et stockage de la valeur de la position cible
        }

        //test prend en diagonale d
        // modifie x de 1 vers la g et y de 1 par rapport à la position actuelle
        Position testPosition4 = new Position(pPosition.getX() + 1,pPosition.getY() + dep);
        if (testPosition4.isSurPlateau() && testPosition4.isCouleurDifferente(pCouleur)) {
            mapCoupsPossibles.put(testPosition4, testPosition4.valPosition()); //calcul et stockage de la valeur de la position cible
        }

        //prise en passant: pas implémenté

        return mapCoupsPossibles;
    }


//    @Override
//    public void seDeplace() {
//
//    }
}
