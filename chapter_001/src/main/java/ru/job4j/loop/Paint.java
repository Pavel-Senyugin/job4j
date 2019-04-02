package ru.job4j.loop;
import java.util.function.BiPredicate;
/**
 * Class loop Paint (Рефакторинг кода).
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 29.03.2019
 */

public class Paint {
    public String rightTrl(int height) {
        return this.loopyBy(
                height,
                height,
                (row, column) -> row >= column
        );

    }
    public String leftTrl(int height) {
        return this.loopyBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }
    public String Pyramid(int height) {
        return this.loopyBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }
    private String loopyBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("*");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

}