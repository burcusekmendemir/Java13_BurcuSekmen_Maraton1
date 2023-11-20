package entity;

import enums.Cinsiyet;

import java.util.UUID;

public abstract class Person {
    String id;
    String adSoyad;
    String tcKimlik;
    int yas;
    String adres;
    String telefon;
    Cinsiyet cinsiyet;
    boolean hastaMi;
    boolean tasiyiciMi;
    boolean bulastirirMi;

    public abstract void vitaminAl();
    public abstract void hastaneyeGit();


    public Person() {
        this.id= UUID.randomUUID().toString();
    }

    public Person(String adSoyad, String tcKimlik, int yas, String adres, String telefon, Cinsiyet cinsiyet, boolean hastaMi, boolean tasiyiciMi, boolean bulastirirMi) {
        this();
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
        this.yas = yas;
        this.adres = adres;
        this.telefon = telefon;
        this.cinsiyet = cinsiyet;
        this.hastaMi = hastaMi;
        this.tasiyiciMi = tasiyiciMi;
        this.bulastirirMi = bulastirirMi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                ", yas=" + yas +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", hastaMi=" + hastaMi +
                ", tasiyiciMi=" + tasiyiciMi +
                ", bulastirirMi=" + bulastirirMi +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public boolean isHastaMi() {
        return hastaMi;
    }

    public void setHastaMi(boolean hastaMi) {
        this.hastaMi = hastaMi;
    }

    public boolean isTasiyiciMi() {
        return tasiyiciMi;
    }

    public void setTasiyiciMi(boolean tasiyiciMi) {
        this.tasiyiciMi = tasiyiciMi;
    }

    public boolean isBulastirirMi() {
        return bulastirirMi;
    }

    public void setBulastirirMi(boolean bulastirirMi) {
        this.bulastirirMi = bulastirirMi;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
