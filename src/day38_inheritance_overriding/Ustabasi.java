package day38_inheritance_overriding;

public class Ustabasi extends Isci{
    public String statu = "Ustabasi";
    public String haklar = "Ustabasi haftada 1 gun ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa ustabasi ekstra ucret almadan calisir");
    }

    public void maasHesapla(){

        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro = " + (30*8*12)+ "Euro maas alir");
    }

    public static void main(String[] args) {
        /*
            Icinde oldugumuz Class dan klasik haliyle bir obje olusturursak o obje ile cagirdigimiz
            variable ve method larda Java once icinde bulundugumuz class a bakar aradigimiz
            class uyesi, icinde oldugumuz class da varsa bize onu getirir

            YOKSA,
            parent class(lar)a bakar, ilk buldugunu getirir
         */
        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.statu);  // Ustabasi
        System.out.println(yasin.haklar); // Ustabasi haftada 1 gun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye); //Isciler yilda bir ikramiye alir
        System.out.println(yasin.izin); // Tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();

        /*
            Eger isci olarak ozelliklerini gormek istersek
            Class adini (Data turu) Isci seceriz
         */
        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.statu);  //isci
        System.out.println(ahmet.haklar); //Isciler kidem tazminati alir
        System.out.println(ahmet.ikramiye); // Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin); // Tum personel yilda 4 defa izin kullanabilir
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
            Siz bir objeyi hangi class dan tanimlarsaniz o class a ait ozelliklere sahip olur
         */

        Personel adem = new Ustabasi();
        System.out.println(adem.statu);  //personel
        System.out.println(adem.haklar); //Tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye); // CTE verir
        System.out.println(adem.izin); // Tum personel yilda 4 defa izin kullanabilir
        adem.maasHesapla();
        adem.mesai();

        /*
        Personel adem = new Ustabasi(); Bu bir ustabasi objesidir
        Personel adem = new Personel(); Bu personel objesidir
         */

        /*
        Personel adem = new Ustabasi();

        adem in data turu Personel dir.
        boylece biz adem i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem in ustabasi oldugunu biliyorum
        cunku constructor i ustabasi
        Ama bu yazim formati ile
        adem in tum personel ile birlikte sahip oldugu ortak ozellikleri vurgulamak istiyorum

        Bu kullanim seklinde olusturulan obje data turu olarak secilen class ve onun parent
        class larindaki variable lari kullanabilir
         */
    }
}
