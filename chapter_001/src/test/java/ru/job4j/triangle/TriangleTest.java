package ru.job4j.triangle;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
import java.awt.*;
/**
 * @author Pavel Senyugin (mister.senyugi@yandex.ru)
 * @version $Id$
 * @since 14.03.19
 */



public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);
        double triangleArea = triangle.area();
        double expected = 2D;
        assertThat(triangleArea, closeTo(expected, 0.1));
    }
}
