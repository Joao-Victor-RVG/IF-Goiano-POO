package publishs;

import java.util.ArrayList;

public class Theses extends Publishs {

    private String summary;
    private String thesisDefense;
    private String academia;


    public Theses(String title, ArrayList<String> author, int pages) {
        super(title, author, pages);
    }
}
