package test;

import Overwrite.Box;
import Overwrite.Circle;
import Overwrite.Rectangle;
import Overwrite.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gol on 10.02.2017.
 */
public class BoundingBoxTest {

    private static double EPSILON = 0.0000001;


    @Test
    public void testRectangleBoundingBox() {

        Rectangle rectangle = new Rectangle(2, 3, 4, 5);
        Assert.assertEquals(2, rectangle.getX(), EPSILON);
        Assert.assertEquals(3, rectangle.getY(), EPSILON);
        Assert.assertEquals(4, rectangle.getLänge(), EPSILON);
        Assert.assertEquals(5, rectangle.getBreite(), EPSILON);

        Box boundingBox = rectangle.getBoundingBox();
        Assert.assertEquals(3 + 5, boundingBox.getTop(), EPSILON);
        Assert.assertEquals(3, boundingBox.getBottom(), EPSILON);
        Assert.assertEquals(2, boundingBox.getLeft(), EPSILON);
        Assert.assertEquals(2 + 4, boundingBox.getRight(), EPSILON);

        Box boundingBoxOfBoundingBox = boundingBox.getBoundingBox();
        Assert.assertEquals(boundingBox.getTop(), boundingBoxOfBoundingBox.getTop(), EPSILON);
        Assert.assertEquals(boundingBox.getBottom(), boundingBoxOfBoundingBox.getBottom(), EPSILON);
        Assert.assertEquals(boundingBox.getLeft(), boundingBoxOfBoundingBox.getLeft(), EPSILON);
        Assert.assertEquals(boundingBox.getRight(), boundingBoxOfBoundingBox.getRight(), EPSILON);

    }

    @Test
    public void testCircleBoundingBox() {

        Circle circle = new Circle(2, 3, 5);

        Box boundingBox = circle.getBoundingBox();
        Assert.assertEquals(3 + 5, boundingBox.getTop(), EPSILON);
        Assert.assertEquals(3 - 5, boundingBox.getBottom(), EPSILON);
        Assert.assertEquals(2 - 5, boundingBox.getLeft(), EPSILON);
        Assert.assertEquals(2 + 5, boundingBox.getRight(), EPSILON);
    }


    @Test
    public void testSquareBoundingBox() {

        Square square = new Square(2, 3, 5);

        Box boundingBox = square.getBoundingBox();
        Assert.assertEquals(3 + 5, boundingBox.getTop(), EPSILON);
        Assert.assertEquals(3, boundingBox.getBottom(), EPSILON);
        Assert.assertEquals(2, boundingBox.getLeft(), EPSILON);
        Assert.assertEquals(2 + 5, boundingBox.getRight(), EPSILON);
    }

    @Test
    public void testShapeCollectionBoundingBox() {
        int[] values = {};
        Integer min = null;
        Integer max = null;
        for (int value : values) {
            if (min == null || value < min.intValue()) {
                min = value;
            }
            if (max == null || value > max.intValue()) {
                max = value;
            }
        }


        Rectangle shapeCollection = new Rectangle(2, 3, 4, 5);
        Assert.assertEquals(2, shapeCollection.getX(), EPSILON);
        Assert.assertEquals(3, shapeCollection.getY(), EPSILON);
        Assert.assertEquals(4, shapeCollection.getLänge(), EPSILON);
        Assert.assertEquals(5, shapeCollection.getBreite(), EPSILON);


    }
}
