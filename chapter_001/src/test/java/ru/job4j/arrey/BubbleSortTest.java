package ru.job4j.arrey;
import org.junit.Test;
import ru.job4j.array.BubbleSort;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BubbleSort Test.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));

    }
}

