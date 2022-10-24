# Topic: Creational Design Patterns.
## Course: Software design techniques
## Author: Craevscaia Valentina

# Theory
The best techniques employed by experienced object-oriented software engineers 
are represented by design patterns. Design patterns are solutions to common issues 
that software developers ran across when creating new applications. Many software 
developers over a sizable period of time came up with these solutions through trial and error.

One type of the design pattern that will be implemented in this laboratory work is Creational 
Design Pattern. Instead of instantiating objects directly with the new operator, these design 
patterns offer a mechanism to generate things while concealing the creation logic. 
As a result, the program has more freedom to choose which objects should be created 
for a particular use case.

Types of Creational design patterns are:
1. **Factory Method**. A creational design pattern that provides an interface for creating 
objects in a superclass, but allows subclasses to alter the type of objects that will 
be created.
2. **Abstract Factory**. A creational design pattern that lets you produce families 
of related objects without specifying their concrete classes.
3. **Builder**. A creational design pattern that lets you construct complex objects 
step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
4. **Prototype**. A creational design pattern that lets you copy existing objects without 
making your code dependent on their classes.
5. **Singleton**. A creational design pattern that lets you ensure that a class has only one instance, while providing a 
global access point to this instance.


# Objectives:
1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities and 
choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.


# Implementation description
To start with,this project is based on shapes creation. it generates different types
of shapes like sharp(ex: square) and rounded(ex:circle). Further the implementation is based on
how to manipulate with these shapes, starting with their creation and structure changing.

### Factory Method
Firstly the Factory Method was implemented. An interface IShape was created with two methods
draw() and computeArea().

````
public interface IShape {
    void draw();
    void computeArea();
}
  
````
Further the interface was implemented by different classes like Rectangle, Square and Circle.
These classes implement methods of the interface. An example of this is provided below, the same
principle is followed also in the rest of classes.

````
  public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("A square is drawn");
    }

    @Override
    public void computeArea() {
        System.out.println("The area is computed");
    }
} 
````
### Abstract Factory
Secondly, the Abstract Factory was implemented. This patterns work around a 
super-factory which creates other factories. We are going to use the previously created
Shape interface and concrete classes implementing this interface. Further,
create an abstract class to get factories for Sharp and Rounded Shape Objects.

````
public abstract class AbstractFactoryShapes {
    abstract IShape getShape(String shapeType) ;
}
````
We proceed with creating concrete Factory classes extending AbstractFactory interface
with its abstract method to generate object 
of concrete class based on given information. For instance, we have RoundedShapeFactory
and SharpShapeFactory.

````
public class RoundedShapeFactory extends AbstractFactoryShapes{
    @Override
    IShape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Circle")){
        return new Circle();
        }
        return null;
    }
}

````
SharpShapeFactory:

````
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

````
### Singleton
This pattern involves a single class which is responsible to create an object while making sure that only 
single object gets created. For instance the Rectangle class, this class provides a way to access its only object 
which can be accessed directly without need to instantiate the object of the class.
SingleObject class provides a static method to get its static instance to outside world.

````
public class Rectangle implements IShape {

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

````
To proceed with, this object creation can be followed in the SharpShapeFactory. Here the method 
getMyRectangle returns the created Rectangle.

````
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

````

### Prototype 
Prototype pattern refers to creating duplicate object while keeping performance in mind. We are
going to create an interface called IPrototype with its method getClone().

````
public interface IPrototype {
    public IPrototype GetClone();
}
````
Further, implementing the interface in a concrete class Rectangle.We created a constructor
with two parameters length and height. To proceed the implemented method return the cloned object
with those parameters.


````
public class Rectangle implements IPrototype {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public IPrototype GetClone(){
        return new Rectangle(length, height);
    }
    public void PrintDetails(){
        System.out.println("I have a rectangle with length: " + length + " and height: " + height);
    }

    public void SetLenght(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int Area(Rectangle rectangle){
        return rectangle.length * rectangle.height;
    }
}

````
Here we can observe the cloning process. A clone object rectangle is generated with 2 different
parameters and the new area si computed.

````
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2 );
        rectangle.PrintDetails();
        System.out.println("Area for rect1 is: " + rectangle.Area(rectangle));

        Rectangle mySecondRectangle = (Rectangle) rectangle.GetClone();
        mySecondRectangle.SetLenght(3, 5);
        mySecondRectangle.PrintDetails();
        System.out.println("Area for rect2 is: " + mySecondRectangle.Area(mySecondRectangle));

    }
}
````
Output:
````
I have a rectangle with length: 1 and height: 2
Area for rect1 is: 2
I have a rectangle with length: 3 and height: 5
Area for rect2 is: 15

````

### Builder
Builder pattern builds a complex object using simple objects and using a step-by-step approach.
We are going to create an Item interface representing square type items such as big squares or 
small squares and concrete classes implementing the Item interface

````
public interface IItem {
    public String name();
}

````
````
public abstract class Square implements IItem{

    @Override
    public abstract String name();
}

````
Further, we are going to create AllSquares class having ArrayList of Item and a ShapeBuilder to 
build different types of square objects by combining Item.

````
public class AllSquares {
    private List<IItem> items = new ArrayList<IItem>();

    public void addItem(IItem item){
        items.add(item);
    }

    public void showItems(){

        for (IItem item : items) {
            System.out.print("Item : " + item.name());
        }
    }
}

````
The actual builder class responsible to create square objects.
````
public class ShapeBuilder {
    public AllSquares createSquares(){
        AllSquares squares = new AllSquares();
        squares.addItem(new BigSquare());
        squares.addItem(new SmallSquare());
        return squares;
    }
}

````
To see the builder pattern the follow the code below.

````
public class Main {
    public static void main(String[] args) {
   
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        AllSquares squares = shapeBuilder.createSquares();
        squares.showItems();

    }
}
````
Output:
````
Item : Big square 
Item : Small square
````
# Conclusion
To sum up, creational design patterns enabling you to discuss a system at a higher 
level of abstraction than that of a design notation or programming 
language, design patterns make a system appear less difficult.
Just state that design patterns are merely fixes for often occurring issues in software design.