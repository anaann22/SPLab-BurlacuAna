package demo.demo;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;
    private Book book;

    public Chapter(String name, Book book) {
        this.name = name;
        this.book = book;
        subChapters = new ArrayList<>();
    }

    public Chapter(String name) {
        this.name = name;
        subChapters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public SubChapter addSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapters.add(subChapter);
        return subChapter;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void print() {
        System.out.println("Chapter: " + name);
        if (book != null) {
            System.out.println("Belongs to Book: " + book.getTitle());
        }
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}
