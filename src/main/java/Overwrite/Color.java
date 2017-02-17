package Overwrite;

/**
 * Created by gol on 17.02.2017.
 */
public class Color {
    private String name;
    int hashCode;

    public Color(String name, int hashCode) {
        this.name = name;
        this.hashCode = hashCode;
    }

    public Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Color other = (Color) obj;
        return this.name.equals(other.name);
    }
}
