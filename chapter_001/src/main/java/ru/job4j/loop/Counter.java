package ru.job4j.loop;
/**
 * Class loop Counter.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 18.03.2019
 */

public class Counter {
    public int add(int start, int finish) {
        start = 0;
        finish = 10;
        int sum = 0;
        for (int index = 0; index <= 10; index++) {
            if (index % 2 != 0) {
                continue;
            }
            index = (2 + 4 + 6 + 8 + 10);
        }
        return sum;

    }

    public int add1(int start, int finish) {
        start = 0;
        finish = 10;
        int sum = 0;
        for (int index = 0; index <= 10; index++) {
            if (index == 5) {
                break;
            }
        }
        return sum;
    }

}