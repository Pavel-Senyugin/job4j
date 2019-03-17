package ru.job4j.condition;

/**
 * Class condition MultiMax.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 17.03.2019
 */

public class MultiMax {
    public int max(int a, int b, int c) {


        int result = (a > b) ? ((a > c)? a : c) : ((b > c) ?  b : c);

        return result;
    }
    public int max1(int a, int b, int c) {

        int result = (b > a) ? ((b > c) ? b : c) : ((a > c) ? a : c);

        return  result;

    }
    public int max2(int a, int b, int c) {

        int result = (c > b) ? ((c > a) ? c : a) : ((b > a) ? b : a);

        return result;
    }
}

