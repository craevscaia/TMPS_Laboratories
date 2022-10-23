package Prototype;

public class ShapeBuilder {
    public AllSquares createSquares(){
        AllSquares squares = new AllSquares();
        squares.addItem(new BigSquare());
        squares.addItem(new SmallSquare());
        return squares;
    }
}
