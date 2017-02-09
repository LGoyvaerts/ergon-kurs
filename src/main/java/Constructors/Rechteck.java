package Constructors;

/**
 * Created by gol on 08.02.2017.
 */
public class Rechteck {

    double länge;
    double breite;

    Rechteck(double meineLänge, double meineBreite) {
        länge = meineLänge;
        breite = meineBreite;
    }

    Rechteck(double quadratSeite) {
        länge = quadratSeite;
        breite = quadratSeite;
    }

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(5, 6);
        System.out.println("Rechteck\nLänge: " + rechteck.länge + " \nBreite: " + rechteck.breite);
        Rechteck quadrat = new Rechteck(5);
        System.out.println("\nQuadrat\nLänge: " + quadrat.länge + "\nBreite: " + quadrat.breite);
    }
}
