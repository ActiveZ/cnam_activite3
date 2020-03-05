package Bibliotheque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibliotheque {
    Scanner sc = new Scanner(System.in);
    private List<Document> bibliotheque = new ArrayList<Document>();
    private int capacite = 1000; //nb max de documents

    ////////////////// contructeur ////////////////////////

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
    }
    /////////////////// ACCESSEURS /////////////////////////

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        if  (capacite < getNbDocuments()) {
            System.out.println("ERREUR: il y a " + getNbDocuments() + " documents dans la bibliothèque");
            System.out.println("Valeur en cours inchangée: " + this.capacite);
        } else {
            this.capacite = capacite;
            System.out.println("Nouvelle capacité de la bibliothèque: " + capacite + " documents.");
        }
    }

    //////////////////// METHODES ////////////////////////////

    // affiche tous les ouvrages de la bibliothèque
    public void afficherTousDocuments() {
        System.out.println("\nAffichage des " + getNbDocuments() + " documents de la bibliothèque:");
        for (int i = 0; i < this.getNbDocuments(); i++) {
            getDocument(i);
        }
        System.out.println("------------------------------------");

    }

    // renvoi le ième document
    public void getDocument(int i) {
        if (i > getNbDocuments()) {
            System.out.println("ERREUR: ce document n'existe pas dans la bibliothèque qui contient " + getNbDocuments() + " documents");
        } else {
            System.out.println(bibliotheque.get(i).toString());
        }
    }

    // ajouter le document, renvoi true (false si échec)
    boolean ajouter (Document doc) {return bibliotheque.add(doc);}

    // supprimer le document, renvoi true (false si échec)
    boolean supprimer (Document doc){return bibliotheque.remove(doc);}

    // affiche la liste des auteurs
    public void afficherAuteurs() {

    }

    public int getNbDocuments() {return bibliotheque.size();}

}
