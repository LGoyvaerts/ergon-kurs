package Overwrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gol on 08.02.2017.
 */
public class Input {
    private List<Shape> collection = new ArrayList<>();

    public Input() {
    }

    Input(List<Shape> shapes) {
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
        Scanner in = new Scanner(System.in);
        Input shapes = new Input();
        System.out.print("Input: ");
        String input = in.nextLine();

        while (!input.equals("0")) {

            String[] abstand = input.split("\\s+");

            String teil1 = abstand[0];
            String teil2 = abstand[1];
            String teil3 = abstand[2];


            if (teil1.equalsIgnoreCase("circle")) {
                Color undefinedColor = new Color(teil3);
                System.out.println("Created Circle");
                Shape circle = new Circle(Double.parseDouble(teil2), undefinedColor);
                shapes.add(circle);
            } else if (teil1.equalsIgnoreCase("square")) {
                Color undefinedColor = new Color(teil3);
                System.out.println("Created Square");
                Shape square = new Square(Double.parseDouble(teil2), undefinedColor);
                shapes.add(square);
            } else if (teil1.equalsIgnoreCase("rectangle")) {
                String teil4 = abstand[3];
                Color undefinedColor = new Color(teil4);
                System.out.println("Created Rectangle");

                Shape rectangle = new Rectangle(Double.parseDouble(teil2), Double.parseDouble(teil3), undefinedColor);
                shapes.add(rectangle);
            } else {
                System.out.println("Wrong input");
            }

            System.out.print("\nInput: ");
            input = in.nextLine();

        }


        for (Shape s : shapes.getShapes()) {
            System.out.println("Shape: " + s);
            System.out.println("Circumference: " + s.getCircumference());
            System.out.println("Area: " + s.getArea() + "\n");
            System.out.println("Color: " + s.getColor());
        }

        System.out.println("Collection contains " + shapes.count() + " Shapes\n");
        System.out.println("Total Circumference: " + shapes.getTotalCircumference() + "\n");
        System.out.println("Total Area: " + shapes.getTotalArea());
    }
}
