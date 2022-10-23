public class Square implements Shape{
    private static final Square mySquare = new Square();
    private Square(){};
    public static Shape getMySquare() {
        return mySquare;
    }

    @Override
    public void draw() {
        System.out.println("A square is drawn");
    }

    @Override
    public void computeArea() {
        System.out.println("The area is computed");
    }
}
