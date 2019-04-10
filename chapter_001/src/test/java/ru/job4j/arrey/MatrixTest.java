package ru.job4j.arrey;
import org.junit.Test;
import ru.job4j.array.Matrix;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BubbleSort Test.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 9.04.19
 */
public class MatrixTest {
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}
