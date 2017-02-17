package Overwrite;

import Interfaces.Polygon;

/**
 * Created by gol on 08.02.2017.
 */
public class Circle extends Shape implements Polygon {
    double radius;

    public Circle(double circleRadius, Color color) {
        this(0, 0, circleRadius);
        this.color = color;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String getKind() {
        return "It's a Circle";
    }

    @Override
    public double getCircumference() {
        return radius * Math.PI * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Box getBoundingBox() {
        return new Box(y + radius, y - radius, x - radius, x + radius);
    }

    @Override
    public String toString() {
        return "Circle[radius:" + radius + "]";
    }

    @Override
    public int getAmountOfEdges() {
        return 0;
    }


}
