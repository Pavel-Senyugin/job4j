package ru.job4j.array;
/**
 * class Matrix.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 10.04.19
 */
public class Matrix {
    /**
     * Multiple table.
     * @param size Size of table.
     * @return Multiple table.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

}
