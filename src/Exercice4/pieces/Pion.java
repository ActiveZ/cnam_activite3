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

    private void calculCoupsPossibles() {
        HashMap mapCoupsPossibles = new HashMap(); //tableau de position des 4 coups possibles
        int dep = pCouleur ? 1 : -1; // ajoute 1 au déplacement vertical si blanc, et -1 si noir
        mapCoupsPossibles.clear();
        Position testPosition = new Position(pPosition.getX(), pPosition.getY()); // définition de la position test à la position actuelle

        // test avance 1 case
        testPosition.setY(pPosition.getY() + dep); // modifie y de 1 par rapport à la position actuelle
        if (testPosition.isSurPlateau() && testPosition.isLibre() ) { // si la position à tester est sur le plateau et que case vide
            mapCoupsPossibles.put(testPosition, 0); //déplacement simple => valeur = 0
        } else {
            mapCoupsPossibles.put(testPosition,null);
        }

        // test avance 2 cases si premier coup
        testPosition.setY(pPosition.getY() + dep + dep); // modifie y de 2 par rapport à la position actuelle
        if (testPosition.isSurPlateau() && testPosition.isLibre() ) { // si la position à tester est sur le plateau et que case vide
            mapCoupsPossibles.put(testPosition, 0); //déplacement simple => valeur = 0
        } else {
            mapCoupsPossibles.put(testPosition,null);
        }

        // test prend en diagonale g
        testPosition.setY(pPosition.getY() + dep); // modifie y de 1 par rapport à la position actuelle
        testPosition.setY(pPosition.getX() - 1); // modifie x de 1 vers la g par rapport à la position actuelle
        if (testPosition.isSurPlateau() && testPosition.isCouleurDifferente(pCouleur)) {
            mapCoupsPossibles.put(testPosition, testPosition.valPosition()); //calcul et stockage de la valeur de la position cible
        } else {
            mapCoupsPossibles.put(testPosition, null);
        }

        // prend en diagonale d
        testPosition.setY(pPosition.getY() + dep); // modifie y de 1 par rapport à la position actuelle
        testPosition.setY(pPosition.getX() + 1); // modifie x de 1 vers la d par rapport à la position actuelle
        if (testPosition.isSurPlateau() && testPosition.isCouleurDifferente(pCouleur)) {
            mapCoupsPossibles.put(testPosition, testPosition.valPosition()); //calcul et stockage de la valeur de la position cible
        } else {
            mapCoupsPossibles.put(testPosition, null);
        }

        //prise en passant: pas implémenté

    }


    @Override
    public void seDeplace() {

    }
}
