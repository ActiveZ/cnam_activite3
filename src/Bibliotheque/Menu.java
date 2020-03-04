package Bibliotheque;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private static Bibliotheque bibliotheque;

    public void menuGeneral() {
        do {
            System.out.println("\n1: Créer bibliothèque (et 10 documents)");
            System.out.println("2: Modifier taille bibliothèque");
            System.out.println("3: Afficher tous les ouvrages");
            System.out.println("4: Afficher le nième document");
            System.out.println("5: Ajouter un document");
            System.out.println("6: Supprimer un document");
            System.out.println("7: Afficher les auteurs");
            System.out.println("8: Quitter");

            String choix = "";
            System.out.print("Votre choix: ");
            choix = sc.nextLine();
            System.out.println("------------------------------------");
            switch (choix) {
                case "1": // Créer bibliothèque (et 10 documents)
                    System.out.println("Taille de la bibliothèque entre 10 et 1000 documents):");
                    int taille = sc.nextInt();
                    bibliotheque = new Bibliotheque(taille);
                    peupleBiblio(); // créer 10 documents pour la démo
                    System.out.println("Bibliothèque créee ! Taille max:" + bibliotheque.getMaxDoc() + ". Nombre de documents:" + bibliotheque.getNbOuvrages());
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8": // fin programme
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
    }

    // remplir la bibliothèque avec 10 documents pour la démo
    private void peupleBiblio() {

    }
}
