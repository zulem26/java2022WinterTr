package day40_overridding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    // Kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
    // toplam 500 u gecerse programi bitirsein veya
    // kullanici bitirmek istediginde Q'ya basmalidir

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam=0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \nbitirmek icin Q'ya basiniz");
            int sayi = 0;


            try {
                sayi = scan.nextInt();
                toplam += sayi;

            } catch (InputMismatchException e) {

                String hataliGiris = scan.next();
                if (hataliGiris.equalsIgnoreCase("q")){
                    System.out.println("girdiginiz sayilarin toplami : " + toplam);
                    break;
                } else{
                    System.out.println("hatali giris");
                }
            }


        }while(toplam<500);

    }
}
