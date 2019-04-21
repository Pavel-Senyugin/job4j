package ru.job4j.arrey;
import org.junit.Test;
import ru.job4j.array.ArrayDuplicat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayDuplicat Test.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 21.04.19
 */
public class ArrayDuplicatTest {
    @Test
    public void whenArrayHasDuplicatesThenReturnArrayWithoutDuplicates() {
        String[] in = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] out = new String[] {"Привет", "Мир", "Супер"};
        ArrayDuplicat ad = new ArrayDuplicat();
        String[] result = ad.remove(in);
        assertThat(result, arrayContainingInAnyOrder(out));
    }

    @Test
    public void whenArrayHasAllDuplicates() {
        String[] in = new String[] {"Привет", "Привет", "Привет", "Привет", "Привет"};
        String[] out = new String[] {"Привет"};
        ArrayDuplicat ad = new ArrayDuplicat();
        String[] result = ad.remove(in);
        assertThat(result, arrayContainingInAnyOrder(out));
    }
}