package Bibliotheque;

public class Dictionnaire extends Document {
    private String langue;

    public Dictionnaire(int isbn, String titre, String langue) {
        super(isbn, titre);
        this.langue = langue;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}