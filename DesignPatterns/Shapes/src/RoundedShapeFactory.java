public class RoundedShapeFactory extends AbstractFactoryShapes{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Circle")){
        return new Circle();
        }
        return null;
    }
}
