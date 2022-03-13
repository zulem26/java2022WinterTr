package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //cumartesi veya pazar ise  ==> hafta sonu
        //pazartesi sali carsamba persembe veya cuma ise ==> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("girdiginiz gun haftasonu");
        }else {
            System.out.println("girdiginiz gun hafta ici");
        }



    }

}
