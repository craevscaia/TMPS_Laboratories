public class Square implements IShape {
    private static final Square mySquare = new Square();
    private Square(){};
    public static IShape getMySquare() {
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
