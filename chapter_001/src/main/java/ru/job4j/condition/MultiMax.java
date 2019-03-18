package ru.job4j.condition;

/**
 * Class condition MultiMax.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 17.03.2019
 */

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        result = result > second ? result : second;
        result = result > third ? result : third;
        return result;
    }
    public int max1(int first, int second, int third) {
        int result = second;
        result = result > first ? result : first;
        result = result > third ? result : third;
        return result;

    }
    public int max2(int first, int second, int third) {
        int result = third;
        result = result > second ? result : second;
        result = result > first ? result : first;
        return result;

    }
}

