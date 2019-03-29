package ru.job4j.loop;
/**
 * Class loop Counter.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 18.03.2019
 */

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum += index;
            }
        }
        return sum;
    }

    public int add1(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index == 5) {
                sum += index;
                break;
            }
        }
        return sum;
    }
}