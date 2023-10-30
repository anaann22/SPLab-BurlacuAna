package demo.demo;

public class Paragraph {
    private String text;
    private Image image; // Adăugați atributul Image
    private Table table; // Adăugați atributul Table

    public Paragraph() {
        // Constructor fără argumente
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void print() {
        System.out.println(text);
        if (image != null) {
            System.out.println("Associated Image: " + image.getImageName());
        }
        if (table != null) {
            System.out.println("Associated Table: " + table.getTitle());
        }
    }
}
