package demo.demo;

public class Image {
    private String imageName;
    private Paragraph paragraph; // Adăugați atributul Paragraph

    public Image() {
    }

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public void print() {
        System.out.println("Image: " + imageName);
        if (paragraph != null) {
            System.out.println("Associated Paragraph: " + paragraph.getText());
        }
    }
}
