package repository;

import entity.Person;
import utility.Databases;

public class PersonRepository implements PersonInterface {

    /**
     * Kişi listesine yeni kayıtlar eklenmek istediğinde kullanılan method.
     * @param person
     */
    @Override
    public void save(Person person) {
        Databases.kisiListesi[Databases.kisiIndex]=person;
        Databases.kisiIndex++;
    }


    /**
     * Kişileri TC Kimlik numaralarına göre bulan method.
     * @param tcKimlik
     * @return
     */
    @Override
    public Person findByTcKimlik(String tcKimlik) {
        for (Person person: Databases.kisiListesi){
            if (person.getTcKimlik().contains(tcKimlik))
                return person;
        }
        return null;
    }


    /**
     * Kişileri id numaralarına göre bulan method.
     * @param id
     * @return
     */
    @Override
    public Person findById(String id) {
        for (Person person: Databases.kisiListesi){
            if (person.getId().contains(id))
                return person;
        }
        return null;
    }


    /**
     * Kişileri ad soyadlarına göre bulan method.
     * @param adSoyad
     * @return
     */
    @Override
    public Person findByAdSoyad(String adSoyad) {
        for (Person person: Databases.kisiListesi){
            if (person.getAdSoyad().contains(adSoyad))
                return person;
        }
        return null;
    }
}
