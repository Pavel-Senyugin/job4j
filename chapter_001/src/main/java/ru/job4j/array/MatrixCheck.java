package ru.job4j.array;
/**
 * class MatrixCheck.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 16.04.19
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i <= data.length - 1; i++) {
            if ((data[i - 1][i - 1] != data[i][i])
                    || (data[i - 1][data.length - i] != data[i][data.length - i - 1])) {
                result = false;
                break;
            }
        }
        return result;

    }
}
