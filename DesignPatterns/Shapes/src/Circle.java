public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("A circle is drawn");
    }

    @Override
    public void computeArea() {
        System.out.println("The area is computed");
    }
}
