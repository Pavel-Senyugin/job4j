package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class loop FactorialTest.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 18.03.2019
 */

public class FactorialTest {
    @Test
    //тест, проверяющий, что факториал для числа 5 равен 120.
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(0));
    }
    @Test
    // тест, проверяющий, что факториал для числа 0 равен 1.
    public void whenCalculateFactorialForFiveThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc1(0);
        assertThat(result, is(1));
    }
}
