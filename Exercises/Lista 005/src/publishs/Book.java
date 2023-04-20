package publishs;

import java.util.ArrayList;

public class Book extends Publishs{

    private final String publishingHouse;
    private final String edition;
    private final String isbn;

    public Book(String title, ArrayList<String> author, int pages, String edition, String publishingHouse, String isbn) {
        super(title, author, pages);
        this.publishingHouse = publishingHouse;
        this.edition = edition;
        this.isbn = isbn;
    }

    public String getPublishingHouse() {

        return publishingHouse;
    }

    public String getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
    }
}
