package by.itacademy.buldingdesing;

import by.itacademy.buldingdesing.SpaceLimitExeption;
import by.itacademy.buldingdesing.Table;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by user on 15.06.2018.
 */
public class MainConstructorBulding {
    private final static Logger LOGGER = Logger.getLogger(MainConstructorBulding.class.getName());

    public static void main(String[] args) throws IlluminanceLimitExeption, SpaceLimitExeption {
        try {
            Building buildingFirst = new Building("Здание IT");
            buildingFirst.addRoom("Комната 1", 300, 4);
            buildingFirst.addBuld(1, 400);
            buildingFirst.addBuld(1, 250);
            buildingFirst.addBuld(1, 350);
            buildingFirst.addFurniture(1, new Chair(20, "Суперкресло"));
            buildingFirst.addFurniture(1, new Table(190, "Суперстол"));
            buildingFirst.addRoom("Комната 2", 400, 3);
            buildingFirst.addBuld(1, 100);
            buildingFirst.addFurniture(2, new Table(30, "Суперстол от Дяди Васи"));
            buildingFirst.addFurniture(2, new Chair(50, "Стул"));
            buildingFirst.addRoom("Комната 3", 700, 0);
            buildingFirst.addBuld(3, 100);
            buildingFirst.addFurniture(3, new Chair(50, "Стул"));
            buildingFirst.info();
        } catch (IlluminanceLimitExeption | SpaceLimitExeption e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }

    }
}
