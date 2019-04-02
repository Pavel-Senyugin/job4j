package ru.job4j.arrey;
import org.junit.Test;
import ru.job4j.array.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class arrey SquareTest.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 02.04.2019
 */

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        assertThat(rst, is(expect));

    }
    @Test
    public void whenBound0Then0() {
        int bound = 0;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new  int[] {};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound1Then1() {
        int bound = 1;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1};
        assertThat(rst, is(expect));
    }
}
