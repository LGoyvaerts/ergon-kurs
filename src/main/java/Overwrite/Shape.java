package Overwrite;

/**
 * Created by gol on 08.02.2017.
 */
public abstract class Shape {
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
}

