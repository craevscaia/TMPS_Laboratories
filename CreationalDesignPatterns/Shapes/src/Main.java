import PrototypeBuilder.AllSquares;
import PrototypeBuilder.Rectangle;
import PrototypeBuilder.ShapeBuilder;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2 );
        rectangle.PrintDetails();
        System.out.println("Area for rect1 is: " + rectangle.Area(rectangle));

        Rectangle mySecondRectangle = (Rectangle) rectangle.GetClone();
        mySecondRectangle.SetLenght(3, 5);
        mySecondRectangle.PrintDetails();
        System.out.println("Area for rect2 is: " + mySecondRectangle.Area(mySecondRectangle));

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        AllSquares squares = shapeBuilder.createSquares();
        squares.showItems();

    }
}