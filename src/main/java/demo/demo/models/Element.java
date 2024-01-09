package demo.demo.models;

import demo.demo.services.Visitor;

public interface Element  {

    void print();

    void add(Element e);

    void remove(Element e);

    Element get(int index);

    void accept (Visitor v);
}
