package demo.demo;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    public Author() {
        books = new ArrayList<>();
    }

    public Author(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }


    public void print() {
        System.out.println("Author: " + name);
        System.out.println("Books written by " + name + ":");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

