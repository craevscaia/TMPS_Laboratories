import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private static Shapes shapes = new Shapes();
    private List<Shape>shapeList;

    //default constructor
    private Shapes(){
        shapeList = new ArrayList<>();
    }

    public static Shapes getInstance(){
            if (shapes == null)
                shapes = new Shapes();

            return shapes;
    }
}
