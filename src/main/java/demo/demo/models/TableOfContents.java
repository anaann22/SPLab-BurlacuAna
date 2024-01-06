package demo.demo.models;

import demo.demo.services.Visitor;

import java.util.List;

public class TableOfContents implements Element {

    private List<String> elements;

    public void print() {
        System.out.println("Table of contents");
        for (String e: elements)
            System.out.println(e);
    }

    @Override
    public void add(Element e) {
        this.add(e);
    }

    @Override
    public void remove(Element e) {
        this.remove(e);
    }

    @Override
    public Element get(int index) {
        return this.get(index);
    }

    @Override
    public void accept(Visitor v) {
        v.visitTableOfContents(this);
    }
}

