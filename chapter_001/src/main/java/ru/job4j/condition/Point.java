package ru.job4j.condition;

/**
 * Class Condition расстояние между точками в системе координат.
 *@author senyugin.
 *@since 9.03.2019
 */

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        /**
         * Метод вычисляет расстояние методу точками в системе координат .
         */
        return Math.sqrt((x2 - x1) - (y2 - y1));
    }

}