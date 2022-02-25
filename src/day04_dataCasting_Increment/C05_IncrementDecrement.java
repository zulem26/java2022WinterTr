package day04_dataCasting_Increment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 20;

        System.out.println(sayi+10); //30  bu satirda artirilmadi sayi yazdirildi

        System.out.println(sayi);  //20   atama olmadigindan artirma veya azaltma kalici olmaz

        sayi = sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+=10); //40

        System.out.println(sayi); //40

        System.out.println(sayi+=10); //50
        System.out.println(sayi); //50

        //bir variable in degerini kalici olarak artirmak veya azaltmak isterseniz assignment sarttir

        System.out.println(sayi++); //50
        System.out.println(sayi);   //51

        System.out.println(++sayi);  //52
        System.out.println(sayi);  //52


    }
}
