package day05_MatematikselIslemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi = 10;
        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println(sayi); //12
        //eger 11. ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        //java iki islemden once hangisini yapacagini bilmek ister
        //once artirir sonra yazdirirsak java yeni degeri yazdirir
        //ama once yazdirir sonra artirirsak bu durumda eski deger yazdirilir.

        System.out.println(++sayi); //13  once artirir sonra yazdirir


    }
}
