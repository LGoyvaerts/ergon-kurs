package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by gol on 17.02.2017.
 */
public class CharactersTest {

    Set<Character> chars = new TreeSet<>();
    private Character a = 'a';
    private Character b = 'b';
    private Character c = 'c';
    private Character a2 = 'a';


    @Test
    public void testEquals() {

        chars.add(a);
        chars.add(b);
        chars.add(c);
        chars.add(a2);

        for (Character c : chars) {
            System.out.println(c + ", Hashcode: " + c.hashCode());
        }

        Assert.assertEquals(a, a2);


    }

    @Test
    public void testNotEquals() {
        chars.add(a);
        chars.add(b);
        chars.add(c);
        chars.add(a2);
        Assert.assertNotEquals(a, b);
    }
}
