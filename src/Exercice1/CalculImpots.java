package Exercice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculImpots {
    private final String SEPARATEUR = ";"; // séparateur des données du fichier CSV


    // traitement des habitations indivduelles
    public double impotHabIndiv (String fichierHabIndiv) {
        double impotCommune = 0; //montant de l'impot collecté par la commune
        File f = new File(fichierHabIndiv);
        if (!f.exists() | f.isDirectory()) {return 0;} //fichier invalide }
        try {
            Scanner sc = new Scanner(f);
            sc.nextLine(); // on saute la 1 ere ligne = nom colonnes

            // lecture de chaque ligne du fichier
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(SEPARATEUR);
                // nomProrietaire - adresse - surface - nb de pieces - piscine
                HabitationIndividuelle h = new HabitationIndividuelle(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]), Boolean.parseBoolean(details[4]));
                // calcul de l'impôt
                impotCommune += h.getImpot();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERREUR lecture CSV");
            e.printStackTrace();
        }
    return impotCommune;
    }


    // traitement des locaux professionnels
    public double impotHabPro (String fichierHabPro) {
        double impotCommune = 0; //montant de l'impot collecté par la commune
        File f = new File(fichierHabPro);
        if (!f.exists() | f.isDirectory()) {return 0;} //fichier invalide }
        try {
            Scanner sc = new Scanner(f);
            sc.nextLine(); // on saute la 1 ere ligne = nom colonnes

            // lecture de chaque ligne du fichier
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(SEPARATEUR);
                // nomProrietaire - adresse - surface - nb d'employés
                HabitationProfessionnelle h = new HabitationProfessionnelle(details[0], details[1], Double.parseDouble(details[2]), Integer.parseInt(details[3]));
                // calcul de l'impôt
                impotCommune += h.getImpot();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERREUR lecture CSV");
            e.printStackTrace();
        }
    return impotCommune;
    }
}
