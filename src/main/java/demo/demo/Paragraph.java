package demo.demo;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
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
        System.out.println("Cannot add to a Paragraph");
    }

    @Override
    public void remove(Element e) {
        System.out.println("Cannot remove from a Paragraph");
    }

    @Override
    public Element get(int index) {
        System.out.println("Cannot get from a Paragraph");
        return null;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
}
