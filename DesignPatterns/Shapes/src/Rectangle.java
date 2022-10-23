public class Rectangle implements Shape{

    private static final Rectangle myRectangle = new Rectangle();
    private Rectangle(){

    }
    @Override
    public void draw() {
        System.out.println("A rectangle is drawn");
    }

    @Override
    public void computeArea() {
        System.out.println("The area is computed");
    }

    public static Rectangle getMyRectangle(){
     return myRectangle;
    }
}
