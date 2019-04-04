package ru.job4j.arrey;

import org.junit.Test;
import ru.job4j.array.FindLoop;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FindLOOP Test.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 4.04.19
 */

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 13};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void  whenArrayHasNoElement7ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
