package Exercice1;
/*Arnaud Couturier
 * mars 2020
 * Générateur de fichier CSV
 * crée les fichiers habitationsIndiv.csv et habitationsPro.csv dans mon dossier perso bdd-csv
 * paramétrage possible du nombre de ligne à écrire et du séparateur utilisé (; par défaut)
 * */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class LaunchCreationCSV {
    final static String[] TAB_CP = {"75000", "13000", "69000", "31000", "06000",
            "44000", "34000", "67000", "33000", "59000"};
    final static String[] TAB_VILLES = {"Paris", "Marseille","Lyon","Toulouse","Nice",
            "Nantes", "Montpellier", "Strasbourg", "Bordeaux", "Lille"};
    static int nbLigne = 0;  // nombre de ligne à écrire dans le fichier CSV
    static String separateur = ";"; // séparateur de colonnes par défaut
    static String cheminPerso = System.getProperty("user.dir") + "/bdd-csv/"; // mon dossier local


    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        do {
            int choix = 30;
            do {
                System.out.println("1: Création du fichier habitation individuelle habitationsIndiv.csv");
                System.out.println("2: Création du fichier habitation professionnelle habitationsPro.csv");
                System.out.println("3: Quitter");

                choix = sc.nextInt();
            } while (choix < 1 | choix > 3);
            switch (choix) {
                case 1:
                    saisirParametres();
                    createHabIndvCSV();
                    break;
                case 2:
                    saisirParametres();
                    createHabProCSV();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
    }

    //---------------------------------------------------------------------------------------------------------

    // Saisie des paramètres utilisateurs: nombre de ligne du fichier CSV et séparateur de colonne à utiliser
    private  static void saisirParametres() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nombre de ligne ? ");
            nbLigne = sc.nextInt();
        } while (nbLigne < 0);
        sc.nextLine();

        System.out.println("Séparateur ? (défaut = " + separateur + ")");
        String choix = sc.nextLine();
        if (!choix.isEmpty()) {separateur = choix;}
    }


    // création du fichier habitationsIndiv.csv
    private static void createHabIndvCSV () {
        String fichierCSV  = "habitationsIndiv.csv";
        Random rd = new Random();

        // installation dans mon dossier perso
        File f = new File(cheminPerso + fichierCSV);

        try {
            // création du fichierCSV , écrasement de l'ancien éventuel
            FileWriter fw = new FileWriter(f, false);
            // noms des colonnes
            String txt = "nom" + separateur + "adresse" + separateur + "surface" + separateur + "nbPieces" + separateur + "piscine\n" ;
            fw.write(txt);
            for (int i = 0; i < nbLigne; i++) {
                txt = "nom" + i + separateur; // nom du propriétaire
                int rnd = rd.nextInt (TAB_CP.length); // CP + ville
                txt += TAB_CP[rnd] + " " + TAB_VILLES[rnd] + separateur +
                    (rd.nextInt(451) + 50) + separateur + // surface entre 50 et 500 m²
                    (rd.nextInt(10) + 1) + separateur + // entre 1 et 10 pièces
                    (rd.nextInt(10) == 0 ? 1 : 0) + "\n"; // 1 chance sur 10 d'avoir une piscine
                // écriture de la ligne
                fw.write(txt);
            }
            fw.close();
            System.out.println("Fichier " + fichierCSV + " créé !\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Création du fichier habitationsPro.csv
    private static void createHabProCSV () {
        String fichierCSV  = "habitationsPro.csv";
        Random rd = new Random();

        // installation dans mon dossier perso
        File f = new File(cheminPerso + fichierCSV);

        try {
            // création du fichierCSV , écrasement de l'ancien éventuel
            FileWriter fw = new FileWriter(f, false);
            // noms des colonnes
            String txt = "nom" + separateur + "adresse" + separateur + "surface" + separateur + "nbEmployes\n";
            fw.write(txt);
            for (int i = 0; i < nbLigne; i++) {
                txt = "nom" + i + separateur; // nom du propriétaire
                int rnd = rd.nextInt (TAB_CP.length); // CP + ville
                txt += TAB_CP[rnd] + " " + TAB_VILLES[rnd] + separateur +
                        (rd.nextInt(951) + 50) + separateur + // surface entre 50 et 1000 m²
                        rd.nextInt(101) + "\n"; // entre 0 et 100 employés
                // écriture de la ligne
                fw.write(txt);
            }
            fw.close();
            System.out.println("Fichier " + fichierCSV + " créé !\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
