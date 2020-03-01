package Exercice1;

import java.io.File;
import java.util.Scanner;

public class Menu {
    private String fichierHabIndiv = ""; // fichier CSV des habitations individuelles
    private  final String FICHIER_HAB_INDIV_DEFAUT = "bdd-csv/habitationsIndiv.csv";
    private String fichierHabPro = "";// fichier CSV des habitations professionnelles
    private final String FICHIER_HAB_PRO_DEFAUT = "bdd-csv/habitationsPro.csv";
    private Scanner sc = new Scanner(System.in);
    private CalculImpots impots = new CalculImpots();

//    // Teste existence du fichier
//    private boolean fichierExiste (String monFichier) {
//        File f = new File(monFichier);
//        return (f.exists() && !f.isDirectory());
//    }

//    // Acquisition du fichier CSV des habitations individuelles
//    private void pathHabIndiv() {
//        String fichier ="";
//        System.out.println("Chemin du fichier CSV avec séparateur ';' (vide = défaut): ");
//        sc.nextLine();
//        fichier = sc.nextLine ();
//        System.out.println();
//        if (!fichier.isEmpty()) {fichierHabIndiv = fichier;}
//        else {fichierHabIndiv = "bdd-csv/habitationsIndiv.csv";} // fichier CSV des habitations individuelles par defaut
//    }
//
//    // Acquisition du fichier CSV des locaux professionnels
//   private void pathHabPro() {
//        String fichier ="";
//        System.out.println("Chemin du fichier CSV avec séparateur ';' (vide = défaut): ");
//        sc.nextLine();
//        fichier = sc.nextLine();
//        System.out.println();
//        if (!fichier.isEmpty()) {fichierHabIndiv = fichier;}
//        else {fichierHabPro = "bdd-csv/habitationsPro.csv";} // fichier CSV des habitations professionnelles par defaut
//    }

    private String acquisitionFichier() {
        //String fichier ="";
        System.out.println("Chemin du fichier CSV avec séparateur ';' (vide = défaut): ");
        sc.nextLine();
        String fichier = sc.nextLine();
        System.out.println();
        File f = new File(fichier);
        if (f.exists() && !f.isDirectory()) {return fichier;} //fichier valide }
        else {
            System.out.println("FICHIER INEXISTANT ! Chargement du fichier par défaut\n");
            return "";
        }}

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
                    //pathHabIndiv();
                    fichierHabIndiv = acquisitionFichier();
                    if (fichierHabIndiv == "") {fichierHabIndiv = FICHIER_HAB_INDIV_DEFAUT;}
                    break;
                case 2: // saisie fichier CSV locaux pro
                    //pathHabPro();
                    fichierHabPro = acquisitionFichier();
                    if (fichierHabPro == "") {fichierHabPro = FICHIER_HAB_PRO_DEFAUT;}
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
