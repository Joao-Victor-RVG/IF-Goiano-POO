package publishs;

import java.util.ArrayList;

public class Articles extends Publishs{

    private String summary;

    public Articles(String title, ArrayList<String> author, int pages, String summary) {
        super(title, author, pages);
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}