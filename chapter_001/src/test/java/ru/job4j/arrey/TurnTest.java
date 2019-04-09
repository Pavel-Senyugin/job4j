package ru.job4j.arrey;

import org.junit.Test;
import ru.job4j.array.Turn;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Turn Test.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {5, 9, 3, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 3, 9, 5};
        assertThat(result, is(expect));
    }
}
