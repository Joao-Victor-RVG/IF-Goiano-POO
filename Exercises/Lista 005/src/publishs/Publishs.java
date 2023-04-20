package publishs;

import java.util.ArrayList;

public abstract class Publishs {

    private String title;
    private ArrayList<String> author;
    private ArrayList<String> references;
    private final int pages;

    public Publishs(String title, ArrayList<String> author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public ArrayList<String> getReferences() {
        return references;
    }

    public void addReferences(String reference) {
        this.references.add(reference);
    }
}
