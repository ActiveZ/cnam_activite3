package Exercice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LireCSV {
    public static void main(String[] args) {
        double impotCommune = 0; //montant de l'impot total collecté par la commune

        try {
            File f = new File("bdd-csv/habitationsIndiv.csv");
            Scanner sc = new Scanner(f);
            sc.nextLine(); // on saute la 1 ere ligne = nom colonnes
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(";");
                HabitationIndividuelle h = new HabitationIndividuelle(details[1], details[2], Double.parseDouble(details[3]), Integer.parseInt(details[4]), Boolean.parseBoolean(details[5]));

                //System.out.println(line);
                impotCommune += h.getImpot();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERREUR lecture CSV");
            e.printStackTrace();
        }

        try {
            File f = new File("bdd-csv/habitationsPro.csv");
            Scanner sc = new Scanner(f);
            sc.nextLine(); // on saute la 1 ere ligne = nom colonnes
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(";");
                HabitationProfessionnelle h = new HabitationProfessionnelle(details[1], details[2], Double.parseDouble(details[3]), Integer.parseInt(details[4]));
                impotCommune += h.getImpot();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERREUR lecture CSV");
            e.printStackTrace();
        }

        System.out.println("\nLa commune va percevoir " + impotCommune + " € d'impôts.");    }
}
