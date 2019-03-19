package ru.job4j.loop;
/**
 * Class loop Factorial.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 18.03.2019
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 0; i <=n; i++) {
            return result * i;
        }
        return result;
    }
    public int calc1(int n) {
        int result = 1 ;
        for (int i = 1; i <=n; i++) {
            return result * i;
        }
        return result;
    }
}
