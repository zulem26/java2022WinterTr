package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        //eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
        //calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz : " + "\nErkek icin E \nKadin icin K harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz : ");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K'){
            if (yas<0 || yas>120){
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println("emekli olamazsin \nDaha" + (60-yas) + "yil daha calismalisin");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet == 'E'){
            if (yas<0 || yas>120){
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<65){
                System.out.println("emekli olamazsin \nDaha" + (65-yas) + "yil calismalisin");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz ");
        }

    }
}
