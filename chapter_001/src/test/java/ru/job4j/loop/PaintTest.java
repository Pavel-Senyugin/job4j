package ru.job4j.loop;
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * Class loop PaintTest.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 29.03.2019
 */

public class PaintTest {
    @Test
    public void wenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("*   ")
                        .add("**  ")
                        .add("*** ")
                        .add("****")
                        .toString()
                )
        );
    }
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   *")
                                .add("  **")
                                .add(" ***")
                                .add("****")
                                .toString()
                )
        );
    }
    @Test
    public void whenPyramid4() {
        Paint paint = new Paint();
        String rst = paint.Pyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   *   ")
                                .add("  ***  ")
                                .add(" ***** ")
                                .add("*******")
                                .toString()
                )
        );
    }
}
