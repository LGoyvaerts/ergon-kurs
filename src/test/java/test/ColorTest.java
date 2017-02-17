package test;

import Overwrite.Color;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gol on 17.02.2017.
 */
public class ColorTest {
    Color blue = new Color("blue", 1);
    Color red = new Color("red", 2);
    Color yellow = new Color("yellow", 3);
    Color y2 = new Color("yellow", 3);

    @Test
    public void test() {

        Set<Color> colors = new HashSet<>();
        colors.add(yellow);
        colors.add(blue);
        colors.add(red);
        colors.add(yellow);
        colors.add(y2);

        for (Color c : colors) {
            System.out.println(c + ", Hashcode: " + c.hashCode());
        }
    }

    @Test
    public void equalsTest() {

        Assert.assertNotEquals(blue, yellow);
    }

    @Test
    public void equalsTest2() {

        Assert.assertEquals(yellow, y2);
    }
}
