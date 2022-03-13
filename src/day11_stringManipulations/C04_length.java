package day11_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {

    public static void main(String[] args) {

        //kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("ilk harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1 = "";
        System.out.println(str1.length()); //0

        String str2 = null;
        System.out.println(str2.length()); //calistirildiginda hata verir

        String str3;
        //System.out.println(str3); //deger atamadan kod calismaz
        //str3 ile str2 ye deger atanmamistir
        //str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugunu bilir
        //ve geriye kalan kodun calismasina engel olmaz
        //str3 e bir deger atamasi olmayinca java altini kirmizi cizer
        //ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez

    }
}
