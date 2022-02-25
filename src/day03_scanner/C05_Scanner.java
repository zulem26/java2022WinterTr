package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        // Isim - soyisim : Zulkif Ergin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz : ");
        String soyIsim = scanner.nextLine();
        System.out.println("Isim - soyIsim : " + isim + " "+ soyIsim);



    }

}
