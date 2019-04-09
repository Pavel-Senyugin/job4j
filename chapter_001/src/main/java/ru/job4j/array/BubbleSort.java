package ru.job4j.array;
/**
 * class BubbleSort.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */

public class BubbleSort {
    /**
     * Sorts array.
     * @param array Array to sort.
     * @return Sorted array.
     */
    public int[] sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 1; i < array.length - j; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
