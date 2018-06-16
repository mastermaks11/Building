package by.itacademy.buldingdesing.interfacebulding;

import by.itacademy.buldingdesing.IlluminanceLimitExeption;
import by.itacademy.buldingdesing.SpaceLimitExeption;

/**
 * Created by user on 15.06.2018.
 */
public interface DesingBulding<T> {
    void addRoom(String name, int area, int windows) throws IlluminanceLimitExeption;

    void addBuld(int indexRoom, int Illuminance) throws IlluminanceLimitExeption;

    void addFurniture(int indexRoom, T furniture) throws SpaceLimitExeption;

    void info();
}
