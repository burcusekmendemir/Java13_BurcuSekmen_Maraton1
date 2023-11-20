package repository;

import entity.Person;

public interface PersonInterface {

    void save(Person person);
    Person findByTcKimlik(String tcKimlik);
    Person findById(String id);
    Person findByAdSoyad(String adSoyad);
}
