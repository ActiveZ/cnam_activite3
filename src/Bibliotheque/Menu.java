package Bibliotheque;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Bibliotheque bibliotheque = new Bibliotheque(1000);;

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
                    choix = sc.nextLine();
                    // vérification par regex que capacité est bien un nombre entier positif >= nb  documents de la bibliothèque
                    if (choix.matches("\\d+") && (Integer.parseInt(choix) >= bibliotheque.getNbDocuments())) {
                        bibliotheque.setCapacite(Integer.parseInt(choix));
                        System.out.println("Nouvelle capacité de la bibliothèque: " + bibliotheque.getCapacite() + " documents.");
                    } else {
                        System.out.println("ERREUR : Valeur: " + choix + " incorrecte !");
                    }
                    break;
                case "2": // Afficher tous les ouvrages
                    bibliotheque.afficherTousDocuments();
                    break;
                case "3": // Afficher le nième document
                    System.out.println("il y a " + bibliotheque.getNbDocuments() + " documents dans la bibliothèque");
                    System.out.print( "Lequel voulez-vous afficher ? ");
                    choix = sc.nextLine();
                    if (choix.matches("\\d+") && (Integer.parseInt(choix) <= bibliotheque.getNbDocuments())) {
                        bibliotheque.getDocument(Integer.parseInt(choix));
                    } else {
                        System.out.println("ERREUR : Valeur: " + choix + " incorrecte !");
                    }
                    break;
                case "4": // Ajouter un document
                    System.out.print("Quel type de document voulez-vous ajouter ? (1: Roman, 2: Manuel, 3: Revue, 4: Dictionnaire): ");
                    choix = sc.nextLine();
                    switch (choix) {
                        case "1": //ajout roman
                            int isbn, nbPages, prixLitteraire;
                            String titre, auteur;

                            // saisie ISBN
                            System.out.print("Numéro ISBN du document: ");
                            choix = sc.nextLine();
                            if (choix.matches("\\d+")) { isbn = Integer.parseInt(choix);}
                            else {
                                System.out.println("ERREUR : Numéro ISBN: " + choix +  " incorrect !");
                                System.out.println("------------------------------------");
                                break;
                            }

                            // saisie titre
                            System.out.print("Titre du document: ");
                            titre = sc.nextLine();

                            //saisie auteur
                            System.out.print("Nom de l'auteur: ");
                            auteur = sc.nextLine();

                            //saisie nb pages
                            System.out.print("Nombre de pages: ");
                            choix = sc.nextLine();
                            if (choix.matches("\\d+")) { nbPages = Integer.parseInt(choix);}
                            else {
                                System.out.println("ERREUR : Nombre de pages: " + choix +  " incorrect !");
                                System.out.println("------------------------------------");
                                break;
                            }

                            //saisie prix littéraire
                            System.out.println("Prix littéraire: ");
                            for (int i = 0; i < Roman.tabPrixLitteraire.length; i++) {
                                System.out.println(i + ": " + Roman.tabPrixLitteraire[i]);
                            }
                            System.out.print("Choix: ");
                            choix = sc.nextLine();
                            if (choix.matches("\\d+") && Integer.parseInt(choix) < Roman.tabPrixLitteraire.length) { prixLitteraire = Integer.parseInt(choix);}
                            else {
                                System.out.println("ERREUR : Choix prix littéraire: " + choix + " incorrect !");
                                System.out.println("------------------------------------");
                                break;
                            }
                            // création du document et ajout à la bibliothèque
                            Roman doc = new Roman(isbn, titre,auteur, nbPages, prixLitteraire);
                            bibliotheque.ajouter(doc);
                            System.out.println("Document ajouté à la bibliothèque avec succès !");
                            System.out.println("------------------------------------");
                            break;
                        case "2": //ajout manuel
                            break;
                        case "3": //ajout revue
                            break;
                        case "4": //ajout dictionnaire
                            break;
                        default:
                            System.out.println("ERREUR : Valeur: " + choix + " incorrecte !");
                            break;
                    }
                    break;
                case "5": // Supprimer un document
                    System.out.print( "Entrez le numéro ISBN du document à supprimer: ");
                    choix = sc.nextLine();
                    if (choix.matches("\\d+")) { // vérification par regex que choix est bien un nombre entier positif
                        if (bibliotheque.supprimer(Integer.parseInt(choix))) { System.out.println("Document supprimé !"); }
                        else { System.out.println("ERREUR: échec de la suppression, ce numéro ISBN n'exite pas !");}
                    } else {
                        System.out.println("ERREUR : Valeur: " + choix + " incorrecte !");
                    }
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
