package ru.job4j.array;
/**
 * class FindLOOP.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 4.04.19
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int result = -1; // Если элемента нет в масиве, то возвращает -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}
