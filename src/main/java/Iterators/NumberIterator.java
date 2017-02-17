package Iterators;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by gol on 17.02.2017.
 */
public class NumberIterator {

    private static Set<Integer> numbers = new TreeSet<>();

    public static void iterate(int x, int y) {

        for (int i = x; i <= y; i++) {
            numbers.add(i);
        }

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer s = iterator.next();
            System.out.println("Nmb: " + s);
        }

    }


    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Iterator\nVon: ");
        a = in.nextInt();
        System.out.print("Bis: ");
        b = in.nextInt();
        iterate(a, b);


    }
}
