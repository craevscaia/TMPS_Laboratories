public class SharpShapeFactory extends AbstractFactoryShapes{
    @Override
    public IShape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return Rectangle.getMyRectangle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return Square.getMySquare();
        }
        return null;
    }
}
