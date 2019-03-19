package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class loop CounterTest.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 18.03.2019
 */
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenFive() {
        Counter counter = new Counter();
        int result = counter.add1(0, 10);
        int expected = 5;
        assertThat(result, is(expected));
    }

}
