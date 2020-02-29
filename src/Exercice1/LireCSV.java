package Exercice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LireCSV {
    public static void main(String[] args) {
        try {
            //File f = new File("C:/Users/arnau/IdeaProjects/cnam_activite3/bdd-csv/habitationsIndiv.csv");
            File f = new File("bdd-csv/habitationsIndiv.csv");
            Scanner sc = new Scanner(f);
            sc.nextLine(); // on saute la 1 ere ligne = nom colonnes
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(";");
                HabitationIndividuelle habitation = new HabitationIndividuelle(details[1], details[2], Double.parseDouble(details[3]), Integer.parseInt(details[4]), Boolean.parseBoolean(details[5]));

                System.out.println(line);
                System.out.println(habitation.surfaceHabitation);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
