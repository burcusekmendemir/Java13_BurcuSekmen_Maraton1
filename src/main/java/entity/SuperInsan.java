package entity;

import enums.Cinsiyet;

public class SuperInsan extends Person {


    public SuperInsan(String adSoyad, String tcKimlik, int yas, String adres, String telefon, Cinsiyet cinsiyet, boolean hastaMi, boolean tasiyiciMi, boolean bulastirirMi) {
        super(adSoyad, tcKimlik, yas, adres, telefon, cinsiyet, hastaMi, tasiyiciMi, bulastirirMi);
    }

    @Override
    public void vitaminAl() {
        System.out.println(getClass().getSimpleName() + " adlı kişi vitamin aldı.");
    }

    @Override
    public void hastaneyeGit() {
        System.out.println(getClass().getSimpleName() + " adlı kişi hastaneye gitti.");
    }


}
