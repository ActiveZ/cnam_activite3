package Exercice3;

import java.util.Scanner;

public class Menu {
    public void afficheMenu() {
        Scanner sc = new Scanner((System.in));
        String nom; // nom de la surface
        double r, l, L, h;
        String choix = "";

        do {
            do {
                System.out.println("1: Calcul de la surface d'un cercle");
                System.out.println("2: Calcul de la surface d'un carré");
                System.out.println("3: Calcul de la surface d'un trapèze");
                System.out.println("4: Quitter");
                System.out.print("choix: ");

                choix = sc.nextLine();
            } while (!choix.equals("1") && !choix.equals("2") && !choix.equals("3") && !choix.equals("4"));

            switch (Integer.valueOf(choix)) {
                case 1: // surface du cercle
                    System.out.print("\nNom du cercle: ");
                    sc.nextLine();
                    nom = sc.nextLine();
                    System.out.print("Rayon du cercle: ");
                    r = sc.nextDouble();
                    Cercle cercle = new Cercle(nom,r);
                    System.out.println("Le cercle " + cercle.getNomFigure() + " a une surface de " + cercle.calculSurface());
                    System.out.println("------------------------------------------------\n");
                    break;

                case 2: // surface du carré
                    System.out.print("\nNom du carré: ");
                    sc.nextLine();
                    nom = sc.nextLine();
                    System.out.print("Longueur du côté du carré: ");
                    l = sc.nextDouble();
                    Carre carre = new Carre(nom,l);
                    System.out.println("Le carré " + carre.getNomFigure() + " a une surface de " + carre.calculSurface());
                    System.out.println("------------------------------------------------\n");
                    break;

                case 3: // surface du trapèze
                    System.out.print("\nNom du trapèze: ");
                    sc.nextLine();
                    nom = sc.nextLine();
                    System.out.print("Longueur de la petite base du trapèze: ");
                    l = sc.nextDouble();
                    System.out.print("Longueur de la grande base du trapèze: ");
                    L = sc.nextDouble();
                    System.out.print("Longueur de la hauteur du trapèze: ");
                    h = sc.nextDouble();
                    Trapeze trapeze = new Trapeze(nom, l, L, h);
                    System.out.println("Le trapèze " + trapeze.getNomFigure() + " a une surface de " + trapeze.calculSurface());
                    System.out.println("------------------------------------------------\n");
                    break;

                case 4:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
    }
}
