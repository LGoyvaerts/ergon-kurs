package Overwrite;

/**
 * Box with coordinates: top/left, top/right, bottom/left, bottom/right
 * Created by gol on 10.02.2017.
 */
public class Box extends Rectangle {

    public Box(double top, double bottom, double left, double right) {

        super(left, bottom, right - left, top - bottom);
    }

    public double getTop() {
        return getY() + getBreite();
    }

    public double getBottom() {
        return getY();
    }

    public double getLeft() {
        return getX();
    }

    public double getRight() {
        return getX() + getLänge();
    }
}