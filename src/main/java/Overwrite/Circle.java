package Overwrite;

/**
 * Created by gol on 08.02.2017.
 */
public class Circle extends Shape {
    double radius;

    Circle(double circleRadius) {
        radius = circleRadius;
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
    public String toString() {
        return "Circle[radius:" + radius + "]";
    }
}
