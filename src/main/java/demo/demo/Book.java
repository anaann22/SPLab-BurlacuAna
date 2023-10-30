package demo.demo;

public class Book {
    private String title;
    private Author author;
    private TableOfContents tableOfContents;
    private Chapter chapter;

    public Book() {
    }

    public Book(String title, Author author, Chapter chapter) {
        this.title = title;
        this.author = author;
        this.tableOfContents = new TableOfContents();
        this.chapter = chapter;
    }


    public Book(String title) {
        this.title = title;
        // Constructor fără argumente pentru cazul în care nu există un capitol
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void addChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    // Metoda pentru afișarea conținutului cărții
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getName());
        System.out.println("Table of Contents:");
        tableOfContents.print();
        System.out.println("Chapters:");
        chapter.print();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", tableOfContents=" + tableOfContents +
                ", chapter " + chapter +
                '}';
    }
}
