package ru.job4j.arrey;
import org.junit.Test;
import ru.job4j.array.ArrayChar;
import  static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayChar Test.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */
public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}
