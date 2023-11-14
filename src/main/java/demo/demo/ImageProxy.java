package demo.demo;

public class ImageProxy implements Element  {

    private Image realImage;
    private String name;
    public ImageProxy(String name){
        this.name = name;
        realImage = null;
    }

    public Image loadImage(){
        if(realImage == null){
            realImage = new Image(name);
        }
        return realImage;
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    public void print(){
        this.loadImage();
        this.realImage.print();
    }

}
