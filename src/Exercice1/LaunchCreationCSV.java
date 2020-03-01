package Exercice1;

import java.util.Scanner;

public class LaunchCreationCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        do {
            int choix = 0;
            do {
                System.out.println("1: Création du fichier habitation individuelle (défaut = habitationIndiv.csv");
                System.out.println("2: Création du fichier habitation professionnelle (défaut = habitationPro.csv");
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

    }

    private static void createHabProCSV () {

    }
}
