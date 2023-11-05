package demo.demo;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents {
    private List<String> contents;

    public TableOfContents() {
        this.contents = new ArrayList<>();
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public void addContent(String content) {
        contents.add(content);
    }
}
