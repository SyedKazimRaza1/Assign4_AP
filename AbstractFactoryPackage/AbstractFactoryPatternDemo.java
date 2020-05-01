package AbstractFactoryPackage;

/*
I am using this design pattern because purpose of the Abstract Factory is to provide an interface for creating families of related objects, without specifying concrete classes.
In this example we are getting different shapes without telling the user our design. User only enter the name of the shape and get it.

 */


public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();

    }
}
