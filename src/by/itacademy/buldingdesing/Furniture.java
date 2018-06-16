package by.itacademy.buldingdesing;

/**
 * Created by user on 15.06.2018.
 */
public abstract class Furniture {
    private int area;
    private String name;

    public Furniture(int area, String name) {
        this.area = area;
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public String getName() {
        return name;
    }
}
