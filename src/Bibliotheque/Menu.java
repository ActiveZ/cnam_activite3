package Bibliotheque;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Bibliotheque bibliotheque = new Bibliotheque(1000);
    int isbn, nbPages;
    String titre, auteur;

    public void menuGeneral() {

        peupleBiblio(); // créer 8 documents pour la démo
        System.out.println("Bibliothèque créée ! Capacité: " + bibliotheque.getCapacite() + " documents. Nombre de documents actuels: " + bibliotheque.getNbDocuments());
        System.out.println("------------------------------------------------------------");

        do { // boucle du menu général
            System.out.println("1: Modifier capacité bibliothèque");
            System.out.println("2: Afficher tous les ouvrages");
            System.out.println("3: Afficher le nième document");
            System.out.println("4: Ajouter un document");
            System.out.println("5: Supprimer un document");
            System.out.println("6: Afficher les auteurs");
            System.out.println("7: Quitter");

            String choix = "";
            System.out.print("Votre choix: ");
            choix = sc.nextLine();
            System.out.println("------------------------------------");
            switch (choix) {

                case "1": // Modifier capacité bibliothèque"
                    System.out.print("Entrez la nouvelle capacité de la bibliothèque (mini:" + bibliotheque.getNbDocuments() + "): ");
                    int newCapacite = saisirChoix();
                    if (newCapacite == 0 || newCapacite < bibliotheque.getNbDocuments()) { break; }
                    bibliotheque.setCapacite(Integer.parseInt(choix));
                    System.out.println("Nouvelle capacité de la bibliothèque: " + bibliotheque.getCapacite() + " documents.");
                    break;

                case "2": // Afficher tous les ouvrages
                    bibliotheque.afficherTousDocuments();
                    break;

                case "3": // Afficher le nième document
                    System.out.println("il y a " + bibliotheque.getNbDocuments() + " documents dans la bibliothèque");
                    System.out.print( "Lequel voulez-vous afficher ? ");
                    int posDoc = saisirChoix();
                    choix = sc.nextLine();
                    if (posDoc <= bibliotheque.getNbDocuments()) { bibliotheque.getDocument(posDoc); }
                    else { System.out.println("ERREUR : Valeur: " + choix + " incorrecte !"); }
                    System.out.println("------------------------------------");
                    break;

                case "4": // Ajouter un document
                    System.out.print("Quel type de document voulez-vous ajouter ? (1: Roman, 2: Manuel, 3: Revue, 4: Dictionnaire): ");
                    choix = sc.nextLine();
                    switch (choix) {

                        case "1": //ajout roman
                            // saisie ISBN
                            System.out.print("Numéro ISBN du document: ");
                            isbn = saisirChoix();
                            if (isbn == 0) { break; }

                            // saisie titre
                            System.out.print("Titre du document: ");
                            titre = sc.nextLine();

                            //saisie auteur
                            System.out.print("Nom de l'auteur: ");
                            auteur = sc.nextLine();

                            //saisie nb pages
                            System.out.print("Nombre de pages: ");
                            nbPages = saisirChoix();
                            if (nbPages == 0) { break; }

                            //saisie prix littéraire
                            System.out.println("Prix littéraire: ");
                            for (int i = 0; i < Roman.tabPrixLitteraire.length; i++) {
                                System.out.println(i + ": " + Roman.tabPrixLitteraire[i]);
                            }
                            System.out.print("Choix: ");
                            int prixLitteraire = saisirChoix();
                            if (prixLitteraire == 0) { break; }

                            // création du document et ajout à la bibliothèque
                            Roman roman = new Roman(isbn, titre,auteur, nbPages, prixLitteraire);
                            bibliotheque.ajouter(roman);
                            System.out.println("Document ajouté à la bibliothèque avec succès !");
                            System.out.println("------------------------------------");
                            break;

                        case "2": //ajout manuel
                            // saisie ISBN
                            System.out.print("Numéro ISBN du document: ");
                            isbn = saisirChoix();
                            if (isbn == 0) { break; }

                            // saisie titre
                            System.out.print("Titre du document: ");
                            titre = sc.nextLine();

                            //saisie auteur
                            System.out.print("Nom de l'auteur: ");
                            auteur = sc.nextLine();

                            //saisie nb pages
                            System.out.print("Nombre de pages: ");
                            nbPages = saisirChoix();
                            if (nbPages == 0) { break; }

                            //saisie niveau scolaire
                            System.out.print("Niveau scolaire: ");
                            int niveauScolaire = saisirChoix();
                            if (niveauScolaire == 0) { break; }

                            // création du document et ajout à la bibliothèque
                            Manuel manuel = new Manuel(isbn, titre, auteur, nbPages, niveauScolaire);
                            bibliotheque.ajouter(manuel);
                            System.out.println("Document ajouté à la bibliothèque avec succès !");
                            System.out.println("------------------------------------");
                            break;

                        case "3": //ajout revue
                            // saisie ISBN
                            System.out.print("Numéro ISBN du document: ");
                            isbn = saisirChoix();
                            if (isbn == 0) { break; }

                            // saisie titre
                            System.out.print("Titre du document: ");
                            titre = sc.nextLine();

                            // saisie mois de parution
                            System.out.print("Mois de parution: ");
                            int moisParution = saisirChoix();
                            if (moisParution == 0 || moisParution > 12) {break;}

                            // saisie année de parution
                            System.out.print("Année de parution: ");
                            int anneeParution = saisirChoix();
                            if (anneeParution == 0) {break;}

                            // création du document et ajout à la bibliothèque
                            Revue revue = new Revue(isbn, titre, moisParution, anneeParution);
                            bibliotheque.ajouter(revue);
                            System.out.println("Document ajouté à la bibliothèque avec succès !");
                            System.out.println("------------------------------------");
                            break;

                        case "4": //ajout dictionnaire
                            // saisie ISBN
                            System.out.print("Numéro ISBN du document: ");
                            isbn = saisirChoix();
                            if (isbn == 0) { break; }

                            // saisie titre
                            System.out.print("Titre du document: ");
                            titre = sc.nextLine();

                            // saisie langue de parution
                            System.out.print("Langue: ");
                            String langue =sc.nextLine();
                            if (langue.isEmpty()) { break; }


                            // création du document et ajout à la bibliothèque
                            Dictionnaire dico = new Dictionnaire(isbn, titre, langue);
                            bibliotheque.ajouter(dico);
                            System.out.println("Document ajouté à la bibliothèque avec succès !");
                            System.out.println("------------------------------------");
                            break;

                        default:
                            System.out.println("ERREUR : Valeur: " + choix + " incorrecte !");
                            break;
                    }
                    break;

                case "5": // Supprimer un document
                    System.out.print( "Entrez le numéro ISBN du document à supprimer: ");
                    isbn = saisirChoix();
                    if (bibliotheque.supprimer(isbn)) { System.out.println("Document supprimé !"); }
                    else { System.out.println("ERREUR: échec de la suppression, ce numéro ISBN n'exite pas !");}
                    System.out.println("------------------------------------");
                    break;

                case "6": // Afficher les auteurs
                    bibliotheque.afficherTousAuteurs();
                    break;

                case "7": // fin programme
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (true);
    }

    // Transforme String choix en entier >= 0 et retourne 0 si erreur
    private int saisirChoix() {
        String choix;
        choix = sc.nextLine();
        // vérification par regex que choix est bien un nombre entier positif
        if (choix.matches("\\d+")) { return Integer.parseInt(choix);}
        System.out.println("ERREUR : Valeur: " + choix +  " non valide !");
        System.out.println("------------------------------------");
        return 0;
    }

    // remplir la bibliothèque avec 8 documents pour la démo
    private void peupleBiblio() {
        Roman roman1 = new Roman(565454,"Titre roman 1","Auteur Roman 1",100,0);
        bibliotheque.ajouter(roman1);

        Roman roman2 = new Roman(824686,"Titre roman 2","Auteur Roman 2",200,1);
        bibliotheque.ajouter(roman2);

        Manuel manuel1 = new Manuel(625415, "Manuel 1", "Emmanuel",110,1);
        bibliotheque.ajouter(manuel1);

        Manuel manuel2 = new Manuel(123456, "Manuel 2", "Emmanuelle",210,1);
        bibliotheque.ajouter(manuel2);

        Revue revue1 = new Revue(547554,"Pif gadget",1,1980);
        bibliotheque.ajouter(revue1);

        Revue revue2 = new Revue(268465,"La vie du rail",12,1970);
        bibliotheque.ajouter(revue2);

        Dictionnaire dico1 = new Dictionnaire(265581,"Dico1","Breton");
        bibliotheque.ajouter(dico1);

        Dictionnaire dico2 = new Dictionnaire(655718,"Dico2","Javanais");
        bibliotheque.ajouter(dico2);
    }
}
