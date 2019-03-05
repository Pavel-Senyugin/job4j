package ru.job4j.calculator;
/**
 * Test.
 *
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @version $Id$
 * @since 5.03.19
 */
import org.junit.Test;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1d, 1d);
        double expected = 2d;
        assertThat(result, is(expected));
    }
    @Test
    public void whenOddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.odd(1d, 1d);
        double expected = 1d - 1d;
        assertThat(result, is(expected));
    }
    @Test
    public void whenEddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.edd(1d, 1d);
        double expected = 1d * 1d;
        assertThat(result, is(expected));
    }
    @Test
    public void whenUddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.udd(1d, 1d);
        double expected = 1d / 1d;
        assertThat(result, is(expected));
    }
}
