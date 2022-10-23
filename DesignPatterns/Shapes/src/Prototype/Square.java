package Prototype;

public class Square implements IPrototype{
    @Override
    public IPrototype GetClone() {
        return new Square();
    }
}
