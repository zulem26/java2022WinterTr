package day36_Inheritance;

public class Muhasebe extends Personel{

    protected int saatUcreti;
    protected String statu;
    protected int maas;


    protected int maasHesapla(){
        int mass = saatUcreti*8*30;
        return maas;
    }
}
