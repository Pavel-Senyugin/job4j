package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 * @author senyugin
 * @since 5.03.2019
 */

public class Fit {
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {

        return (height - 100) * 1.15;
    }

    public double womanWeight(double height) {

        return (height - 110) * 1.15;
    }
}
