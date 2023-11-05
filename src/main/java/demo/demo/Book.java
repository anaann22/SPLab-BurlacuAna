package demo.demo;



import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    private List<Author> authors;
    private List<Section> sections;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
        this.sections = new ArrayList<>();
    }


    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Section> getSections() {
        return sections;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addContent(Element e) {
        super.add(e);
    }

    @Override
    public void print() {
        System.out.println("Book: " + super.title);
        System.out.println("Authors: ");
        for (Author author : authors) {
            author.print();
        }

        System.out.println();

        for (Element c : super.subsections) {
            c.print();
        }
    }
}


