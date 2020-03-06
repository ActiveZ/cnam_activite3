package Bibliotheque;

import java.util.Scanner;

public class Roman extends Livre {
    Scanner sc = new Scanner(System.in);
    private int prixLitteraire;
    public static final String[] tabPrixLitteraire = new String[]{"Aucun",
                                                            "GONCOURT",
                                                            "MEDICIS",
                                                            "INTERALLIE",
                                                            "RENAUDOT",
                                                            "FEMINA"};

    public Roman(int isbn, String titre, String auteur, int nbPages, int prixLitteraire) {
        super(isbn, titre, auteur, nbPages);
        this.prixLitteraire = prixLitteraire;
    }

    public String getAuteur() { return super.auteur;}

    public String getTitre() { return super.titre;}

    public int getNbPages() { return super.nbPages;}

    public String getPrixLitteraire() {
        return tabPrixLitteraire [prixLitteraire];
    }

    public void setPrixLitteraire() {
        System.out.println("Choisir un prix littéraire pour ce roman:");
        for (int i = 0; i < tabPrixLitteraire.length; i++) {
            System.out.println((i+1) +  ": " + tabPrixLitteraire[i]);
        }
        String choix = "";
        System.out.print("Votre choix: ");
        choix = sc.nextLine();
        switch (choix) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                this.prixLitteraire = Integer.parseInt(choix)-1;
                break;
            default:
                System.out.println("Choix non valide !");
                break;
            }

}
}
