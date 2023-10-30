package demo.demo;

public class Table {
    private String title;
    private Paragraph paragraph; // Adăugați atributul Paragraph

    public Table() {
        // Constructor fără argumente
    }

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public void print() {
        System.out.println("Table Title: " + title);
        if (paragraph != null) {
            System.out.println("Associated Paragraph: " + paragraph.getText());
        }
    }
}
