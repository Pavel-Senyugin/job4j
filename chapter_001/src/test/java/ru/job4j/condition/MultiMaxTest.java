package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class condition MultiMax.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 17.03.2019
 */
public class MultiMaxTest {
    @Test
    public void vhenSecondMax() {
        MultiMax chek = new MultiMax();
        int result = chek.max(1, 4, 2);
        assertThat(result, is (4));
    }
    @Test
    public void vhenSecondMax1() {
        MultiMax chek = new MultiMax();
        int result = chek.max1(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void vhenSecondMax2() {
        MultiMax chek = new MultiMax();
        int result = chek.max2(1, 4, 2);
        assertThat(result, is(4));
    }

}
