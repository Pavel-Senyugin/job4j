package ru.job4j.array;

/**
 * class Check.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i != data.length; i++) {
            if (data[i - 1] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}