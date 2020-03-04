package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Document> bibliotheque = new ArrayList<Document>();
    private final int MAX_DOC = 1000; // valeur max par défaut si instanciation ou modification hors limites [10..1000]
    // TODO: 05/03/2020 compteur statique pr nb instanciation  et eviter ecrasement involantaire de la biblio en cours

    private final int MIN_DOC = 10; // valeur min par défaut

    private int maxDoc = 1000; //nb max de documents
    ////////////////// contructeur ////////////////////////

    public Bibliotheque(int maxDoc) {
        setMaxDoc(maxDoc);
        this.maxDoc = getMaxDoc();
    }
    /////////////////// ACCESSEURS /////////////////////////

    public int getMIN_DOC() {
        return MIN_DOC;
    }

    public int getMaxDoc() {
        return maxDoc;
    }

    public void setMaxDoc(int maxDoc) { // errreur cas ou < au nb deja presents
        if (maxDoc < MIN_DOC | maxDoc > MAX_DOC) {
            System.out.println("ERREUR: la nombre maximum de documents doit être compris entre " + MIN_DOC + " et " + MAX_DOC);
            if (maxDoc == 0) { // cas de l'intanciation invalide
                System.out.println("Application de la valeur max par défaut: " + MAX_DOC);
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
        if (i > getNbOuvrages()) {
            System.out.println("ERREUR: ce document n'existe pas dans la bibliothèque qui contient " + getNbOuvrages() + " documents");
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

    //public boolean existe() { return maxDoc != 0;} // évite une double instanciation...inutile + erreur => mettre compteur statique

    public int getNbOuvrages() {return bibliotheque.size();}

}
