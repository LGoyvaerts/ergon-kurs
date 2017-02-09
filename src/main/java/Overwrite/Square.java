package Overwrite;

/**
 * Created by gol on 08.02.2017.
 */
public class Square extends Shape {
    double seite;

    Square(double quadratSeite) {
        seite = quadratSeite;
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
    public String toString() {
        return "Square[seite:" + seite + "]";
    }
}
