package Bibliotheque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibliotheque {
    Scanner sc = new Scanner(System.in);
    private List<Document> bibliotheque = new ArrayList<Document>();
    private int capacite = 1000; //nb max de documents
    private final String tirets = "------------------------------------------------------------";

    ////////////////// contructeur ////////////////////////

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
    }

    /////////////////// ACCESSEURS /////////////////////////

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {this.capacite = capacite;}

    //////////////////// METHODES ////////////////////////////

    // affiche tous les ouvrages de la bibliothèque
    public void afficherTousDocuments() {
        System.out.println("Affichage des " + getNbDocuments() + " documents de la bibliothèque:");
        for (Document doc : bibliotheque) {
            System.out.println(doc.toString());
        }
        System.out.println(tirets);
    }

    // renvoi le ième document
    public void getDocument(int i) {
        if (i > getNbDocuments()) {
            System.out.println("ERREUR: ce document n'existe pas dans la bibliothèque qui contient " + getNbDocuments() + " documents");
        } else {
            System.out.println(bibliotheque.get(i).toString());
        }
    }

    // affiche la liste des auteurs
    public void afficherTousAuteurs() {
        System.out.println("Liste des auteurs:");
        for (Document doc : bibliotheque) {
            if (doc instanceof Manuel) {
                System.out.println(((Manuel) doc).auteur);
            }
        }
        System.out.println(tirets);
    }

    // ajouter le document, renvoi true (false si échec)
    public boolean ajouter (Document doc) {return bibliotheque.add(doc);}

    // supprimer le document par son numéro isbn, renvoi true (false si échec)
    public boolean supprimer (int isbn) {
        for (Document doc : bibliotheque) {
            if (doc.isbn == isbn) { return (bibliotheque.remove(doc)); }
        }
        return false;
    }

    public int getNbDocuments() {return bibliotheque.size();}

}
