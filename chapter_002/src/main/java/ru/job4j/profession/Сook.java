package ru.job4j.profession;
/**
 * class Cook.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 24.05.19
 */
public class Сook extends Profession{
    /**
     * Консруктор - инициализация поля name
     */
    public Сook() {

        this.name = "Cook";
    }
    /**
     * Method fry - жарить мясо
     * @param customer - клиент
     * @return жареное мясо
     */
    public Meat fry(Customer customer) {
        return new Meat();
    }
}
