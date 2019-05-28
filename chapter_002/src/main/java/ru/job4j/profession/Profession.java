package ru.job4j.profession;

/**
 * class profession.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 24.05.19
 */

public class Profession {

    public String name;
    public String surname;
    public String education;
    public int birthday;

    public Profession() {

    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getEducation() {
        return this.education;
    }
    public int getBirthday() {
        return this.birthday;
    }
}
