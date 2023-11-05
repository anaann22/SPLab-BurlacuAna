package demo.demo;



import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    protected String title;
    protected List<Element> subsections;

    public Section(String name) {
        this.title = name;
        this.subsections = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void add(Element element) {
        subsections.add(element);
    }

    @Override
    public void remove(Element element) {
        subsections.remove(element);
    }

    @Override
    public Element get(int index) {
        if (index >= 0 && index < subsections.size()) {
            return subsections.get(index);
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element element : subsections) {
            element.print();
        }
    }
}

