package entity;

import enums.Cinsiyet;
import utility.Databases;

public class NormalInsan extends Person {

    String hastalik;

    public NormalInsan() {
    }

    public NormalInsan(String adSoyad, String tcKimlik, int yas, String adres, String telefon, Cinsiyet cinsiyet, boolean hastaMi, boolean tasiyiciMi, boolean bulastirirMi) {
        super(adSoyad, tcKimlik, yas, adres, telefon, cinsiyet, hastaMi, tasiyiciMi, bulastirirMi);
    }

    public NormalInsan(String adSoyad, String tcKimlik, int yas, String adres, String telefon, Cinsiyet cinsiyet, boolean hastaMi, boolean tasiyiciMi, boolean bulastirirMi, String hastalik) {
        super(adSoyad, tcKimlik, yas, adres, telefon, cinsiyet, hastaMi, tasiyiciMi, bulastirirMi);
        this.hastalik = hastalik;
    }

    @Override
    public String toString() {
        return "NormalInsan{" +
                "hastalik='" + hastalik + '\'' +
                '}';
    }

    @Override
    public void vitaminAl() {
        System.out.println(getClass().getSimpleName() + " adlı kişi vitamin aldı.");
    }

    @Override
    public void hastaneyeGit() {
        System.out.println(getClass().getSimpleName() + " adlı kişi hastaneye gitti.");
    }

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hastalik) {
        this.hastalik = hastalik;
    }



}
