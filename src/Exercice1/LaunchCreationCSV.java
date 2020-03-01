package Exercice1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LaunchCreationCSV {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        do {
            int choix = 30;
            do {
                System.out.println("1: Création du fichier habitation individuelle habitationIndiv.csv");
                System.out.println("2: Création du fichier habitation professionnelle habitationPro.csv");
                System.out.println("3: Quitter");

                choix = sc.nextInt();
            } while (choix < 1 | choix > 3);
            switch (choix) {
                case 1:
                    createHabIndvCSV();
                    break;
                case 2:
                    createHabProCSV();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);

    }

    private static void createHabIndvCSV () {
        final String[] TAB_CP = {"75000", "13000", "69000", "31000", "06000",
                "44000", "34000", "67000", "33000", "59000"};
        final String[] TAB_VILLES = {"Paris", "Marseille","Lyon","Toulouse","Nice",
                "Nantes", "Montpellier", "Strasbourg", "Bordeaux", "Lille"};

        String fichierCSV  = "habitationIndiv.csv";
        String separateur = ";";
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int nbLigne = 0;
        do {
            System.out.println("Nombre de ligne ? ");
            nbLigne = sc.nextInt();
        } while (nbLigne < 0);
        sc.nextLine();

        System.out.println("Séparateur ? (défaut = " + separateur + ")");
        String choix = sc.nextLine();
        if (!choix.isEmpty()) {separateur = choix;}

        fichierCSV =  System.getProperty("user.dir") + "/bdd-csv/" + fichierCSV ;
        File f = new File(fichierCSV  );

        try {
            // création du fichierCSV , écrasement de l'ancien éventuel
            FileWriter fw = new FileWriter(f, false);
            // noms des colonnes
            String txt = "nom" + separateur + "adresse" + separateur + "surface" + separateur + "nbPieces" + separateur + "piscine\n" ;
            fw.write(txt);
            for (int i = 0; i < nbLigne; i++) {
                txt = "nom" + i + separateur; // nom du propriétaire
                int rnd = rd.nextInt (TAB_CP.length); // CP + ville
                txt += TAB_CP[rnd] + separateur + TAB_VILLES[rnd] + separateur +
                    (rd.nextInt(451) + 50) + separateur + // surface entre 50 et 500 m²
                    (rd.nextInt(10) + 1) + separateur + // entre 1 et 10 pièces
                    (rd.nextInt(10) == 0 ? 1 : 0) + "\n"; // 1 chance sur 10 d'avoir une piscine
                // écriture de la ligne
                fw.write(txt);
            }
        fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createHabProCSV () {

    }
}
