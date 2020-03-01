package Exercice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LireCSV {
    public static void main(String[] args) {
        //final String separateur = ";"; // séparateur des données du fichier CSV
        //double impotCommune = 0; //montant de l'impot total collecté par la commune
        //String fichierHabIndiv = "bdd-csv/habitationsIndiv.csv"; // fichier CSV des habitations individuelles (defaut)
        //String fichierHabPro = "bdd-csv/habitationsPro.csv";// fichier CSV des habitations professionnelles (defaut)

        Menu menu = new Menu();
        menu.menuGeneral();

//        // traitement des habitations indivduelles
//        try {
//            File f = new File(fichierHabIndiv);
//            Scanner sc = new Scanner(f);
//            sc.nextLine(); // on saute la 1 ere ligne = nom colonnes
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                String[] details = line.split(separateur);
//                // nomProrietaire - adresse - surface - nb de pieces - piscine
//                HabitationIndividuelle h = new HabitationIndividuelle(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), Boolean.parseBoolean(details[4]));
//                // calcul de l'impôt
//                impotCommune += h.getImpot();
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("ERREUR lecture CSV");
//            e.printStackTrace();
//        }
//
//        // traitement des locaux professionnels
//        try {
//            File f = new File(fichierHabPro);
//            Scanner sc = new Scanner(f);
//            sc.nextLine(); // on saute la 1 ere ligne = nom colonnes
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                String[] details = line.split(separateur);
//                // nomProrietaire - adresse - surface - nb d'employés
//                HabitationProfessionnelle h = new HabitationProfessionnelle(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]));
//                // calcul de l'impôt
//                impotCommune += h.getImpot();
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("ERREUR lecture CSV");
//            e.printStackTrace();
//        }
//
//        // affichage du résultat
//        System.out.println("\nLa commune va percevoir " + String.format("%.2f", impotCommune) + " € d'impôts.");
       }
}
