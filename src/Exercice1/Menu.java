package Exercice1;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class Menu {
    private String fichierHabIndiv = ""; // fichier CSV des habitations individuelles
    private  final String FICHIER_HAB_INDIV_DEFAUT = "bdd-csv/habitationsIndiv.csv";
    private String fichierHabPro = "";// fichier CSV des habitations professionnelles
    private final String FICHIER_HAB_PRO_DEFAUT = "bdd-csv/habitationsPro.csv";
    private Scanner sc = new Scanner(System.in);
    private CalculImpots impots = new CalculImpots();

    // Acquisition des fichiers CSV de l'utilisateur et vérification validité
    private String acquisitionFichier() {
        System.out.println("Chemin du fichier CSV avec séparateur ';' (vide = défaut): ");

        // Boite de dialogue pour choisir le fichier
        JFileChooser dialogue = new JFileChooser(new File("."));
        File fichier = null;

        if (dialogue.showOpenDialog(null)==
                JFileChooser.APPROVE_OPTION) {
            fichier = dialogue.getSelectedFile();
            return fichier.getPath();
        }
        //else if (dialogue.showOpenDialog(null)==JFileChooser.CANCEL_OPTION) {System.out.println("Annulation" );}
        return ""; // si annulation
    }

    public void menuGeneral() {
        do {
            System.out.println("1: Charger les données d'habitation à usage individuel");
            System.out.println("2: Charger les données d'habitation à usage professionnel");
            System.out.println("3: Calcul des impôts pour la commune");
            System.out.println("4: Quitter");
            String choix = "";
            do {
                System.out.print("Votre choix: ");
                choix = sc.nextLine();
            } while (!choix.equals("1") && !choix.equals("2") && !choix.equals("3") && !choix.equals("4"));

            switch (Integer.valueOf(choix)) {
                case 1: // saisie fichier CSV habitations individuelles
                    fichierHabIndiv = acquisitionFichier();
                    if (fichierHabIndiv == "") {fichierHabIndiv = FICHIER_HAB_INDIV_DEFAUT;}
                    break;
                case 2: // saisie fichier CSV locaux pro
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
