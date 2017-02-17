package test;

import Overwrite.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gol on 09.02.2017.
 */
public class ShapesTest {

    @Test
    public void test() {

        ShapeCollection shapes = new ShapeCollection();
        Color blue = new Color("blue");
        Color red = new Color("red");
        Color yellow = new Color("yellow");
        Shape rectangle = new Circle(5, blue);
        Shape circle = new Rectangle(5, 4, red);
        Shape square = new Square(4, yellow);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

        for (Shape s : shapes.getShapes()) {
            System.out.println("Shape: " + s);
            System.out.println("Circumference: " + s.getCircumference());
            System.out.println("Area: " + s.getArea() + "\n");
            System.out.println("Color: " + s.getColor());
        }


        System.out.println("Total Circumference: " + shapes.getTotalCircumference() + "\n");
        System.out.println("Total Area: " + shapes.getTotalArea() + "\n");

        for (Shape s : shapes.getShapes()) {
            if (s == null) {
                Assert.fail("Shape is null");
            }
        }

        if (shapes.getShapes().size() == 0) {
            Assert.fail("Shape Collection is null");
        } else if (shapes.getShapes().size() == 1) {
            Assert.fail("Shape Collection contains 1 element");
        } else {
            System.out.println("Shape Collection contains " + shapes.count() + " objects");
        }
    }

}
