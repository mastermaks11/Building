package by.itacademy.buldingdesing;

import by.itacademy.buldingdesing.interfacebulding.DesingBulding;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 14.06.2018.
 */
public class Building<T extends Furniture> implements DesingBulding<T> {

    private Map<Integer, Room> building;
    private String name;
    private int indexRoom;
    private PlanningRoomArea planningRoomArea;

    public Building(String name) {
        this.name = name;
        building = new HashMap<>();
    }

    @Override
    public void addRoom(String name, int area, int windows) throws IlluminanceLimitExeption {
        if (windows < 6) {
            Room room = new Room(name, area, windows);
            building.put(++indexRoom, room);
        } else throw new IlluminanceLimitExeption("the lighting limit is exceeded");
    }

    @Override
    public void addBuld(int indexRoom, int illuminance) throws IlluminanceLimitExeption {
        PlanningRoomIllumination planningRoomIllumination = new PlanningRoomIllumination(building.get(indexRoom));
        if (planningRoomIllumination.illuminanceLimite(illuminance))
            building.get(indexRoom).getBulb().add(new Lightbulb(illuminance));
        else
            throw new IlluminanceLimitExeption("the lighting limit is exceeded");
    }

    @Override
    public void addFurniture(int indexRoom, T furniture) throws SpaceLimitExeption {
        PlanningRoomArea planningRoomArea = new PlanningRoomArea(building.get(indexRoom));
        if (planningRoomArea.AreaLimit(furniture.getArea()))
            building.get(indexRoom).getFurniture().add(furniture);
        else
            throw new SpaceLimitExeption("Exceeded limin room space");
    }

    @Override
    public void info() {
        System.out.println(name);
        for (int i = 1; i <= indexRoom; i++) {
            PlanningRoomArea planningRoomArea = new PlanningRoomArea(building.get(i));
            PlanningRoomIllumination planningRoomIllumination = new PlanningRoomIllumination(building.get(i));
            System.out.println(building.get(i).getNameRoom());
            planningRoomIllumination.illuminanceCountInfo();
            planningRoomArea.countAreaInfo();
            planningRoomArea.countArea();
        }
    }

    public Map<Integer, Room> getBuilding() {
        return building;
    }

    public String getName() {
        return name;
    }

    public int getIndexRoom() {
        return indexRoom;
    }

}
