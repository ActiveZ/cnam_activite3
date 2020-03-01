package Exercice1;

import java.util.Scanner;

public class Menu {
    private String fichierHabIndiv = ""; // "bdd-csv/habitationsIndiv.csv"; // fichier CSV des habitations individuelles (defaut)
    private String fichierHabPro =""; //"bdd-csv/habitationsPro.csv"; // fichier CSV des habitations professionnelles (defaut)
    private String chemin ="";
    private Scanner sc = new Scanner(System.in);
    private CalculImpots impots = new CalculImpots();

    public String getFichierHabIndiv() {
        return fichierHabIndiv;
    }

    public String getFichierHabPro() {
        return fichierHabPro;
    }

    private void pathHabIndiv() {
        System.out.println("Chemin du fichier CSV avec séparateur ';' (vide = défaut): ");
        sc.nextLine();
        chemin = sc.nextLine ();
        System.out.println();
        if (!chemin.isEmpty()) {fichierHabIndiv = chemin;}
        else {fichierHabIndiv = "bdd-csv/habitationsIndiv.csv";} // fichier CSV des habitations individuelles par defaut
    }

   private void pathHabPro() {
        System.out.println("Chemin du fichier CSV avec séparateur ';' (vide = défaut): ");
        sc.nextLine();
        chemin = sc.nextLine();
        System.out.println();
        if (!chemin.isEmpty()) {fichierHabIndiv = chemin;}
        else {fichierHabPro = "bdd-csv/habitationsPro.csv";} // fichier CSV des habitations professionnelles par defaut
    }

    public void menuGeneral() {
        do {
            System.out.println("1: Charger les données d'habitation à usage individuel");
            System.out.println("2: Charger les données d'habitation à usage professionnel");
            System.out.println("3: Calcul des impôts pour la commune");
            System.out.println("4: Quitter");
            int choix = 0;
            do {
                System.out.print("Votre choix: ");
                choix = sc.nextInt();
            } while (choix < 1 | choix > 4);

            switch (choix) {
                case 1: // saisie fichier CSV habitations individuelles
                    pathHabIndiv();
                    break;
                case 2: // saisie fichier CSV locaux pro
                    pathHabPro();
                    break;
                case 3: // calcul impôts
                    double impotCommune = 0;
                    System.out.println("\nImpôts perçu sur les habitations individuelles: " + String.format("%.2f", impots.impotHabIndiv(fichierHabIndiv)) + " €");
                    System.out.println("Impôts perçu sur les habitations professionnelles: " + String.format("%.2f", impots.impotHabPro(fichierHabPro)) +  " €");
                    impotCommune = impots.impotHabIndiv(fichierHabIndiv) + impots.impotHabPro(fichierHabPro);
                    // affichage du total
                    System.out.println("La commune va percevoir " + String.format("%.2f", impotCommune) + " € d'impôts.");
                    System.out.println("----------------------------------------------\n");
                    break;
                case 4: // fin programme
                    System.exit(0);
                    break;
                default: //erreur inconnue
                    System.exit(1);
                    break;
            }
        } while (true);
    }

}