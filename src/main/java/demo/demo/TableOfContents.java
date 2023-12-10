package demo.demo;

public class TableOfContents implements Element{
    public void print() {
        System.out.println("Table of contents");
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
}
