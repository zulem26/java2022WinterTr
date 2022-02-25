package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //kullanicidan ismini aliop ilk harfini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        char ilkHarf = scan.next().charAt(0);

        // charAt(index) method u parametre olarak yazdigimiz index'deki char'i bize getirir
        //String'de index 0'dan baslar

        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);


    }
}
