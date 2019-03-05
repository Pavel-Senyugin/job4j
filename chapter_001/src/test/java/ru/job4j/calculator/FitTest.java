package ru.job4j.calculator;
/**
 * Test.
 *
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @version $Id$
 * @since 5.03.19
 */
import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;


public class FitTest {
    /**
     * Метод closeTo сравнивает числа с плавающей точкой.
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }
    /**
     * Метод closeTo сравнивает числа с плавающей точкой.
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}

