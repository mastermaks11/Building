package by.itacademy.buldingdesing;

import by.itacademy.buldingdesing.interfacebulding.IlluminationRoom;

import java.util.Set;

/**
 * Created by user on 15.06.2018.
 */
public class PlanningRoomIllumination implements IlluminationRoom {
    private Room roomBulding;
    private Set<Lightbulb> buld;

    public PlanningRoomIllumination(Room room) {
        this.roomBulding = room;
        buld = room.getBulb();
    }

    @Override
    public void illuminanceCountInfo() {

        int summ = 0;
        System.out.print("Освещенность :" + illuminanceCount() + " лк ");
        if (roomBulding.getWindows() > 0)
            System.out.print(roomBulding.getWindows() + " окон по 700 лк ");
        else
            System.out.print(" Окон комната не имеет");
        for (Lightbulb s : buld) {
            System.out.print("Лампочка " + s.getIlluminance() + " лк ");
        }
        if (illuminanceCount() < 300) {
            System.out.println(" ");
            System.out.println("Необходимо в комнату добавить хотя бы одну лампочку " + (300 - illuminanceCount()) + " лк ");
        }
        System.out.println(" ");
    }


    private int illuminanceCount() {
        int summIlluminance = 0;
        summIlluminance = roomBulding.getWindows() * 700;
        for (Lightbulb s : buld) {
            summIlluminance = summIlluminance + s.getIlluminance();
        }
        return summIlluminance;
    }

    @Override
    public boolean illuminanceLimite(int ligth) {
        boolean limiteLingth;
        int summIlluminance = 0;
        summIlluminance = roomBulding.getWindows() * 700;
        if (buld != null)
            for (Lightbulb s : buld) {
                summIlluminance = summIlluminance + s.getIlluminance();
            }
        summIlluminance += ligth;
        if (summIlluminance > 4000)
            limiteLingth = false;
        else limiteLingth = true;
        return limiteLingth;
    }
}


