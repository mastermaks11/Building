package by.itacademy.buldingdesing;

import by.itacademy.buldingdesing.interfacebulding.AreaRoom;

import java.util.Set;

/**
 * Created by user on 15.06.2018.
 */
public class PlanningRoomArea<T extends Furniture> implements AreaRoom {
    private Room roomBulding;
    private Set<T> furniture;

    public PlanningRoomArea(Room roomBulding) {
        this.roomBulding = roomBulding;
        this.furniture = roomBulding.getFurniture();
    }

    @Override
    public void countArea() {
        int areaSumm = 0;
        if (furniture != null) {
            for (T s : furniture)
                areaSumm += s.getArea();
            System.out.println("Площадь : " + roomBulding.getArea() + "( Занято " + areaSumm + " свободно " + (roomBulding.getArea() - areaSumm) + " или " + ((roomBulding.getArea() - areaSumm) * 100 / roomBulding.getArea()) + "%)");
        } else
            System.out.println("Площадь : " + roomBulding.getArea());
    }

    @Override
    public void countAreaInfo() {
        System.out.println("Мебель : ");
        if (furniture != null) {
            for (T s : furniture)
                System.out.println(s.getName() + " (площадь" + s.getArea() + " м^2 )");
        } else
            System.out.println("Мебели нет");

    }

    @Override
    public boolean AreaLimit(int area) {
        int totalArea = roomBulding.getArea();
        if (furniture != null)
            for (T s : furniture)
                totalArea = totalArea - s.getArea();
        if ((totalArea - area) * 100 / roomBulding.getArea() < 30)
            return false;
        else return true;

    }
}
