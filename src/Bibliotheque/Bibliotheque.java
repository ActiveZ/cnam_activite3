package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Document> bibliotheque = new ArrayList<Document>();
    private final int MAX_DOC = 1000; // valeur max par défaut si instanciation ou modification hors limites [1..1000]
    private int maxDoc = 0; //nb max de documents

    ////////////////// contructeur ////////////////////////
    public Bibliotheque(int maxDoc) {
        setMaxDoc(maxDoc);
        this.maxDoc = getMaxDoc();
    }

    /////////////////// ACCESSEURS /////////////////////////
    public int getMaxDoc() {
        return maxDoc;
    }

    public void setMaxDoc(int maxDoc) {
        if (maxDoc < 1 | maxDoc > MAX_DOC) {
            System.out.println("ERREUR: la nombre maximum de documents doit être compris entre 1 et 1000");
            if (maxDoc == 0) { // cas de l'intanciation invalide
                System.out.println("Application de la valeur par défaut: " + MAX_DOC);
                this.maxDoc = MAX_DOC;
            } else { // cas de modification invalide
                System.out.println("Valeur en cours inchangée: " + maxDoc);
            }
        }
    }
    //////////////////// METHODES ////////////////////////////

    // affiche tous les ouvrages de la bibliothèque
    public void afficherDocuments() {

    }

    // renvoi le ième document
    public void getDocument(int i) {
        if (i > nbOuvrages()) {
            System.out.println("ERREUR: ce document n'existe pas dans la bibliothèque qui contient " + nbOuvrages() + " documents");
        } else {
            System.out.println(bibliotheque.get(i).toString());
        }
    }

    // ajouter le document, renvoi true (false si échec)
    boolean ajouter (Document doc) {

        return  true;
    }

    // supprimer le document, renvoi true (false si échec)
    boolean supprimer (Document doc){

        return true;
    }

    // affiche la liste des auteurs
    public void afficherAuteurs() {

    }

    public boolean bibliothequeExiste() { return maxDoc != 0;}

    private int nbOuvrages() {return bibliotheque.size();}

}
