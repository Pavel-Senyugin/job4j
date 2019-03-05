package ru.job4j.converter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @version $Id$
 * @since 5.03.19
 */
public class ConverterTest {
    /**
     * Test add.
     * Метод метод проверки метода конвертера волюты рубли в доллары.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }
    /**
     * Test add.
     * Метод метод проверки метода конвертера волюты рубли в евро.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
    /**
     * Test add.
     * Метод метод проверки метода конвертера волюты доллары в рубли.
     */
    @Test
    public void when1DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(60));
    }
    /**
     * Test add.
     * Метод метод проверки метода конвертера волюты евро в доллары.
     */
    @Test
    public void when1EuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }
}


