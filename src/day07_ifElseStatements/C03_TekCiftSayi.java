package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz ");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("girdiginiz tamsayi cifttir");
        }
        if (sayi%2!=0){
            System.out.println("girdiginiz sayi tektir");
        }


        //normalde bir tamsayi ya tektir yada cifttir, ucuncu bir durum yoktur
        //o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        //if else ile tek statement da yapmak daha guzel olur
        // =============If else ile cozum=========


        if (sayi%2==0){
            System.out.println("girdiginiz tamsayi cifttir");
        } else {
            System.out.println("girdiginiz sayi tektir");
        }


    }
}
