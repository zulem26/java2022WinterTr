package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {

    public static void main(String[] args) {

        /*Kullanicidan 100 uzerinden notunu isteyin
            Notu harf sistemine cevirip yazdirin
            50 den kucukse "D"
            50-60 arasi "C"
            60-80 arasi "B"
            80 in uzerinde ise "A"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfe notunuzu giriniz : ");
        double notSayi = scan.nextDouble();


        if (notSayi<0 || notSayi>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        }
        else if (notSayi<50){
            System.out.println("notunuz D");
        } else if (notSayi<60){
            System.out.println("notunuz C");
        } else if (notSayi<80){
            System.out.println("notunuz B");
        } else {
            System.out.println("notunuz A");
        }
    }
}
