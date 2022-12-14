public class RoundedShapeFactory extends AbstractFactoryShapes{
    @Override
    IShape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Circle")){
        return new Circle();
        }
        return null;
    }
}
