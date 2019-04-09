package ru.job4j.arrey;
import org.junit.Test;
import ru.job4j.array.Check;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Check Test.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
