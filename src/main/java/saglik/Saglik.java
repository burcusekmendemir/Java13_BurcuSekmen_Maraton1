package saglik;

import entity.Doktor;
import entity.NormalInsan;
import entity.Person;
import entity.SuperInsan;
import enums.Cinsiyet;
import utility.Databases;

import java.util.Scanner;

public class Saglik {
    public static void main(String[] args) {

        Person normalInsan=new NormalInsan("Burcu Sekmen", "12345678987",26,"Pendik","05123456798", Cinsiyet.KADIN,false,false,false);
        Person normalInsan2=new NormalInsan("Sude Kaya", "78945612312", 28,"Kartal","05489652325", Cinsiyet.KADIN, false,false,false);
        Person normalInsan3=new NormalInsan("Ahmet Kar", "4568712548", 35,"Kadıköy","052658487856",Cinsiyet.ERKEK,true, true,false);
        Person superInsan=new SuperInsan("Mert Demir", "45871245466", 26,"Pendik","05236584846",Cinsiyet.ERKEK,false,true,false);
        Person doktor=new Doktor("Ali Kaya", "4556123487",45,"Maltepe","05648215765", Cinsiyet.ERKEK,false,false,true, "Dahiliye");

        Saglik.kisiListesineEkle(normalInsan);
        Saglik.kisiListesineEkle(normalInsan2);
        Saglik.kisiListesineEkle(normalInsan3);
        Saglik.kisiListesineEkle(superInsan);
        Saglik.kisiListesineEkle(doktor);

        Saglik.asiliListesineEkle(doktor);

        asilamaYap(normalInsan,doktor);
        asilamaYap(normalInsan2,doktor);
        asilamaYap(normalInsan3,doktor);
        asilamaYap(superInsan,doktor);

        secimYap();

    }




    public static void asilamaYap(Person insan, Person doktor){
        System.out.println();
        System.out.println("Aşılama işlemi için şartlar kontrol ediliyor...");

        for (int i = 0; i < Databases.kisiIndex; i++) {
            if (Databases.kisiListesi[i].equals(insan)){
                //Bulaştırma özelliği sadece doktora aittir. Bu sebeple doktor bulaştırıcı ve insan hem hasta değil hem de taşıyıcı değilse aşılama şartı sağlar.
                if (doktor.isBulastirirMi() && !insan.isHastaMi() && !insan.isTasiyiciMi()){
                    System.out.println(insan.getAdSoyad() + " adlı kişi için hastalığın bulaşabileceği şartlar mevcuttur. Normal insana aşılama yapılması gerekmektedir.");
                    System.out.println("Aşılama için ortam hazırlanmıştır.");
                    System.out.println(insan.getAdSoyad() + " adlı normal insan  aşılandı.");

                    asiliListesineEkle(insan);

                }else{
                    System.out.println(insan.getAdSoyad() + " adlı kişi hastalığın bulaşabileceği koşullara sahip değildir. ");
                    System.out.println(insan.getAdSoyad() + " adlı kişiye aşı yapılmasına gerek yoktur.");
                }
            }
        }
    }

    public static void asiliListesineEkle(Person person){
        Databases.asiliListesi[Databases.asiliIndex]=person;
        System.out.println();
        System.out.println(Databases.asiliListesi[Databases.asiliIndex].getAdSoyad() + " adlı kişi aşılı listesine eklenmişitr.");
        Databases.asiliIndex++;
    }


    public static void asiliListesiniGoruntule(){
        System.out.println("Aşı Olanların Listesi:");
        Person[] asililar=Databases.asiliListesi;
        for (Person person:asililar){
            if (person!=null){
                System.out.println(person.getTcKimlik() + " TC Kimlik Numaralı: " + person.getAdSoyad());
            }
        }
    }


    public static void kisiListesineEkle(Person person){
        Databases.kisiListesi[Databases.kisiIndex]=person;
        System.out.println(Databases.kisiListesi[Databases.kisiIndex].getAdSoyad() + " adlı kişi 'Kişi Listesine' eklenmiştir.");
        Databases.kisiIndex++;
    }


    public static void kisiListesiGoruntule(){
        System.out.println("Kişi Listesi:");
        Person [] kisiler=Databases.kisiListesi;
        for (Person person: kisiler){
            if (person!=null){
                System.out.println(person.getTcKimlik() + " TC Kimlik Numaralı: " + person.getAdSoyad());
            }
        }
    }

    public static void ekranaYazdir(){
        System.out.println();
        System.out.println("********************************");
        System.out.println("***** HASTANE RAPOR EKRANI *****");
        System.out.println("********************************");
        System.out.println();
        System.out.println(" 1- Kişileri Listele");
        System.out.println(" 2- Aşılı Kişileri Listele");
        System.out.println(" 3- Çıkış");
    }
    public static void secimYap (){
        ekranaYazdir();
        int secim;
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
            secim=scanner.nextInt();
            switch (secim){
                case 1: kisiListesiGoruntule();break;
                case 2: asiliListesiniGoruntule();break;
                case 0: System.out.println("Çıkış Yapılıyor.");break;
                default: System.out.println("Geçersiz seçim.");break;
            }
        } while (secim!=0);
    }



}
