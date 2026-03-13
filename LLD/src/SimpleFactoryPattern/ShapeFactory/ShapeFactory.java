package SimpleFactoryPattern.ShapeFactory;

import SimpleFactoryPattern.Shapes.Circle;
import SimpleFactoryPattern.Shapes.Shape;
import SimpleFactoryPattern.Shapes.Square;

import java.awt.*;

public class ShapeFactory {
    Shape shape;
    public ShapeFactory(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            shape = new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            shape = new Square();
        }
    }
    public void getShape(){
        this.shape.draw();
    }

}
