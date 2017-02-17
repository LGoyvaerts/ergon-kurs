package Overwrite;

import Interfaces.Polygon;

/**
 * Created by gol on 08.02.2017.
 */
public class Rectangle extends Shape implements Polygon {

    double länge;
    double breite;

    public Rectangle(double rechteckLänge, double rechteckBreite, Color color) {
        this(0, 0, rechteckLänge, rechteckBreite);
        this.color = color;
    }

    public Rectangle(double x, double y, double rechteckLänge, double rechteckBreite) {
        this.x = x;
        this.y = y;
        länge = rechteckLänge;
        breite = rechteckBreite;
    }

    public double getLänge() {
        return länge;
    }

    public void setLänge(double länge) {
        this.länge = länge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public String getKind() {
        return "It's a Rectangle";
    }

    @Override
    public double getCircumference() {
        return (2 * länge) + (2 * breite);
    }

    @Override
    public double getArea() {
        return länge * breite;
    }

    @Override
    public Box getBoundingBox() {
        return new Box(y + breite, y, x, x + länge);
    }

    @Override
    public String toString() {
        return "Rectangle[länge:" + länge + " | breite: " + breite + "]";
    }

    @Override
    public int getAmountOfEdges() {
        return 4;
    }
}
