package Overwrite;

import Interfaces.Polygon;

/**
 * Created by gol on 08.02.2017.
 */
public class Square extends Shape implements Polygon {
    double seite;

    public Square(double quadratSeite, Color color) {
        this(0, 0, quadratSeite);
        this.color = color;
    }

    public Square(double x, double y, double seite) {
        this.x = x;
        this.y = y;
        this.seite = seite;
    }

    @Override
    public String getKind() {
        return "It's a Square";
    }

    @Override
    public double getCircumference() {
        return 4 * seite;
    }

    @Override
    public double getArea() {
        return seite * seite;
    }

    @Override
    public Box getBoundingBox() {
        return new Box(y + seite, y, x, x + seite);
    }

    @Override
    public String toString() {
        return "Square[seite:" + seite + "]";
    }

    @Override
    public int getAmountOfEdges() {
        return 4;
    }
}
