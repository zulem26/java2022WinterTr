package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        //kullanicidan aldiginiz 4 basamakli bir sayinin
        //basamaklardaki rakamlar toplamini bulunuz

        /*Scanner scan = new Scanner(System.in);
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

         */

        // Explicit Narrowing (Basamaklardaki rakamlar toplamini Manuel Daraltma (int==>byte) olarak kullandim)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz : ");
        int sayi = scanner.nextInt();

        byte rakam = (byte) 0;
        byte rakamlarToplami = (byte) 0;

        rakam = (byte) (sayi%10);  //birler basamagini verir
        rakamlarToplami += rakam;  //0+2
        sayi /= 10;                 //10 bolundugunde int/int virgul kismi atilir

        rakam = (byte) (sayi%10);
        rakamlarToplami += rakam;
        sayi /= 10;

        rakam = (byte) (sayi%10);
        rakamlarToplami += rakam;
        sayi /=10;

        rakam = (byte) (sayi%10);
        rakamlarToplami += rakam;
        sayi /=10;

        System.out.println("Girdiginiz sayinin basamaklardaki rakamlar toplami : " + rakamlarToplami);











    }
}
