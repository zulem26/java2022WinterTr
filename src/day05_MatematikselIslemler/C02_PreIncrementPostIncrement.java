package day05_MatematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int a=15;
        int b=++a; //once plus plus oldugu icin artirip atama yapiyor
                   //a++ olsaydi ilk once atayip sonra artiracakti

        System.out.println(b);  //16
        System.out.println(a);  //16

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3 );

        sayi3=++sayi1;

        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3 );

        System.out.println(sayi3++); //once yazdiracak sonra artiracak  (12)
                                    //once 12 yazdiracak sonra sayi3=13

        System.out.println(--sayi2); //once azalt sonra yazdir  (9)
                                    //once sayi2=9 sonra sayi2 nin son degeri yani 9 yazdirir





    }
}
