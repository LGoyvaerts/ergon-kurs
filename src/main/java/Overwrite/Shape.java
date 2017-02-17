package Overwrite;

/**
 * Created by gol on 08.02.2017.
 */
public abstract class Shape {
    double x;
    double y;
    double top;
    double bottom;
    double left;
    double right;
    Color color;
    //---- Methods

    /**
     * Returns a name describing the kind
     *
     * @return a string identifying the kind of shape
     */
    public abstract String getKind();

    /**
     * Returns the circumference of the shape
     *
     * @return the circumference
     */
    public abstract double getCircumference();

    /**
     * Returns the area of the shape
     *
     * @return the area
     */
    public abstract double getArea();

    /**
     * Returns the shape's x coordinate.  *  * @return the x coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the shape's y coordinate.  *  * @return the y coordinate.
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the shape's coordinates.  *  * @param x the new x coordinate.  * @param y the new y coordinate.
     */

    /**
     * Returns the bounding box of the shape.  *  * @return a box that completely covers the shape.
     */
    public abstract Box getBoundingBox();

    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getTop() {
        return getTop();
    }

    public Color getColor() {
        return color;
    }

}

