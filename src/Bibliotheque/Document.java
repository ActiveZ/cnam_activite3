package Bibliotheque;

public abstract class Document {
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    protected int isbn;
    protected String titre;

    public Document(int isbn, String titre) {
        this.isbn = isbn;
        this.titre = titre;
    }


    public String toString() {
        if (this instanceof Roman) {
            return "ISBN: " +this.isbn + " - " +
                    "Roman: \"" + this.titre + "\" écrit par: " +
                    ((Roman) this).getAuteur() + " - " +
                    ((Roman) this).getNbPages() + " pages. Prix littéraire: " +
                    ((Roman) this).getPrixLitteraire();
        }
        else if (this instanceof Manuel) {
            return "ISBN: " +this.isbn + " - " +
                    "Manuel: \"" + this.titre + "\" écrit par: " +
                    ((Manuel) this).getNiveauScolaire() + " - " +
                    ((Manuel) this).getNbPages() + " pages. Niveau scolaire: " +
                    ((Manuel) this).getNiveauScolaire();
        }
        else if (this instanceof Revue) {
            return "ISBN: " +this.isbn + " - " +
                    "Revue: \"" + this.titre + "\" - Date de parution: " +
                    ((Revue) this).getMois() + "/" +
                    ((Revue) this).getAnnee();
        }
        else if (this instanceof Dictionnaire) {
            return "ISBN: " +this.isbn + " - " +
                    "Dictionnaire: \"" + this.titre + "\" Langue: " +
                    ((Dictionnaire) this).getLangue();
        }
        return null;
    }
}
