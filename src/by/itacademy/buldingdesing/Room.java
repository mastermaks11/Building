package by.itacademy.buldingdesing;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 14.06.2018.
 */
public class Room<T> {
    private int area;
    private int windows;
    private String nameRoom;
    private Set<Lightbulb> bulb;
    private Set<T> furniture;

    public Room(String nameRoom, int area, int windows) {
        if (illuminationRoom(windows)) {
            this.area = area;
            this.windows = windows;
            this.nameRoom = nameRoom;
            bulb = new HashSet<>();
            furniture = new HashSet<T>();
        } else System.out.println("Нельзя создать комнату с таким освещением");
    }

    public Set<Lightbulb> getBulb() {
        return bulb;
    }

    public Set<T> getFurniture() {
        return furniture;
    }

    public int getArea() {
        return area;
    }

    public int getWindows() {
        return windows;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public boolean illuminationRoom(int windows) {
        int summBulb;
        int illum = windows * 700;
        if (illum > 4000)
            return false;
        else
            return true;

    }
}

