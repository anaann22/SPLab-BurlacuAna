package demo.demo;

public class TableOfContents {
    private Book book;

    public TableOfContents(Book book) {
        this.book = book;
    }

    public TableOfContents() {

    }

    public void print() {
        System.out.println("Table of Contents for " + book.getTitle());
        // Aici puteți adăuga logica pentru a afișa cuprinsul efectiv, cum ar fi capitolele și paginile.
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
