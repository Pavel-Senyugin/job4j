package ru.job4j.array;
/**
 * Class Square.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 02.04.2019
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}
