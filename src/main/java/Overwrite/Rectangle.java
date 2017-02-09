package Overwrite;

/**
 * Created by gol on 08.02.2017.
 */
public class Rectangle extends Shape {
    double länge;
    double breite;

    Rectangle(double rechteckLänge, double rechteckBreite) {
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
    public String toString() {
        return "Rectangle[länge:" + länge + " | breite: " + breite + "]";
    }
}
