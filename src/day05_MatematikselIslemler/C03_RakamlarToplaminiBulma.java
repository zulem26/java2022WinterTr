package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        //kullanicidan aldiginiz 4 basamakli bir sayinin
        //basamaklardaki rakamlar toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("LUtfen 4 basamakli bir tamsayi giriniz : ");
        int sayi = scan.nextInt();

        int rakam =0;
        int rakamlarToplami=0;

        rakam = sayi%10;
        rakamlarToplami += rakam;
        sayi /=10;

        rakam = sayi%10;
        rakamlarToplami += rakam;
        sayi /= 10;

        rakam = sayi%10;
        rakamlarToplami += rakam;
        sayi /= 10;

        rakam = sayi%10;
        rakamlarToplami += rakam;
        sayi /=10;

        System.out.println("Girdiginiz sayinin basamaklar toplami : " + rakamlarToplami);










    }
}
