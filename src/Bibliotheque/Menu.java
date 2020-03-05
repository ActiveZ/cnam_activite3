package Bibliotheque;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Bibliotheque bibliotheque = new Bibliotheque(1000);;

    public void menuGeneral() {
        peupleBiblio(); // créer 10 documents pour la démo
        System.out.println("Bibliothèque créée ! Capacité: " + bibliotheque.getMaxDoc() + " documents. Nombre de documents actuels: " + bibliotheque.getNbDocuments());
        System.out.println("------------------------------------------------------------");

        do {
            System.out.println("1: Modifier capacité bibliothèque"); // (actuellement " + bibliotheque.getNbDocuments() + ")");
            System.out.println("2: Afficher tous les ouvrages");
            System.out.println("3: Afficher le nième document");
            System.out.println("4: Ajouter un document");
            System.out.println("5: Supprimer un document");
            System.out.println("6: Afficher les auteurs");
            System.out.println("7: Quitter");

            String choix = "";
            System.out.print("Votre choix: ");
            choix = sc.nextLine();
            System.out.println("------------------------------------");
            switch (choix) {
                case "1":
                    break;
                case "2":
                    bibliotheque.afficherTousDocuments();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7": // fin programme
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
    }

    // remplir la bibliothèque avec 10 documents pour la démo
    private void peupleBiblio() {
        Roman roman1 = new Roman(5654654,"Titre roman 1","Auteur Roman 1",100,0);
        bibliotheque.ajouter(roman1);

        Roman roman2 = new Roman(82466,"Titre roman 2","Auteur Roman 2",200,1);
        bibliotheque.ajouter(roman2);


    }
}
