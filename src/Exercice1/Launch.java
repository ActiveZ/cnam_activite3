package Exercice1;

import java.util.ArrayList;

public class Launch {
    public static void main(String[] args) {
        double impotHabitation = 0; //impot de l'habitation (individuelle ou pro)
        double impotCommune = 0; //montant de l'impot total collecté par la commune
        ArrayList<Habitation> tabloHabitations = new ArrayList<Habitation>(); //tableau des habitations

        // création de 2 habitations individuelles
        HabitationIndividuelle hIndiv1 = new HabitationIndividuelle("Picsou","rue de la Paix", 200, 10, true);
        HabitationIndividuelle hIndiv2 = new HabitationIndividuelle("Donald","rue du Canard", 100, 5, false);

        // création d'une habitation professionelle
        HabitationProfessionnelle hPro = new HabitationProfessionnelle("Boss", "rue de l'industrie", 200, 15);

        //ajout des 3 habitations dans la liste tabloHabitation
        tabloHabitations.add(hIndiv1);
        tabloHabitations.add(hIndiv2);
        tabloHabitations.add(hPro);

        // Lecture du tableau et calcul de l'impot perçu par la commune
        for (Habitation h : tabloHabitations) {
            System.out.println("\nDescriptif:");
            h.affiche();
            System.out.println("Impots: " + h.getImpot() + " €");
            impotCommune += h.getImpot();
        }

        System.out.println("\nLa commune va percevoir " + impotCommune + " € d'impôts.");
    }
}
