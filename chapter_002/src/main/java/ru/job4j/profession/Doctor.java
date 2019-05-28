package ru.job4j.profession;
/**
 * class Doctor.
 * @author Pavel Senyugin (mister.senyugin@yandex.ru)
 * @since 24.05.19
 */
public class Doctor extends Profession  {

    /**
     * Консруктор - инициализация поля name
     */
    public Doctor() {
        this.name = "Doctor";
    }
    /**
     * Method heal - лечить пациента
     * @param patient - пациент
     * @return диагноз
     */
    public Diagnosis heal(Patient patient) {
        return new Diagnosis();
    }

}
