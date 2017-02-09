package Overwrite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gol on 08.02.2017.
 */
public class ShapeCollection {
    private List<Shape> collection = new ArrayList<>();

    ShapeCollection() {
    }

    ShapeCollection(List<Shape> shapes) {
        collection = shapes;
    }

    public List<Shape> getShapes() {
        return collection;
    }
    //----Methods

    /**
     * Adds a shape to the collection
     *
     * @param shape the shape to add to the collection
     */
    public void add(Shape shape) {
        collection.add(shape);
    }

    /**
     * Removes all shapes from the collection
     * <p>
     * The collection is reset to its (empty) initial state
     */
    public void clear() {
        collection.clear();
    }

    /**
     * Returns the number of shapes in the collection
     *
     * @return the number of shapes currently maintained
     */
    public int count() {
        return collection.size();
    }


    /**
     * 11
     * <p>
     * Returns the sum of all shape circumferences.  *  * @return the sum of all shape circumferences in this collection.
     */
    public double getTotalCircumference() {
        double total = 0;
        for (Shape s : collection) {
            total += s.getCircumference();
        }
        return total;
    }

    /**
     * Returns the sum of all shape areas.  *  * @return the sum of all shape areas in this collection.
     */
    public double getTotalArea() {
        double total = 0;
        for (Shape s : collection) {
            total += s.getArea();
        }
        return total;
    }

    public static void main(String[] args) {
        Shape rectangle = new Circle(5);
        Shape circle = new Rectangle(5, 4);
        Shape square = new Square(4);
        ShapeCollection shapes = new ShapeCollection();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

        for (Shape s : shapes.getShapes()) {
            System.out.println("Shape: " + s);
            System.out.println("Circumference: " + s.getCircumference());
            System.out.println("Area: " + s.getArea() + "\n");
        }

        System.out.println("Collection contains " + shapes.count() + " Shapes\n");
        System.out.println("Total Circumference: " + shapes.getTotalCircumference() + "\n");
        System.out.println("Total Area: " + shapes.getTotalArea());
    }
}
