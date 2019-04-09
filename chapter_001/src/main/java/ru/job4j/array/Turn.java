package ru.job4j.array;

/**
 * class Turn.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */

public class Turn {
    /**
     * Method back - переворачивает значения массива задом наперед.
     * @param array - массив.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
