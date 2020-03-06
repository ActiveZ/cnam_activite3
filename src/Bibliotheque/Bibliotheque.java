package Bibliotheque;

import javax.print.Doc;
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

    public void setCapacite(int capacite) {this.capacite = capacite;}

    //////////////////// METHODES ////////////////////////////

    // TODO: 06/03/2020 redefinir tostring
    // affiche tous les ouvrages de la bibliothèque
    public void afficherTousDocuments() {
        System.out.println("\nAffichage des " + getNbDocuments() + " documents de la bibliothèque:");
        for (Document doc : bibliotheque) {
            System.out.println(doc.toString());
        }
        System.out.println("------------------------------------");
    }

    // TODO: 06/03/2020 redefinir tostring
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
                System.out.println("Auteur: " + ((Manuel) doc).auteur);
            }
        }
        System.out.println("------------------------------------");
    }

    // ajouter le document, renvoi true (false si échec)
    boolean ajouter (Document doc) {return bibliotheque.add(doc);}

    // supprimer le document, renvoi true (false si échec)
    boolean supprimer (int isbn) {
        for (Document doc : bibliotheque) {
            if (doc.isbn == isbn) { return (bibliotheque.remove(doc)); }
        }
        return false;
    }

    public int getNbDocuments() {return bibliotheque.size();}

}
