package Bibliotheque;

public abstract class Document {
    protected int isbn;
    protected String titre;

    public Document(int isbn, String titre) {
        this.isbn = isbn;
        this.titre = titre;
    }


}
