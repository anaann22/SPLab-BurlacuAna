package demo.demo.models;

import demo.demo.services.Visitor;
import demo.demo.services.AlignStrategy;

public class Paragraph implements Element {
    private String text;

    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        alignStrategy = null;
    }

    @Override
    public void print() {
        if (alignStrategy != null)
            alignStrategy.render(text);
        else
            System.out.println("Paragraph: " + text);
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


    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}

