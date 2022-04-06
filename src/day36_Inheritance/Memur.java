package day36_Inheritance;

public class Memur extends Muhasebe{
    public static void main(String[] args) {

        Memur memur1 = new Memur();
        // memur objesi Memur class inin objesi olmasina ragmen
        // inherit ettigi Muhasebe ve onun da Parent i olan Personel
        // class lardaki tum datalari alabilir

        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="312342483";

        System.out.println(memur1);

        //Muhasebe class indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";

        Memur memur2 = new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);
    }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
