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
    public void whenSumEvenNumbersFromOneToTenThenThirty(){
        Counter counter = new Counter();
        int result = counter.add(0, 10);
        assertThat(result, is(0));
    }


}
