package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Senyugin (mister.senyugi@yandex.ru)
 * @version $Id$
 * @since 10.03.19
 */

public class DummyBotTest {

    @Test
    public void whenGreedBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."), is("Привет, умник."));
    }
    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."), is("До скорой встречи."));
    }
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Сколько будет 2 + 2?"), is("Это ставит меня в тупик. Задайте другой вопрос."));

    }

}
