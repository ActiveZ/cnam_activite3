package Bibliotheque;

import java.util.Scanner;

public class Roman extends Livre {
    Scanner sc = new Scanner(System.in);
    private PrixLitteraire prixLitteraire;

    public Roman(int isbn, String titre, String auteur, int nbPages, PrixLitteraire prixLitteraire) {
        super(isbn, titre, auteur, nbPages);
        this.prixLitteraire = prixLitteraire;
    }

    public String getAuteur() { return super.auteur;}

    public String getTitre() { return super.titre;}

    public int getNbPages() { return super.nbPages;}

    public PrixLitteraire getPrixLitteraire() {
        return prixLitteraire;
    }
}

