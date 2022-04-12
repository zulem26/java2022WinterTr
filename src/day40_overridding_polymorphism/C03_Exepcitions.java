package day40_overridding_polymorphism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args){
        //Kullanicidan iki sayi alip bolerek sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        int kontrol =0;
        while (kontrol!=2){
            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1 = scan.nextInt();

            System.out.println("Kaca bolmek istediginiz sayiyi yaziniz");
            int sayi2 = scan.nextInt();
            try {
                System.out.println("sonuc = " + sayi1/sayi2);
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("girdiginiz sayilarda sorun var");
            }
            System.out.println("devam etmek icin 1 \nbitirmek icin 2 ye basin");
            kontrol=scan.nextInt();
        }


        /*
            Sayi2  0 oldugunda sayi1/0 tanimsiz olacagindan Java bu durumla karsilasinca
            exception verir
            Java nin yazdigi mesajda exception ne tur bir sorun oldugu
            Neden kaynaklandigi ve hangi satirda olustugu yazar
            Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at day40_overridding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:16)

        if (sayi2==0){
            System.out.println("Sayi/0 tanimsizdir");
        }else{
            System.out.println("sonuc = " + sayi1/sayi2);
        }

        System.out.println("sonuc = " + sayi1/sayi2);

        AMa bu yontem her sorunda calismaz
         */

    }
}
