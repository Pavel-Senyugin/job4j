package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Senyugin (mister.senyugi@yandex.ru)
 * @version $Id$
 * @since 10.03.19
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstMoreSecond() {
        Max maximum = new Max();
        int result = maximum.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstEqualSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 1);
        assertThat(result, is(1));
    }
}