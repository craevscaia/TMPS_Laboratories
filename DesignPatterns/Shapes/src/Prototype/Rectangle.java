package Prototype;

public class Rectangle implements IPrototype {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public IPrototype GetClone(){
        return new Rectangle(length, height);
    }
    public void PrintDetails(){
        System.out.println("I have a rectangle with length: " + length + " and height: " + height);
    }

    public void SetLenght(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int Area(Rectangle rectangle){
        return rectangle.length * rectangle.height;
    }
}
