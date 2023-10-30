package demo.demo;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String title;
    private List<Table> tables; // Modificați tipul la List<Table>
    private TableOfContents tableOfContents;
    private List<Paragraph> paragraphs; // Modificați tipul la List<Paragraph>
    private List<Image> images; // Modificați tipul la List<Image>

    public SubChapter(String title) {
        this.title = title;
        this.tables = new ArrayList<>();
        this.tableOfContents = null; // Poate fi un singur obiect TableOfContents
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
    }

    public void addTable(Table table) { // Modificați argumentul la Table
        tables.add(table);
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public void addParagraph(Paragraph paragraph) { // Modificați argumentul la Paragraph
        paragraphs.add(paragraph);
    }

    public void addImage(Image image){ // Modificați argumentul la Image
        images.add(image);
    }

    public void print() {
        System.out.println("SubChapter: " + title);

        // Afișarea obiectelor Table
        for (Table table : tables) {
            table.print();
        }

        // Afișarea obiectului TableOfContents
        if (tableOfContents != null) {
            tableOfContents.print();
        }

        // Afișarea obiectelor Paragraph
        for (Paragraph paragraph : paragraphs) {
            paragraph.print();
        }
    }
}
