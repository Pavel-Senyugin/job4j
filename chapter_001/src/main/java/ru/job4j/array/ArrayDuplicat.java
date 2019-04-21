package ru.job4j.array;

import java.util.Arrays;
/**
 * class ArrayDuplicat.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 21.04.19
 */

public class ArrayDuplicat {
    /**
     * Method remove - удаляет дубликаты в массиве
     * @param array - массив
     * @return массив без дубликатов
     */
    public String[] remove(String[] array) {
        int cutArray = array.length;
        for (int in = 0; in < cutArray; in++) {
            for (int out = in + 1; out < cutArray; out++) {
                if (array[in].equals(array[out])) {
                    array[out] = array[cutArray - 1];
                    cutArray--;
                    out--;
                }
            }

        }
        return Arrays.copyOf(array, cutArray);
    }
}
