package ru.job4j.loop;
/**
 * Class loop Board.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 24.03.2019
 */

public class Board {
    /**
     * Method paint - рисует шахматную доску из символов "Х" и пробелов.
     * @param width - ширина доски.
     * @param height - высота доски.
     * @return - строка в виде шахматной доски.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();

    }
}
