package ru.job4j.converter;

import sun.awt.SunHints;

/**
 * Class Converter решение задачи 3.2. Конвертер валюты.[#112337].
 *@author senyugin.
 *@since 5.03.2019
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value = 1;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;

    }
    /**
     * Конвертируем евро в рубли.
     * @param value рубли.
     * @return рубли.
     */
    public int euroToRuble(int value) {
        return value * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
        return value = 60;
    }
}
