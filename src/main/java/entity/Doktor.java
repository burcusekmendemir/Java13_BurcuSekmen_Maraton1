package entity;

import enums.Cinsiyet;

public class Doktor extends Person  {

    public final String departmanAdi;

    public Doktor(String departmanAdi){
        this.departmanAdi=departmanAdi;
    }


    public Doktor(String adSoyad, String tcKimlik, int yas, String adres, String telefon, Cinsiyet cinsiyet, boolean hastaMi, boolean tasiyiciMi, boolean bulastirirMi, String departmanAdi) {
        super(adSoyad, tcKimlik, yas, adres, telefon, cinsiyet, hastaMi, tasiyiciMi, bulastirirMi);
        this.departmanAdi = departmanAdi;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "departmanAdi='" + departmanAdi + '\'' +
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




}
